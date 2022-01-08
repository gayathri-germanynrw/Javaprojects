package logic;

import de.rhistel.logic.ConsoleReader;
import model.House;

public class UiController {
    private static final String APPLICATION_HEADER = "##### HAUS PLANER #####";

    private static final String USER_MSG_EXIT_APPLICATION = "Die Applikation wird beendet";

    private static final String FLOOR_COUNT = "Stockwerke:\t";
    private static final String WINDOWS_COUNT = "Windows Count:\t";

    private static final String  HEIGHT= "Hohe :\t";
    private static final String WIDTH = "Breite :\t";

    private static final String DACHFARBE = "DACH Farbe :\t";
    private static final String FASSADEFARBE = "Fassade Farbe:\t";
    private static final String USER_MSG_PLAN_A_HOUSE = "Möchten Sie ein Haus planen?";


    public void startUserInterface() {
        showHousePlanning();
        House haus=new House();
        System.out.println(" haus.toString()--->"+ haus.toString());


    }

    private void showHousePlanning() {
        System.out.println(APPLICATION_HEADER);

        boolean planHaus = true;
        while (planHaus) {
            System.out.println(USER_MSG_PLAN_A_HOUSE);
            planHaus = ConsoleReader.in.readMandatoryAnswerToBinaryQuestion();
            if (planHaus) {
                System.out.println(FLOOR_COUNT);
                int iFloorCount = ConsoleReader.in.readPositivInt();
                System.out.println(WINDOWS_COUNT);
                int iFensterCount = ConsoleReader.in.readPositivInt();

                System.out.println(HEIGHT);
                Double dblHeight=ConsoleReader.in.readDouble();
                System.out.println(WIDTH);
                Double dblWidth=ConsoleReader.in.readDouble();

                System.out.println(DACHFARBE);
                String strDachFarbe=ConsoleReader.in.readString();
                System.out.println(FASSADEFARBE);
                String strFAssadeFarbe=ConsoleReader.in.readString();

                boolean inputDataValid = true;
                //Überprüfen die EingabeDaten

                final int iMaxFloorCount=2;
                final String strDachColor="Yellow";

                if ((iFloorCount <0) && (iFloorCount > 2)) {
                    inputDataValid = false;
                }

                if(strDachFarbe.equals(strDachColor)){
                    inputDataValid = false;
                }


                if (inputDataValid) {
                    House haus = new House();
                    haus.setiFloorCount(iFloorCount);
                    haus.setStrDachFarbe(strDachColor);
                    haus.setStrDachFarbe(strFAssadeFarbe);
                    System.out.println(haus);

                }


            } else {
                System.out.println(USER_MSG_EXIT_APPLICATION);
            }


        }


    }


}
