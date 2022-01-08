package model;

public class House {
    private static final Double DBL_DEFAULT_HEIGHT=10D;
    private static final Double DBL_DEFAULT_WIDTH=5D;

    private static final String STR_DEFAULT_DACHFARBE="RED";
    private static final String STR_DEFAULT_FASSADE="Green";

    private static final int INT_DEFAULT_FENSTERCOUNT=5;
    private static final int INT_DEFAULT_FLOORCNT=2;



    private Double dblHeight=10D;
    private Double dblWidth=5D;

    private String strDachFarbe;
    private String strFassadeFarbe;

    private int iFensterCount;

    public int getiFloorCount() {
        return iFloorCount;
    }

    public void setiFloorCount(int iFloorCount) {
        this.iFloorCount = iFloorCount;
    }

    private int iFloorCount;

    /* @
        Konstruktoren
     */

    public House(){
        this.setDblWidth(DBL_DEFAULT_HEIGHT);
        this.setDblWidth(DBL_DEFAULT_WIDTH);
        this.setStrDachFarbe(STR_DEFAULT_DACHFARBE);
        this.setStrFassadeFarbe(STR_DEFAULT_FASSADE);
        this.setiFensterCount(INT_DEFAULT_FENSTERCOUNT);
        this.setiFloorCount(INT_DEFAULT_FLOORCNT);

    }

    /* @
      Getter and Setter
     */

    public Double getDblHeight() {
        return dblHeight;
    }

    public void setDblHeight(Double dblHeight) {
        this.dblHeight = dblHeight;
    }

    public Double getDblWidth() {
        return dblWidth;
    }

    public void setDblWidth(Double dblWidth) {
        this.dblWidth = dblWidth;
    }
    public String getStrDachFarbe() {
        return strDachFarbe;
    }

    public void setStrDachFarbe(String strDachFarbe) {
        this.strDachFarbe = strDachFarbe;
    }

    public String getStrFassadeFarbe() {
        return strFassadeFarbe;
    }

    public void setStrFassadeFarbe(String strFassadeFarbe) {
        this.strFassadeFarbe = strFassadeFarbe;
    }

    public int getiFensterCount() {
        return iFensterCount;
    }

    public void setiFensterCount(int iFensterCount) {
        this.iFensterCount = iFensterCount;
    }


    public String toString() {
        return "House default{" +
                "dblHeight=" + dblHeight +
                ", dblWidth=" + dblWidth +
                ", iFloorCount=" + iFloorCount +
                ", iWindowCount=" + iFensterCount +
                ", strFassadeColor='" + strFassadeFarbe + '\'' +
                ", strRoofColor='" + strDachFarbe + '\'' +
                '}';
    }




}
