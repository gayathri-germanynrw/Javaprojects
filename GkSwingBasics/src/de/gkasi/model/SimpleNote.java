package gkasi.model;


/**
 * Die Einfachste Notiz
 * die es jemals geben wird
 * TODO 1. Modelklasse  koennt ihr kopieren
 */
public class SimpleNote {

    //region 0. Konstanten
    private static final String SPLIT_CHAR                = ";";
    private static final String DEF_VALUE_STR             = "";
    private static       int    SPLIT_INDEX_CREATION_DATE = 0;
    private static       int    SPLIT_INDEX_CONTENT       = 1;
    //endregion

    //region 1. Decl and Init Attribute
    private String strCreationDate;
    private String strContent;
    //endregion

    //region 2. Konstruktoren

    /**
     * Standardkonstruktor
     */
    public SimpleNote() {
        this.strCreationDate = DEF_VALUE_STR;
        this.strContent      = DEF_VALUE_STR;
    }

    /**
     * Standardkonstrukto zum dirketen setzen aller Attribute
     *
     * @param strCreationDate : {@link String} : Datum an dem die Notiz generiert wurde
     * @param strContent      : {@link String}: Notizinhalt
     */
    public SimpleNote(String strCreationDate, String strContent) {
        this.strCreationDate = strCreationDate;
        this.strContent      = strContent;
    }


    //endregion

    //region 3. Getter und Setter

    public String getCreationDate() {
        return strCreationDate;
    }

    public void setCreationDate(String strCreationDate) {
        this.strCreationDate = strCreationDate;
    }

    public String getContent() {
        return strContent;
    }

    public void setContent(String strContent) {
        this.strContent = strContent;
    }

    /**
     * Gibt alle Attribute der Modelklass als CSV-String zurueck
     *
     * @return strDate;strContent
     */
    public String getAllAttributesAsCsvString() {
        return this.strCreationDate + SPLIT_CHAR + strContent;
    }

    /**
     * Splittet den mitgebenen CSV-String auf+
     * und setzt die Attribute
     */
    public void setAllAttributesFromCsvLine(String strCsvLine) {
        String[] strAllAttributes = strCsvLine.split(SPLIT_CHAR);

        this.strCreationDate = strAllAttributes[SPLIT_INDEX_CREATION_DATE];
        this.strContent      = strAllAttributes[SPLIT_INDEX_CONTENT];
    }
    //endregion

    //region 4. Methoden und Funktionen

    @Override
    public String toString() {
        return "SimpleNote{" +
                "strCreationDate='" + strCreationDate + '\'' +
                ", strContent='" + strContent + '\'' +
                '}';
    }


    //endregion
}