package de.gkasi.ui;

import de.gkasi.model.Note;
import de.gkasi.logic.CsvFileHandler;

import java.util.*;


import de.rhistel.logic.ConsoleReader;
import de.gkasi.settings.AppCommands;
import de.gkasi.settings.AppTexts;

/**
 * Einstiegspunkt
 * in Bernds Einfache Notizen
 */
public class UiController {


    //region 1. Klassen Variablen
    private static String[] strNotes = {
            "Einkaufen, Tomaten",
            "Sportshow,Meeting",
            "Kaptiel 7, schreiben",
            "Neues Haus, renovieren",
            "Tomas, anrufen",
            "Arzttermin, Morgen",
            "Banktermin, Kontomodell umstellen",
            "BuHa, Rechnungen stellen",
            "Werbung, Angebote schreiben",
            ""
    };
    //endregion

    private List<Note> notes;

    public UiController() {

       // notes = new ArrayList<Note>();
        this.notes = CsvFileHandler.getOnlyInstanceOfThisClassEver().readFromCsvFile();

    }


    /**
     * Startet das UserInterface fuer
     * die CRUD Opartion der Notes
     */
    public void startUi() {

        showMainMenu();
    }
    //endregion

    //region 4. Hauptmenu

    /**
     * Zeigt Hauptmenu immer wieder solange
     * der User nicht das Programm beendet
     */
    private void showMainMenu() {
        //Decl. and Init
        boolean exitApplication = false;

        while (!exitApplication) {
            //Hauptmenu auf der Konsole ausgeben lassen
            printMainMenu();

            //Eingabe des Users checken und passende CRUD triggern oder Schleife verlassen
            switch (getUserChoice()) {
                case AppCommands.CMD_SHOW -> show();
                case AppCommands.CMD_SAVE -> save();
                case AppCommands.CMD_EDIT -> edit();
                case AppCommands.CMD_DELETE -> delete();
                case AppCommands.CMD_EXIT_BACK -> exitApplication = true;
                default -> System.out.println(AppTexts.USER_MSG_NO_SUCH_OPTION);
            }
        }
    }


    /**
     * Druckt nur das Hauptmenu aus:
     */
    private void printMainMenu() {
        System.out.println(AppTexts.APPLICATION_NAME);

        System.out.println(AppTexts.SHOW);
        System.out.println(AppTexts.SAVE_NEW);
        System.out.println(AppTexts.EDIT);
        System.out.println(AppTexts.DELETE);

        System.out.println(AppTexts.EXIT_APPLICATION);
    }

    //endregion

    //region 5. Anzeigen

    /**
     * Zeigt alle Eintraege an
     * sollte es welche geben
     */
    private void show() {
        //Nur ausgeben wenn die Liste nicht leer ist
        if (!this.notes.isEmpty()) {

            //Ueberschrift
            System.out.println(AppTexts.SHOW_HEADER);

            //Alle Eintraege durchlaufen
            for (int index = 0; index < this.notes.size(); index++) {

                //Aktueller Eintrag aus der Liste lesen
                Note currentNote = this.notes.get(index);

                //Ausgabe des Eintrags mit formatiertem String
//                System.out.printf("-----1111------"+currentNote.getStrTitle());
//                System.out.println("------22222-----"+currentNote.getStrNoteContent());
//                System.out.println("------->"+currentNote.getStrTitle() +"--------->"+ currentNote.getStrNoteContent());


                //Ausgabe des Eintrags mit formatiertem String
                System.out.printf(AppTexts.SHOW_SINGLE_ENTRY_PATTERN, index,
                        currentNote.getStrTitle(), currentNote.getStrNoteContent());
            }


        } else {

            //UserHinweis Liste ist leer
            System.out.println(AppTexts.USER_MSG_NO_ENTRIES_YET);
        }
    }


    //endregion

    //region 6. Speichern

    /**
     * Speichert eine Eintrag
     */
    private void save() {

        //Eingabedaten auslesen
        Note noteToSave = this.getNoteFromUi();

        //Checken ob diese korrekt waren
        if (noteToSave != null) {
            System.out.println("noteToSave--->" + noteToSave);
            this.notes.add(noteToSave);
            this.show();
        } else {
            //UserMsg keine korrekten Eingabedaten
            System.out.println(AppTexts.USER_MSG_INCORRECT_INPUT_DATA);
        }
    }
    //endregion

    //region 7. Bearbeiten

    /**
     * Aendert eine Eintrag nach dem
     * der User einen Validen Index
     * eingegeben hat.
     */
    private void edit() {

        //Nur bearbeiten wenn die Liste befuellt ist.
        if (!this.notes.isEmpty()) {

            //Alle Eintraege Anzeigen
            this.show();

            //Liest einen validen Index ein
            int indexOfNoteToEdit = this.getValidIndex();

            //Eingabedaten auslesen
            Note noteToEdit = this.getNoteFromUi();

            //Checken ob diese korrekt waren
            if (noteToEdit != null) {

                //Eintrag ersetzen
                this.notes.set(indexOfNoteToEdit, noteToEdit);

                //Alles anzeigen
                this.show();

            } else {
                //UserMsg keine korrekten Eingabedaten
                System.out.println(AppTexts.USER_MSG_INCORRECT_INPUT_DATA);
            }
        } else {

            //Userhinweis Leerliste kann nicht bearbeitet werden
            System.out.println(AppTexts.USER_MSG_NO_ENTRIES_TO_EDIT);
        }

    }












    //endregion

    //region 8. Loeschen

    private void delete() {

        //Nur loeschen wenn die Liste nicht leer ist
        if (!this.notes.isEmpty()) {

            //Alle Eintraege anzeigen
            this.show();

            //Liest einen Validen Index ein
            int indexOfNoteToDelete = this.getValidIndex();


            //Eingabeaufforderung
            System.out.println(AppTexts.USER_QUESTION_DELETE_THIS_ENTRY);
            boolean answerIsYes = ConsoleReader.in.readMandatoryAnswerToBinaryQuestion();

            //Check die Antwort
            if (answerIsYes) {
                //Eintrag loeschen
                this.notes.remove(indexOfNoteToDelete);

                //Alles anzeigen
                this.show();
            }

        } else {

            //Userhinweis in einer nicht populierten Liste kann nichts geloescht werden
            System.out.println(AppTexts.USER_MSG_NO_ENTRIES_TO_DELETE);
        }

    }
    //endregion

    //region 9. Hilfsmethoden und Funktionen

    /**
     * Druckt die Usereingabeaufforderung aus und gibt den
     * Eingabewert zuruek
     *
     * @return iUserChoice : int : Einglesener Intwert >= 0;
     */
    private int getUserChoice() {
        System.out.print(AppTexts.USER_CHOICE);
        return ConsoleReader.in.readPositivInt();
    }


    /**
     * Liest die Eingabedaten des User aus
     * checkt diese auf ihre Gueltigkeit. Sind+
     * die Daten richtig wird eine neue Eintrag generiert.
     * Mit den Wert befuellt und zurueck geliefert.
     *
     * @return noteFromUi : {@link Note} : Befuellte Note : oder null
     *
     */
    private Note getNoteFromUi() {
        //Decl. and Init
        Note noteFromUi = null;

        final int indexTitle = 0;
        final int indexContent = 1;

        boolean isUiDataValid = true;

        //Eingabedaten auslesen
        String[] strInputData = this.getInputData();

        //Eingabedatenarray durchlaufen
        for (String strCurrentInput : strInputData) {

            //Mindestlaenge check
            if (!(strCurrentInput.length() >= AppTexts.MIN_CHARS_TO_INPUT)) {
                isUiDataValid = false;
            }
        }

        //Waren die Eingabedaten korrekt
        if (isUiDataValid) {
            //Ja dann mache einen neuen Eintrag mit den eingeben Daten
            noteFromUi = new Note(strInputData[indexTitle], strInputData[indexContent]);
        }

        return noteFromUi;
    }

    /**
     * Gibt die Eingabeaufforderung aus und liest
     * die Eingabedaten ein.
     *
     * @return strInputtedData : {@link String} [] : Eingelesene Eingabedaten
     */
    private String[] getInputData() {
        //Decl. and Init
        System.out.println(AppTexts.INPUT_DATA);

        System.out.print(AppTexts.INPUT_NOTE_TITLE);
        String strInputTitle = ConsoleReader.in.readMandatoryString();

        System.out.print(AppTexts.INPUT_NOTE_CONTENT);
        String strInputContent = ConsoleReader.in.readMandatoryString();

        System.out.println("strInputContent---inside getInputData[]->" + strInputContent);

        return new String[]{
                strInputTitle,
                strInputContent
        };
    }

    /**
     * Gibt einen validen Index zurueck.
     *
     * @return inputIndex : int : Valider Index
     */
    private int getValidIndex() {
        int inputIndex = 0;
        final int indexOfLastElement = (this.notes.size() - 1);
        boolean isValidIndex = false;

        //Solange den User einen Index eingeben lassen bis er es richtig macht
        while (!isValidIndex) {

            //Eingabeaufforderung
            System.out.printf(AppTexts.CHOOSE_A_ENTRY, indexOfLastElement);

            //Index eingeben lassen
            inputIndex = ConsoleReader.in.readPositivInt();

            //Index Auswertungswert wird de Variable zugewiesen
            isValidIndex = ((inputIndex >= 0)) && ((inputIndex <= indexOfLastElement));
        }

        return inputIndex;
    }
    //endregion

}