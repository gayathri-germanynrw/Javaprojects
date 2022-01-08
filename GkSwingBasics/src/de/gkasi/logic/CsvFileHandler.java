package gkasi.logic;

import gkasi.model.SimpleNote;


import java.io.*;
import java.nio.charset.StandardCharsets;

/**
 * Speichert eine Notiz in einer Datei im
 * resourceordener. Klasse ist eine Singleton
 * TODO 4. CSV-File Handler koennt ihr kopieren
 */
public class CsvFileHandler {

    //region 0. Konstanten
    private static final String CSV_FILE_PATH = "src/gkasi/resource/simpleNote.csv";
    //endregion

    //region 1. Decl and Init Attribute
    private static CsvFileHandler instance;
    //endregion

    //region 2. Konstruktoren

    /**
     * Standarkonsturktor
     */
    private CsvFileHandler() {
        //Nichts zu tun
    }

    //endregion

    //region 3. Get Instance

    /**
     * Gibt die einzige Instanz zurueck und das Threadsicher
     *
     * @return instance : {@link CsvFileHandler} : Einzige threadsichere Instanz
     */
    public static synchronized CsvFileHandler getInstance() {
        if (instance == null) {
            instance = new CsvFileHandler();
        }

        return instance;
    }
    //endregion

    //region 4. Speichern

    /**
     * Speichert eine Notiz in einer Datei
     *
     * @param simpleNoteToSave : {@link SimpleNote} : Einfache Notiz
     */
    public void saveSimpleNoteToCsvFile(SimpleNote simpleNoteToSave) {

        File fileToSave = new File(CSV_FILE_PATH);

        FileOutputStream   fos = null;
        OutputStreamWriter osw = null;
        BufferedWriter     out = null;

        try {
            if (!fileToSave.exists()) {
                fileToSave.createNewFile();
            }

            fos = new FileOutputStream(fileToSave);
            osw = new OutputStreamWriter(fos, StandardCharsets.UTF_8);
            out = new BufferedWriter(osw);

            out.write(simpleNoteToSave.getAllAttributesAsCsvString());

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (out != null) {
                try {
                    out.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }


    }
    //endregion

    //region 5. Lesen

    /**
     * Speichert eine Notiz in einer Datei
     *
     * @return simpleNoteFromCsvFile : {@link SimpleNote} : Einfache Notiz
     */
    public SimpleNote readSimpleNoteFromCsvFile() {

        SimpleNote simpleNoteFromCsvFile = new SimpleNote();

        File fileToRead = new File(CSV_FILE_PATH);

        FileInputStream   fis = null;
        InputStreamReader isr = null;
        BufferedReader    in  = null;

        try {
            if (fileToRead.exists()) {


                fis = new FileInputStream(fileToRead);
                isr = new InputStreamReader(fis, StandardCharsets.UTF_8);
                in  = new BufferedReader(isr);

                boolean eof = false;

                while (!eof) {
                    String strReadLine = in.readLine();

                    if (strReadLine == null) {
                        eof = true;
                    } else {
                        simpleNoteFromCsvFile.setAllAttributesFromCsvLine(strReadLine);
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (in != null) {
                try {
                    in.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }

        return simpleNoteFromCsvFile;
    }
    //endregion
}