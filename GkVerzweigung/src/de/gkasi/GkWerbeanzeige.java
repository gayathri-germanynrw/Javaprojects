package de.gkasi;

class GKWerbeanzeige {
    private static String strReturnMessage;
    private static final int BUYERS_NOTE_TYPE_NO_NOTE=-1;
    private static final int BUYERS_NOTE_TYPE_ARROW=0;
    private static final int BUYERS_NOTE_TYPE_TOPPRICE=1;
    private static final int BUYERS_NOTE_TYPE_BUYNOW=2;




     private void getDeclaredValues(){
          final String strRosen="Rosen";
          final String strSchuhe="Schuhe";
          final String strMehlHeute="Mehl";
          final String strTomaten="Tomaten";
          final String strSprudel="Sprudel";
          final String strKaffee="Kaffee";
          final String strNudeln="Nudeln";
          final String strMundwasser="Mundwasser";
          final String strBier="Bier";
          final String strTee="Tee";

          final double dblPreisRosen=2D;
          final double dblPreisSchuhe=30.0D;
          final double dblPreismehlheute=00.9D;
          final double dblPreisTomaten=1.50D;
          final double dblPreisSprudel=4.99D;
          final double dblPreisKaffee=2.99D;
          final double dblPreisNudeln=0.65D;
          final double dblPreisMundwasser=5.41D;
          final double dblPreisBier=12.99D;
          final double dblPreisTee=0.60D;
         final double dblPreis=dblPreisRosen;
         final String strProduktName=strRosen;
         String strProduktPreis=analysierteProdukt(dblPreis,strProduktName);
         System.out.println(strProduktPreis);
      }

    /**
     *
     * @param
     */

      private String analysierteProdukt(double dblPreis,String strProduktName){


          int iBuyersNoteType=BUYERS_NOTE_TYPE_NO_NOTE;

          if((dblPreis>3D)&&(dblPreis<=5D)){
             // strReturnMessage=strProduktName+":\t\tAbsoluter Spitzenpreis";
              iBuyersNoteType=BUYERS_NOTE_TYPE_ARROW;
           }
          if((dblPreis>0D)&&(dblPreis<=3D)){
              //strReturnMessage=strProduktName+":\t\tJetzt aber zuschlagen";
              iBuyersNoteType=BUYERS_NOTE_TYPE_TOPPRICE;
          }
          if((dblPreis>10D)&&(dblPreis<20D)){
              //strReturnMessage="--->"+strProduktName;
              iBuyersNoteType=BUYERS_NOTE_TYPE_BUYNOW;
          }
          return  strReturnMessage=switch(iBuyersNoteType){
              case BUYERS_NOTE_TYPE_ARROW->strProduktName+":\t\tAbsoluter Spitzenpreis";
              case BUYERS_NOTE_TYPE_TOPPRICE ->strProduktName+":\t\tJetzt aber zuschlagen";
              case BUYERS_NOTE_TYPE_BUYNOW ->"--->"+strProduktName;
              case BUYERS_NOTE_TYPE_NO_NOTE -> "-1";
              default->"hi";

    };


    }

   public static void main(String[] args) {
        GKWerbeanzeige gkWerb=new GKWerbeanzeige();
        gkWerb.getDeclaredValues();
}
}
