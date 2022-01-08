import de.rhistel.logic.ConsoleReader;

public class Main2 {
    private static final String APPLICATION_HEADER="########   NOTIZ BUCH ##########";
    private static final int MAX_NUM_OF_NOTIZBOOK_ENTRIES=10;
    private static final int USER_ACTUAL_PASSWORT=11;
    private static final String MENU_OPTION_EXIT=" 0. Exit Menu";
    private static final String MENU_OPTION_SHOW="1. Liste Anzeigen ";
    private static final String MENU_OPTION_ADD="2. Neue Notiz Einfügen ";
    private static final String MENU_OPTION_DELETE="3.Eine Notiz Löschen";
    private static final String MENU_OPTION_ÄNDERN="4. Entry in Notizbook ändern ";
    private static final String MENUE_OPTION_INFO = " 5. Info über dieses Programm";
    private static final String MENUE_ASK = "Welche Option möchjtest du?";

    private static final String PRIMARY_WORD_SINGULAR = "Notiz";



    private static final String INPUT_DATA   = "\n" + PRIMARY_WORD_SINGULAR + "sdaten erfassen:\n";
    private static final String NOTE_TITLE   = PRIMARY_WORD_SINGULAR + "titel\t:";
    private static final String NOTE_CONTENT = PRIMARY_WORD_SINGULAR + "inhalt\t:";


    private static final String INPUT_NOTE_TITLE   = "\n\n" + NOTE_TITLE + "\t";
    private static final String INPUT_NOTE_CONTENT = "\n\n" + NOTE_CONTENT + "\t";


    //private static  final String[] strNoticeEntries=new String[MAX_NUM_OF_NOTIZBOOK_ENTRIES];
    private static String[] strNoticeEntries={" Grocery, Grocery2", "Grocery2, apple","Grocery3,orange","kinder,kinderbuch",
            "Grocery2,Banane","Grocery2,Vegetables","kids,Dress",
            "sachen, Stationary"};


    private static void printApplicationHeader(){
        System.out.println(APPLICATION_HEADER);
    }

    private static void startNotizProgram() {
        int iUserPasswort= ConsoleReader.in.readPositivInt();
        if(iUserPasswort==USER_ACTUAL_PASSWORT){
            System.out.println("Willkommen ");
        }else{
            System.out.println("Check ur Username and Passwort ");
        }

        showNotizMenu();
    }

    private static void showNoticeEntries() {

         for (int iIndexOfEntry=0;iIndexOfEntry<strNoticeEntries.length;iIndexOfEntry++){
             System.out.println(iIndexOfEntry + " " + strNoticeEntries[iIndexOfEntry]);

          }

    }




    private static void AddNotizBuchEntries() {
       String strNoteToInsert= getNoteFromUI();
       if(strNoteToInsert!=null){
           boolean InsertedEmptySpot=false;
           for(int iNoteindex=0;iNoteindex<strNoticeEntries.length;iNoteindex++){
               if((strNoteToInsert.equals("")) &&(!InsertedEmptySpot)){
                   strNoticeEntries[iNoteindex]=strNoteToInsert;
                   InsertedEmptySpot=true;
               }
           }
         if(!InsertedEmptySpot){
             strNoticeEntries[strNoticeEntries.length-1]=strNoteToInsert;

         }
           showNoticeEntries();

       }else{
           System.out.println("Incorrect Data");
       }


    }

    private static String getNoteFromUI() {
        String strNoteFromUi = null;

        final int indexTitle   = 0;
        final int indexContent = 1;
        String[] sUserInputNote=getInputData();
        boolean bIsUIDataValid=true;

       for(String strCurrentInput:sUserInputNote){
           if(!(strCurrentInput.length()>1)){
               bIsUIDataValid=false;
           }
       }
       if(bIsUIDataValid){
           strNoteFromUi=sUserInputNote[indexTitle]+","+sUserInputNote[indexContent];
       }
      return strNoteFromUi;
    }

    private static String[] getInputData() {
        //Decl. and Init
        System.out.println(INPUT_DATA);

        System.out.print(INPUT_NOTE_TITLE);
        String strInputTitle = ConsoleReader.in.readMandatoryString();

        System.out.print(INPUT_NOTE_CONTENT);
        String strInputContent = ConsoleReader.in.readMandatoryString();

        return new String[]{
                strInputTitle,
                strInputContent
        };
    }


    private static void deleteNotizBuchEntries(){
        int iInputIndex=getValidIndex();
        System.out.println("Do u want to delete");
        boolean answerIsYes=ConsoleReader.in.readMandatoryAnswerToBinaryQuestion();
        if(answerIsYes){
            strNoticeEntries[iInputIndex]="";
            showNoticeEntries();
        }else{
            System.out.println("No entries to delete");
        }
    }

    private static int getValidIndex() {
        int iInputIndex=0;
        int iIndexOfLastElement=strNoticeEntries.length-1;
        boolean bIsValidIndex=false;
        while(!bIsValidIndex){
            iInputIndex=ConsoleReader.in.readPositivInt();
            if((iInputIndex >= 0)&&(iInputIndex <= iIndexOfLastElement)){
                bIsValidIndex=true;
            }

        }
       return  iInputIndex;
    }



    private static void edit() {

        //Nur bearbeiten wenn die Liste befuellt ist.
        if (strNoticeEntries.length > 0) {

            //Alle Eintraege Anzeigen
            showNoticeEntries();

            //Liest einen validen Index ein
            int indexOfNoteToEdit = getValidIndex();

            //Eingabedaten auslesen
            String strNoteToEdit = getNoteFromUI();

            //Checken ob diese korrekt waren
            if (strNoteToEdit != null) {

                //Eintrag ersetzen
                strNoticeEntries[indexOfNoteToEdit] = strNoteToEdit;


                //Alles anzeigen
                showNoticeEntries();

            } else {
                //UserMsg keine korrekten Eingabedaten
                System.out.println("Message incorrect");
            }
        } else {

            //Userhinweis Leerliste kann nicht bearbeitet werden
            System.out.println("No entries to edit");
        }

    }



    private static void showNotizMenu() {
        String[] strNotizMenu={MENU_OPTION_EXIT,MENU_OPTION_SHOW,MENU_OPTION_ADD,MENU_OPTION_DELETE,MENU_OPTION_ÄNDERN,
        MENUE_OPTION_INFO,MENUE_ASK };
        int iMenuAuswahl;

        System.out.println(MENUE_ASK);
       do{
        printApplicationHeader();

        for(String strMenu:strNotizMenu){
            System.out.println(strMenu);
        }

        iMenuAuswahl=ConsoleReader.in.readPositivInt();
        do{

            if(iMenuAuswahl>=strNotizMenu.length){
                System.out.println("Bitte eine Menu Geben ");
            }


        }while(iMenuAuswahl>=strNotizMenu.length);



            switch (iMenuAuswahl) {
                case 0-> System.out.println("Auf wieder sehen");

                case 1->showNoticeEntries();


                case 2->AddNotizBuchEntries();


                case 3->
                        deleteNotizBuchEntries();

                case 4->edit();


                case 5->
                    System.out.println(MENUE_OPTION_INFO);


                default->
                    System.out.println("Bitte Auswählen eine Menu");
            }

       }while(iMenuAuswahl!=0);
    }



    public static void main(String[] args) {
        printApplicationHeader();
        startNotizProgram();

    }



}
