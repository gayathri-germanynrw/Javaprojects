package gkasi.main;

import gkasi.gui.GuiTakeOneNote;

/**
 * Startet die Applikation
 */
public class Main {

    /**
     * Startet die Applikation durch oeffnen lassen
     * der Gui
     * @param args : {@link String} : Infos
     */
    public static void main(String[] args) {
        //GuiObjekt generieren
        GuiTakeOneNote guiTakeOneNote  = new GuiTakeOneNote();

        //Gui Oeffnen
        guiTakeOneNote.openGui();
    }
}
