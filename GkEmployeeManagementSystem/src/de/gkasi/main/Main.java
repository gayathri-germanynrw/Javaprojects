package de.gkasi.main;
import de.gkasi.ui.UiController;

/**
 * Entry point for Employee Management System Project
 *
 */

public class Main {
   //region 1. Mainloop

    /**
     * Start the Program
     * @param args
     */
    public static void main(String[] args) {
        UiController uiController=new UiController();
        uiController.startUi();
    }
  //end region

}
