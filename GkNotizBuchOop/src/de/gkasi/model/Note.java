package de.gkasi.model;

public class Note {
    private static final String DFT_STR_TITLE="Activities ";
    private static final String DFT_STR_NOTE_CONTENT="GO to GYM";

    public static final String SPLIT_CHAR=";";
    private static final int SPLIT_INDEX_TITLE   = 0;
    private static final int SPLIT_INDEX_CONTENT = 1;

    public String strTitle;
    public String strNoteContent;

    public Note(){
        this .strTitle=DFT_STR_TITLE;
        this.strNoteContent=DFT_STR_NOTE_CONTENT;
    }

    /**
     * 2. Konstruktor
     * 1. Ueberladner Konstruktor zum direkten setzen
     * der Attributwerte durch mitgegeben Parameter.
     *
     * @param strTitle   : {@link String} : Titel der Notiz/Aufgabe
     * @param strContent : {@link String} : Eigentliche Notize/Aufabenbeschreibung
     */
    public Note(String strTitle, String strNoteContent) {
        this.strTitle   = strTitle;
        this.strNoteContent = strNoteContent;
    }


    /**
     * TODO 0 getAllAttributesAsCsvString
     * Alle Attribute als ein String mit
     * einem Semikolon als Trennzeichen<br>
     * Index          : 0        ;     1
     * Attributname   : strTitle ;strContent<br>
     * Attributunhalt : Einkaufen;CAT-5 Kabel
     *
     * @return strAllAttributesAsCsvString : {@link String} : Alle Attribute mit einem Semikoln getrennt als String
     */
    public String getAllAttributesAsCsvString(){
        return (this.strTitle+SPLIT_CHAR+this.strNoteContent);
    }



    /**
     * TODO 1 setAllAttributesFromCsvString
     * Nimmt einen von {@link Note#getAllAttributesAsCsvString()} generierten
     * CSV-String entgegen und splitt diesen nach dem verwendeten Trennzeichen
     * {@link Note#SPLIT_CHAR} auf und extrahiert die einzlen Attributwerte und weist diese zu.
     * <p>
     * Index          : 0        ;     1
     * Attributname   : strTitle ;strContent<br>
     * Attributunhalt : Einkaufen;CAT-5 Kabel
     *
     * @param strReadCsvLine : {@link String} : Ausgelesener CSV-String aus späterem {@link de.rhistel.logic.CsvFileHandler}
     */


    public void setAllAttributesFromCsvLine(String strReadCsvLine) {
        String[] strAllAttributes= strReadCsvLine.split(SPLIT_CHAR);
        this.strTitle=strAllAttributes[SPLIT_INDEX_TITLE];
        this.strNoteContent=strAllAttributes[SPLIT_INDEX_CONTENT];

    }



    public String getStrNoteContent() {
        return strNoteContent;
    }

    public void setStrNoteContent(String strNoteContent) {
        this.strNoteContent = strNoteContent;
    }

    public String getStrTitle() {
        return strTitle;
    }

    public void setStrTitle(String strTitle) {
        this.strTitle = strTitle;
    }

    public String toString(){
        return "Note { "+
                "strTitle='"+ strTitle +'\''
                +" ,strNoteContent='"+strNoteContent + '\''+" }";
    }
}
