package de.gkasi.logic;


import de.gkasi.model.Note;



import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;


/**
 * TODO 2
 * TODO 2.1 Singleton Konzept dann Testet
 * TODO 2.2 Speichern dann testen
 * TODO 2.3 Lesen dann testen
 * Diese Klasse speichert
 * die Daten dieses Programmes
 * in eine eigene<br>
 * <b>C</b>har / Commma-<b>S</b>eparated <b>V</b>alues - Datei.
 * Diese befindet sich unter src/de/xxeuerpackagename/resources/notes.csv.<br>
 * Heisst hier in diesem Projekt befindet sich die Datei konkret<br>
 * src/de/rhistel/resources/notes.csv
 * Das Resourcepackage ist ein ganz normales Packes was mit Rechtsklick->New->Package
 * generiert wird. Danach muss dieses Package aber auch als Resouces-Package markiert
 * werden sonst kann es nach Auslieferung des Programmes als Jar-Datei zu fehlern kommen.
 * Siehe hochgeladene Screenshots
 * <p>
 * Diese Klasse ist ein soganannter Singleton.
 * Da Sie selbst Ihre eigene einzige Instanz beim
 * ersten gebrauch anlegt und ansonsten diese nur zurueck liefert.
 * <p>
 * Singleton nutzt man immer dann wenn es um
 * Datei,Netzwerk/Internet/Datenbankzugriff geht.
 * <p>
 * Aufbau eines Singleton in drei Schritten:
 * <p>
 * 1.) Private statische Instanz der Klasse
 * 2.) Privater Konstruktor
 * 3.) Oeffentliche Statische synchronisierten Getter
 * <p>
 * Diese Klasse stellt
 * einen Threadsicheren und
 * Dateizugriff zur verfuegung.
 * <p>
 */




public class CsvFileHandler {

    //region 0. Konstanten
    /**
     * Rechtsklick auf resource Package Copy Path -> Path from Content Root
     */
    private static final String CSV_FILE_PATH = "src/de/gkasi/resource/notes.csv";
    //endregion
    //region 1. Decl and Init Attribute
    /**
     * Einzige Instanz die jemals existieren wird.
     * Wird in der getOnlyInstanceOfThisClassEver()
     * Einmal generiert. Alle anderen Klassen koennen
     * druch den privaten Konstruktor {@link CsvFileHandler#CsvFileHandler()}
     * keine Objekte mit anlegen:
     * CsvFileHandler csvFileHandler = new CsvFileHandler() -> Geht einzig in allein
     * nur in der Klasse CsvFileHandler
     */

    private static CsvFileHandler onlyInstanceOfThisClassEver;

    //region 2. Konstruktoren

    /**
     * Privater Konstruktor
     * Nur diese Klasse selbst
     * soll bei dem Aufruf der
     * Funktion getOnlyInstanceOfThisClassEver();
     * ein einziges mal das Attribute Csv
     */
    private CsvFileHandler() {
        System.out.println(CsvFileHandler.class.getSimpleName() + " generiert");
    }

//endregion

    //region 3. GetOnlyInstanceOfThisClassEver

    /**
     * Instanziiert beim ersten Aufruf(egal wo und wann dieser geschieht)
     * die einzige Instanz die es zur gesamten Laufzeit des Programmes
     * geben wird und liefert diese zurueck. So dass die Funktionen und Methoden
     * dieser Klasse synchronisiert Thread und Zugriffssicher genutzt werden koennen
     *
     * @return :instance: {@link CsvFileHandler} : Einzige Instanz die jemals zur Laufzeit exisitieren wird.
     */

    public static synchronized CsvFileHandler getOnlyInstanceOfThisClassEver() {
      //Checken ob das Objekt schonmal generiert wurde. Ist das so ist es nicht null

        if(onlyInstanceOfThisClassEver==null){
            //Generiert diese Instanz ein einziges mal
            onlyInstanceOfThisClassEver=new CsvFileHandler();
        }

        return onlyInstanceOfThisClassEver;
    }
    //region 4. Speichern

    /**
     * Speichert die mitgelieferte {@link List} von {@link Note}s
     * in eine CSV-Datei
     *
     * @param noteListToSave : {@link List} {@link Note}s : die gespeichert werden sollen
     */
    public void saveToCsvFile(List<Note> noteListToSave) {

        //0. Anlegen eins Dateiobjektes
        File csvFile = new File(CSV_FILE_PATH);


        //1. Informationen :/ und Weg zur Datei kann nur in Bytes schreiben
        FileOutputStream fos = null;


        //2. Schreibt in Byte :/ und setzt den Zeichensatz
        OutputStreamWriter osw = null;

        //3. Schreibt Strings :)
        BufferedWriter out = null;

        try {
            //Checken ob es Diese datei bereits gibt
            if (!csvFile.exists()) {

                //Anlegen sollte keine Datei existieren
                csvFile.createNewFile();
            }

            //1. Fos generieren mit Dateiobjekt generieren
            fos = new FileOutputStream(csvFile);

            //2. osw Zeichensatz setz mit dem fos
            osw = new OutputStreamWriter(fos, StandardCharsets.UTF_8);

            //3. out mit osw generieren
            out = new BufferedWriter(osw);

            //4. Gesamte Liste durchwandern
            for (Note n : noteListToSave) {

                //In Zwischenspeicher von BufferedWirter reinschreiben
                out.write(n.getAllAttributesAsCsvString() + "\n");
            }


        } catch (Exception e) {
            System.err.println(CSV_FILE_PATH);
            e.printStackTrace();
        } finally {

            if (out != null) {
                try {
                    //5. Immer Inhalt in die Datei schreiben egal ob eine Exception auftritt oder nich
                    out.flush();

                    //6. Verbindung zur Datei schließen
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
     * Liest sollte die Datei {@link CsvFileHandler#CSV_FILE_PATH}
     * existieren den kompletten Inhalt aus und gibt eine {@link List}e von
     * passenden Models zureuck
     *
     * @return noteListFromFile : {@link List} - {@link Note} : Notizen aus der Datei
     */
    public List<Note> readFromCsvFile() {
        //0. Liste von Filmen
        List<Note> noteListFromFile = new ArrayList<>();

        //1. Anlegen eins Dateiobjektes
        File csvFile = new File(CSV_FILE_PATH);

        //1. Informationen :/ und Weg zur Datei kann nur in Bytes lesen
        FileInputStream fis = null;

        //2. Liest in Byte :/ und setzt den Zeichensatz
        InputStreamReader isr = null;

        //3. Liest Strings :)
        BufferedReader in = null;

        try {
            //Checken ob es Diese datei bereits gibt
            if (csvFile.exists()) {

                //1. Fis generieren mit Dateiobjekt generieren
                fis = new FileInputStream(csvFile);

                //2. isr Zeichensatz setzen mit dem fis
                isr = new InputStreamReader(fis, StandardCharsets.UTF_8);

                //3. in mit isr generieren
                in = new BufferedReader(isr);

                //End Of File
                boolean eof = false;

                //4. Sonalge das Ender der Datei nicht erreicht ist
                while (!eof) {

                    //5. Aktuelle Zeile der Datei auslesen
                    String strReadCsvLine = in.readLine();

                    //6. Checken ob das Ende der Datei erreicht ist
                    if (strReadCsvLine == null) {
                        eof = true;
                    } else {
                        //Ende der Datei noch nicht erreicht

                        //Neues Objekt anlegen
                        Note currentNote = new Note();

                        //Mit Daten befuellen
                        currentNote.setAllAttributesFromCsvLine(strReadCsvLine);

                        //Objekt in die Liste machen
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
                    //5. Immer Inhalt in die Datei schreiben egal ob eine Exception auftritt oder nich
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