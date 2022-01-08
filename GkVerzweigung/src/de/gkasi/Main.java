package de.gkasi;



/**
 * Einstiegspunkt in die Applikation,
 * welche einfache Verzweigungen/Bedingung/If-Anweisungen
 * und Mehrfachverzweigungen / Switch Case zeigt.
 */
public class Main {

    /**
     * Startet die Eigentliche Applikation.
     *
     * @param args
     */
    public static void main(String[] args) {
        //Decl. and Init
        final int    iMinBdayAge    = 18;
        final int    iPartyAge      = 19;
        final int    iAdultHoodAge  = 25;
        final String strHomeOfShrek = "WeitWeitWeg - Am Schlammtümpel";

        int    iGuestAge    = 34;
        String strGuestName = "Shrek";
        String strGuestCity = "WeitWeitWeg - Am Schlammtümpel";

        System.out.println("#######################");
        System.out.println("# Zum verrückten Esel #");
        System.out.println("#######################");

        System.out.println("\nEingangskontrolle - Ausweis zeigen:");
        System.out.println("\n==================");
        System.out.println("Ausweis");
        System.out.println("==================");

        System.out.println("Alter\t:\t" + iGuestAge);
        System.out.println("Name\t:\t" + strGuestName);
        System.out.println("Wohnort\t:\t" + strGuestCity);

        //Nachricht an den Gast
        String strGuestWelcomeMessage = "";

        //Alterscheck
        if (iGuestAge > iMinBdayAge) {

            //Türsteher Sicherheitsfrage
            System.out.println("\nGestiefelter Kater: Hey wo wohnst du du bist doch nicht Shrek:\n");
            System.out.println(strGuestCity);

            //Ortsabfrage ist Shrek auch Shrek oder ist das ein Hochstabler
            if (strGuestCity.equals(strHomeOfShrek)) {

                //Willkommensnachricht
                strGuestWelcomeMessage = "Willkommen " + strGuestName + "\nNice alles gut =D";
            } else {
                strGuestWelcomeMessage = "\nHEY DU BIST ABER NICHT SHREK GEH NACH HAUSE KEINER MAG HOCHSTABLER!!!";
            }

        } else if (iGuestAge == iMinBdayAge) {
            strGuestWelcomeMessage = "Willkommen und alles Gute zum Geburtstag";
        } else {
            strGuestWelcomeMessage = "Kein Zutritt für Kinder und Jugendliche";
        }


        //Ausgabe der Einheiltung
        System.out.println(strGuestWelcomeMessage);

        //PartyMessage
        String strPartyMessage = "";

//		switch (iAge) {
//			case iMinBdayAge:
//				strPartyMessage = "Lass die Sau raus Yolo =)";
//				break;
//			case iPartyAge:
//				strPartyMessage = "Wilkommen PARTEEEEYYY WHOOOOOP =D";
//				break;
//			case iAdultHoodAge:
//				strPartyMessage = "Wilkommen lieber " + strGuestName + ", Wohl bekomms und viel Spaß";
//				break;
//			default:
//				strPartyMessage = "Have fun ;D";
//
//		}

        strPartyMessage = switch (iGuestAge) {
            case iMinBdayAge -> "Lass die Sau raus Yolo =)";
            case iPartyAge -> "Wilkommen PARTEEEEYYY WHOOOOOP =D";
            case iAdultHoodAge -> "Wilkommen lieber " + strGuestName + ", Wohl bekomms und viel Spaß";
            default -> "Have fun ;D";
        };

        System.out.println(strPartyMessage);

        boolean weGoHome = true;

        if (weGoHome) {
            System.out.println("Ab zu Megges");
        } else {
            System.out.println("Wir bleiben 3 Tage wache");
        }

//		if (!(iAge >= iMinAge)) {
//			System.out.println("Kein Zutritt");
//		} else {
//			System.out.println("Willkommen " + strName);
//		}
    }
}
