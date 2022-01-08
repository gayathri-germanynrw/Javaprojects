import de.rhistel.logic.ConsoleReader;

public class Main {
    private static final int Max_NUMBER_OF_NOTEBOOK_ENTRIES = 10;

    private static final String APPLICATION_INFO = " Programm dient zur Speicherung der Notizen."
            + "\n Die Maximale Anzahl an Elementen ist: " + Max_NUMBER_OF_NOTEBOOK_ENTRIES
            + "\n Notizen können hinzugefügt oder gelöscht werden. Die Daten sind solange vorhanden,"
            + "\n solange das Programm ausgeführt wird."
            + "\n Viel Spaß mit diesem Programm.";

    private static final String APPLICATION_HEADER = "############################\n"
            + "#      Schwarzes Buch      #\n"
            + "############################\n#";
    private static final String APPLICATION_HEADERMENUE = "\n # Menü - Auswahl";

    private static final String PASSWORT_WRONG = "Das eingegebene Passwort ist falsch!";

    private static final int USERPASSWORT = 1111;

    private static final String MENUE_OPTION_EXIT = " 0. Das Programm beenden";
    private static final String MENUE_OPTION_SHOW = " 1. Liste anzeigen";
    private static final String MENUE_OPTION_ADD = " 2. Neues Notiz einfügen";
    private static final String MENUE_OPTION_DEL = " 3. Eine Notiz löschen";
    private static final String MENUE_OPTION_INFO = " 4. Info über dieses Programm";
    private static final String MENUE_ASK = "Welche Option möchjtest du?";

    private static String[] strNoticeEntries = new String[Max_NUMBER_OF_NOTEBOOK_ENTRIES];


    /**
     * Startet die Eigentliche Applikation.
     *
     * @param args
     */
    public static void main(String[] args) {
        int iPasswort;

        printApplicationHeader();
        startNoticeProgramm();
    }

    private static void startNoticeProgramm() {
        if (askPasswort() == true) {
            showNoticeMenue();
        } else {
            System.out.println(PASSWORT_WRONG);
        }
    }

    private static boolean askPasswort() {
        int iEingabePasswort;

        iEingabePasswort = ConsoleReader.in.readPositivInt();

        if (iEingabePasswort == USERPASSWORT) return true;

        return false;
    }

    private static void printApplicationHeader() {
        System.out.println(APPLICATION_HEADER);
    }

    private static void printApplicationHeaderMenue() {
        System.out.println(APPLICATION_HEADERMENUE);
    }


    private static void showNoticeMenue() {
        int iMenueAuswahl;
        String[] strMenue = {
                MENUE_OPTION_EXIT,
                MENUE_OPTION_SHOW,
                MENUE_OPTION_ADD,
                MENUE_OPTION_DEL,
                MENUE_OPTION_INFO
        };

        printApplicationHeader();

        do {
            printApplicationHeaderMenue();
            for (int index = 0; index < strMenue.length; index++)
                System.out.println(strMenue[index]);

            System.out.print(MENUE_ASK);
            do {
                iMenueAuswahl = ConsoleReader.in.readPositivInt();

                if (iMenueAuswahl >= strMenue.length) {
                    System.out.println("Kein Menüeintrag vorhanden!");
                }
            } while (iMenueAuswahl >= strMenue.length);

            switch (iMenueAuswahl) {
                case 0 -> System.out.println("Auf Wiedersehen!");
                case 1 -> noticeShowListEntries();
                case 2 -> noticeAddListEntrie();
                case 3 -> noticeDelListEntrie();
                case 4 -> noticeInfo();
                default -> System.out.println("Irgendwas stimmt nicht!! Error!!");
            }
        } while (iMenueAuswahl != 0);
    }

    private static void noticeShowListEntries() {
        for (int index = 0; index < strNoticeEntries.length; index++) {
            System.out.println(" " + (index + 1) + " " + strNoticeEntries[index]);
        }
    }

    private static void noticeAddListEntrie() {
        String userInput;
        boolean bListEntryOK = false;
        int iIndex = 0;

        userInput = ConsoleReader.in.readString();

        while (iIndex < strNoticeEntries.length && bListEntryOK == false) {
            if (strNoticeEntries[iIndex] == null || strNoticeEntries[iIndex].isEmpty()) {
                bListEntryOK = true;
            } else iIndex++;
        }

        if (bListEntryOK == true) strNoticeEntries[iIndex] = userInput;
        else strNoticeEntries[strNoticeEntries.length - 1] = userInput;
    }

    private static void noticeDelListEntrie() {
        int iDelIndex;
//        int iIndex = 1;

        noticeShowListEntries();
        System.out.print("Weclhe der Nummern soll gelöscht werden?");

        do {
            iDelIndex = ConsoleReader.in.readPositivInt();
        } while (iDelIndex > Max_NUMBER_OF_NOTEBOOK_ENTRIES);

        if (iDelIndex == Max_NUMBER_OF_NOTEBOOK_ENTRIES) {
            strNoticeEntries[Max_NUMBER_OF_NOTEBOOK_ENTRIES - 1] = null;
        }
        else {
            for (int iIndex = 0; iIndex < (Max_NUMBER_OF_NOTEBOOK_ENTRIES -2); iIndex++)
                //for (iIndex= Max_NUMBER_OF_NOTEBOOK_ENTRIES; iIndex > iDelIndex; iIndex--) {
                if (iIndex >= (iDelIndex - 1)) {
                    strNoticeEntries[iIndex] = strNoticeEntries[iIndex +1];
                }

            strNoticeEntries[Max_NUMBER_OF_NOTEBOOK_ENTRIES -1] = null;
        }

/*          Oder diese Variante
            while (iDelIndex <= (Max_NUMBER_OF_NOTEBOOK_ENTRIES - iIndex) && (Max_NUMBER_OF_NOTEBOOK_ENTRIES > iIndex)) {
                strNoticeEntries[Max_NUMBER_OF_NOTEBOOK_ENTRIES - iIndex -1] = strNoticeEntries[Max_NUMBER_OF_NOTEBOOK_ENTRIES - iIndex];
                System.out.println(iIndex);
                iIndex++;
            }
*/
/*
            for (iIndex = 1; iIndex <= strNoticeEntries.length; iIndex++) {
                if (iIndex >= iDelIndex) {
                    if (strNoticeEntries[iIndex - 1] != null && strNoticeEntries[iIndex - 1].isEmpty() != false)
                        strNoticeEntries[iIndex - 1] = strNoticeEntries[iIndex];
                }

                //strNoticeEntries[iIndex] = "";
            }
*/

    }

    private static void noticeInfo() {
        printApplicationHeader();
        System.out.println(APPLICATION_INFO);
    }

}
