
import de.rhistel.logic.ConsoleReader;


public class Main {
    private static final String APPLICATION_HEADER="############ Das Kochbuch für Singles ############";
    private static final int iUserOption_Spiegelei=1;
    private static final int iUserOption_Spiegelei_mit_Tomatensoße=2;
    private static final int iUserOption_Lieferdienst=3;

    public static void printApplicationName(){
     System.out.println(APPLICATION_HEADER);
    }

    private static void userRezeptAuswahl(){
        String[] strRezeptAuswahl= {"[ " +iUserOption_Spiegelei+  "]"    +"Spiegelei",
                "[ " +iUserOption_Spiegelei_mit_Tomatensoße+  "]" + "Spagetti mit Tomatensoße",
                "[ " +iUserOption_Lieferdienst+  "]"  + "Lieferdienst anrufen\n"};

        for(int i=0;i<strRezeptAuswahl.length;i++){
            System.out.println(strRezeptAuswahl[i]);
        }

        //Rezepte
        String[] strRecipes = {
                "\nEi mit warmes  wasser kochen  lassen." +
                        "\nMit Maggi, Salz, Pfeffer fertig",

                "\nfolge the rezepte von Miracoli.\n" +
                        "Oder iss Ramen(Heißes Wasser,Nudel,Würze 5 min ziehen  lassen,fertig)",

                "\n06821 / 123456 - www.lieferheld.de/musterlieferant"

        };
        int userOption=ConsoleReader.in.readPositivInt();
        if((userOption>0) && (userOption<strRezeptAuswahl.length)){
            System.out.println(strRecipes[userOption]);
        }else{
            System.out.println("Es gibt nicht");
        }
 }
  public static void main(String[] args) {
        printApplicationName();
        userRezeptAuswahl();
    }
}
