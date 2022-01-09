package de.ui;

import de.logic.CsvFileHandler;
import de.model.Kontakte;
import de.model.DatenBankTelefonBuch;
import de.settings.AppCommands;
import de.settings.AppTexts;
import java.util.List;
import java.util.Scanner;

public class UiController {
    private Scanner scanner = new Scanner(System.in);
    DatenBankTelefonBuch tb = new DatenBankTelefonBuch();
    Kontakte objKontakte = new Kontakte();
    List<Kontakte> Telefonbuch=;

    public void startUi(){
        mainMenu();
    }

   // mainMenu , Alle kommande zur verfügung
    private void mainMenu() {
        boolean exitApplication = false;
        printMainMenu();
       // int iBenutzerEingabe = Integer.parseInt(scanner.nextLine());
        int iBenutzerEingabe = scanner.nextInt();
        while (!exitApplication) {

            switch (iBenutzerEingabe) {

                case AppCommands.CMD_HINZUFÜGEN -> Hinzufügen(objKontakte);
                case AppCommands.CMD_ZEIGEN -> zeigen();
                case AppCommands.CMD_SUCHEN -> Suchen();
                case AppCommands.CMD_LÖSCHEN -> Löschen();
                case AppCommands.CMD_CSVDATEISPEIZERN -> csvDateiSpeichern();
                case AppCommands.CMD_EXIT -> exitApplication = true;
                default -> System.out.println("Bitte wählen einen Option \n");
            }

        }

    }
    // drücken die appilcation Header und main Menu
    private void printMainMenu(){
        System.out.println(AppTexts.APPLICATION_NAME);
        System.out.println(AppTexts.MENUE_AUSWAHL);
        System.out.println(AppTexts.WUNSCH);
    }

     // Löschen ein Kontakt
    private void Löschen() {
        System.out.println("Geben Sie die zu entfernende Rufnummer ein:");
        Long ln1 = Long.parseLong(scanner.nextLine());
        System.out.println("Möchten Sie den Kontakt entfernen (J/N):");
        char cChar = scanner.nextLine().charAt(0);
        if (cChar =='J' ) {

            boolean f1 = removeContact(ln1);
            if (f1)
                System.out.println("Der Kontakt wird erfolgreich gelöscht");
            else
                System.out.println("Kontakt wird nicht gefunden");
        }
        if (cChar == 'N') {
            System.out.println("ok");
        }
    }

    //löschen einen Kontakt

    public boolean removeContact(long telefonnummer) {

        boolean f = false;
        for (Kontakte obj : Telefonbuch) {
            if (obj.getlTelefonnummer() == telefonnummer) {
                f = true;
                Telefonbuch.remove(obj);

                break;
            }
        }
        return f;
    }


    // Suchen eien Kontakt
    private void Suchen() {
        System.out.println("Geben Sie die Telefonnummer für die Kontaktsuche ein:");
        Long ln1 = Long.parseLong(scanner.nextLine());
        Kontakte obj1 = viewContactGivenPhone(ln1);
        System.out.println("Der Kontakt ist:");
        System.out.println("Vorname:" + obj1.getStrVorname());
        System.out.println("Nachname:" + obj1.getStrNachname());
        System.out.println("Telefonnummer.:" + obj1.getlTelefonnummer());
        System.out.println("Email:" + obj1.getStrEmail());
    }

    //Kontakt suchen, wenn Telephone Nummber abgeben.
    public Kontakte viewContactGivenPhone(long telefonnummer) {
        Kontakte obj = new Kontakte();

        for (Kontakte obj1 : Telefonbuch) {
            if (obj1.getlTelefonnummer() == telefonnummer) {
                obj = obj1;
            }
        }
        return obj;
    }



    // Alle Kontakte Zeigen
    private void zeigen() {
        //region 1. Kontakte Anzeigen
            System.out.println("Die Kontakte in der Liste sind:");
            List<Kontakte> listKontakte = tb.viewAllContacts();

            for (Kontakte temp : listKontakte) {
                System.out.println("Vorname:" + temp.getStrVorname());
                System.out.println("Nachname:" + temp.getStrNachname());
                System.out.println("Telefonnummer.:" + temp.getlTelefonnummer());
                System.out.println("Email:" + temp.getStrEmail());
            }

    }

    // Kontakte im TelefonBuch Hinzufügen
    private void Hinzufügen(Kontakte objKontakte) {
        {

            System.out.println("Kontakt hinzufügen: ");
            System.out.println("Vorname eingeben: ");
            objKontakte.setStrVorname(scanner.nextLine());
            System.out.println("Nachname eingeben: ");
            objKontakte.setStrNachname(scanner.nextLine());
            System.out.println("Telefonnummer eingeben. : ");
            objKontakte.setlTelefonnummer(Long.parseLong(scanner.nextLine()));
            System.out.println("Email eingeben: ");
            objKontakte.setStrEmail(scanner.nextLine());
            Telefonbuch.add(objKontakte);

        }

    }
    private void csvDateiSpeichern() {
        CsvFileHandler csv = new CsvFileHandler();
        csv.createCSVFile(tb);
    }

}
