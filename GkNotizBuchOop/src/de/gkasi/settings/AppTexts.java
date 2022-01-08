package de.gkasi.settings;

public class AppTexts {


    //region 0.0 Allgemein
    public static final String PRIMARY_WORD_PLURAL   = "Notizen";
    public static final String PRIMARY_WORD_SINGULAR = "Notiz";

    public static final String APPLICATION_NAME = "\n\n#########################"
            + "\n#\t  Bernds" + PRIMARY_WORD_PLURAL + "\t\t#"
            + "\n#########################\n\n";

    public static final String ENCLOSED_NUMBER_PREFIX = "[\t";
    public static final String ENCLOSED_NUMBER_SUFFIX = "\t]";
    public static final String USER_CHOICE            =
            "\n\n" + ENCLOSED_NUMBER_PREFIX + " " + ENCLOSED_NUMBER_SUFFIX + "\t";


    //endregion

    //region 0.1 Hauptmenuebefehle und Texte



    public static final String SHOW = ENCLOSED_NUMBER_PREFIX
            +AppCommands.CMD_SHOW + ENCLOSED_NUMBER_SUFFIX + "\t" + PRIMARY_WORD_PLURAL + "\tanzeigen";

    public static final String SAVE_NEW = ENCLOSED_NUMBER_PREFIX
            + AppCommands.CMD_SAVE + ENCLOSED_NUMBER_SUFFIX + "\t" + PRIMARY_WORD_SINGULAR + "\terfassen";

    public static final String EDIT = ENCLOSED_NUMBER_PREFIX
            + AppCommands.CMD_EDIT + ENCLOSED_NUMBER_SUFFIX + "\t" + PRIMARY_WORD_SINGULAR + "\tändern";

    public static final String DELETE = ENCLOSED_NUMBER_PREFIX
            + AppCommands.CMD_DELETE + ENCLOSED_NUMBER_SUFFIX + "\t" + PRIMARY_WORD_SINGULAR + "\tlöschen";


    public static final String EXIT_APPLICATION = "\n" + ENCLOSED_NUMBER_PREFIX
            + AppCommands.CMD_EXIT_BACK + ENCLOSED_NUMBER_SUFFIX + "\tProgramm\tbeenden";

    //endregion

    //region 0.2 Datenerfassung
    public static final String SHOW_HEADER = "\nAlle erfassten " + PRIMARY_WORD_PLURAL + ":\n";

    public static final String INPUT_DATA   = "\n" + PRIMARY_WORD_SINGULAR + "sdaten erfassen:\n";
    public static final String NOTE_TITLE   = PRIMARY_WORD_SINGULAR + "titel\t:";
    public static final String NOTE_CONTENT = PRIMARY_WORD_SINGULAR + "inhalt\t:";

    public static final String INPUT_NOTE_TITLE   = "\n\n" + NOTE_TITLE + "\t";
    public static final String INPUT_NOTE_CONTENT = "\n\n" + NOTE_CONTENT + "\t";
    ;

    public static final String SHOW_SINGLE_ENTRY_PATTERN =
            "\n[\t%d\t]\t" + NOTE_TITLE + "\t%s\t" + NOTE_CONTENT + "\t%s";

    public static final String CHOOSE_A_ENTRY =
            "\nBitte wählen Sie eine der oben aufgeführten " + PRIMARY_WORD_PLURAL + " aus, in dem Sie die passende Zahl innerhalb der "
                    + ENCLOSED_NUMBER_PREFIX + ENCLOSED_NUMBER_SUFFIX + " eingeben (0 bis %d):\n";


    //endregion

    //region 0.3 Usernachrichten
    public static final String USER_MSG_PREFIX = "\n\n>>>> ";
    public static final String USER_MSG_SUFFIX = " <<<<\n\n";

    public static final String USER_MSG_NO_SUCH_OPTION =
            USER_MSG_PREFIX + "Diese Option gibt es nicht." + USER_MSG_SUFFIX;

    public static final String USER_MSG_EXIT_APPLICATION =
            USER_MSG_PREFIX + "Programm wird beendet" + USER_MSG_SUFFIX;

    public static final String USER_MSG_NO_ENTRIES_YET =
            USER_MSG_PREFIX + "Es sind noch keine " + PRIMARY_WORD_PLURAL + " erfasst worden." + USER_MSG_SUFFIX;

    public static final String USER_MSG_NO_ENTRIES_TO_EDIT = USER_MSG_PREFIX +
            "Es wurden noch keinerlei " + PRIMARY_WORD_PLURAL + " gespeichert. Daher kann keine " + PRIMARY_WORD_SINGULAR + " geändert werden" + USER_MSG_SUFFIX;

    public static final String USER_MSG_NO_ENTRIES_TO_DELETE = USER_MSG_PREFIX +
            "Es kann nichts gelöscht werden was noch nicht existiert." + USER_MSG_SUFFIX;

    public static final String USER_MSG_INCORRECT_INPUT_DATA = USER_MSG_PREFIX
            + "Bitte geben Sie die Eingabedaten richtig ein:\n"
            + "\n- Die Texte dürfen nicht leer und mindestens ein Zeichen lang sein."
            + USER_MSG_SUFFIX;

    /**
     * Minimale Anzahl an Zeichen die eingeben werden müssen
     */
    public static final int MIN_CHARS_TO_INPUT = 1;
    //endregion


    //region 0.4 Benutzerfragen
    public static final String USER_QUESTION_DELETE_THIS_ENTRY = USER_MSG_PREFIX
            + "Möchten Sie diese " + PRIMARY_WORD_SINGULAR + " löschen?";
    //endregion

    //endregion

}
