package de.gkasi.logic;
import de.gkasi.model.Employee;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

/**
 * TODO 2
 * TODO 2.1 Singleton Concept test
 * TODO 2.2 Save and test
 * TODO 2.3 Read and Test
 * This class saves the data in this Program as
 * <b>C</b>har / Commma-<b>S</b>separated <b>Values</b> - data.
 * We can find this under src/de/gkasi/resource/employees.csv.
 * <p>
 * These class is called as Singleton.
 * It creates own single instanz by first use.
 * <p>
 * Singleton is always used when it comes to File,Network/ Internet, database access goes.
 * <p>
 * b.	Building a Singleton in three steps:
 * 1)	Private static instance of the class.
 * 2)	Private constructor
 * 3)	Public static synchronized getters.
 * <p>
 * These class represents
 * a Threadsafe and File access available.
 * <p>
 */
public class CsvFileHandler {

    //region 0. Constants
    /**
     * Right click from Resource package copy the path  -> Path from Content Root
     */
    private static final String CSV_FILE_PATH = "src/de/gkasi/resource/employees.csv";
    //endregion

    //region 1. Decl and Init Attribute
    /**
     * The only instance that will ever exist.
     * it is available in getOnlyInstanceOfThisClassEver()
     * onetime generated. All other classes can't create object through
     * private constructor {@link CsvFileHandler#CsvFileHandler()}.
     *
     * CsvFileHandler csvFileHandler = new CsvFileHandler() -> Goes alone
     *  only in the CsvFileHandler class
     */
    private static CsvFileHandler onlyInstanceOfThisClassEver;
    //endregion

    //region 2. Construktor

    /**
     * Private constructor
     * It should be calling by
     * Function getOnlyInstanceOfThisClassEver();
     * only in this class itself , with  Attribute Csv
     */
    private CsvFileHandler() {
        System.out.println(CsvFileHandler.class.getSimpleName() + " generiert");
    }

    //endregion

    //region 3. GetOnlyInstanceOfThisClassEver

    /**
     * Instantiated at the first call (no matter where and when this happens)
     * the only instance that is there for the entire runtime of the program
     * will give and deliver them back. So that the functions and methods
     * this class synchronizes thread and can be used in a secure manner
     * @return: instance: {@link CsvFileHandler}: only instance that will ever exist at runtime.
     */
    public static synchronized CsvFileHandler getOnlyInstanceOfThisClassEver() {

        //Check whether the object onetime generated.
        if (onlyInstanceOfThisClassEver == null) {

            //Generate the instance once.
            onlyInstanceOfThisClassEver = new CsvFileHandler();
        }

        return onlyInstanceOfThisClassEver;
    }
    //endregion

    //region 4. save process

    /**
     * Save the delivered  {@link List} von {@link Employee}s
     * in one CSV-Datei
     *
     * @param noteListToSave  : {@link List} {@link Employee}s : it should be saved.
     */
    public void saveToCsvFile(List<Employee> noteListToSave) {

        //0. Creation of a file object
        File csvFile = new File(CSV_FILE_PATH);


        //1. path to the file can only write in bytes
        FileOutputStream fos = null;


        //2. Writes in bytes: / and sets the character set
        OutputStreamWriter osw = null;

        //3.Write Strings
        BufferedWriter out = null;

        try {
            //Check whether this file already exists
            if (!csvFile.exists()) {

                //Create a file , if it is not exist
                csvFile.createNewFile();
            }

            //1. Fos generated with file object
            fos = new FileOutputStream(csvFile);

            //2. osw  Set the character set with the fos
            osw = new OutputStreamWriter(fos, StandardCharsets.UTF_8);

            //3. out with osw generated

            out = new BufferedWriter(osw);

            //4. traverse the entire List
            for (Employee n : noteListToSave) {

                //Write into the buffer of BufferedWirter
                out.write(n.getAllAttributesAsCsvString() + "\n");
            }


        } catch (Exception e) {
            System.err.println(CSV_FILE_PATH);
            e.printStackTrace();
        } finally {

            if (out != null) {
                try {
                    //5. Always write content to the file, regardless of whether an exception occurs or not
                    out.flush();

                    //6. close
                    out.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }

    }


    //endregion

    //region 5. Read

    /**
     * Read the file {@link CsvFileHandler#CSV_FILE_PATH}
     * exist the complete content in and out {@link List}e from
     * respected models back.
     *
     * @return noteListFromFile : {@link List} - {@link Employee} :
     */
    public List<Employee> readFromCsvFile() {
        //0. List
        List<Employee> noteListFromFile = new ArrayList<>();

        //1. create file path
        File csvFile = new File(CSV_FILE_PATH);

        //1. Informationen :/ path to the file can only read in bytes
        FileInputStream fis = null;

        //2. Read in Byte :/ and set the character.
        InputStreamReader isr = null;

        //3. read strings
        BufferedReader in = null;

        try {
            //check whether file created
            if (csvFile.exists()) {

                //1. Fis generated with file object
                fis = new FileInputStream(csvFile);

                //2. isr character set with fis object
                isr = new InputStreamReader(fis, StandardCharsets.UTF_8);

                //3. in with isr generated
                in = new BufferedReader(isr);

                //End Of File
                boolean eof = false;

                //4. until no data are there
                while (!eof) {

                    //5. Read out the current line of the file
                    String strReadCsvLine = in.readLine();

                    //6. Check whether the end of the file has been reached
                    if (strReadCsvLine == null) {
                        eof = true;
                    } else {
                        //End of file not yet reached

                        //Create new object
                        Employee currentNote = new Employee();

                        //Fill with data
                        currentNote.setAllAttributesFromCsvLine(strReadCsvLine);

                        //Make an object in the list
                        noteListFromFile.add(currentNote);
                    }

                }
            }


        } catch (Exception e) {
            System.err.println(CSV_FILE_PATH);
            e.printStackTrace();
        } finally {
            if (in != null) {
                try {
                    //5. Always read content to the file, regardless of whether an exception occurs or not
                    in.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }

        return noteListFromFile;
    }
    //endregion
}