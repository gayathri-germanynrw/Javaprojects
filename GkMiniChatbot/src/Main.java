import de.rhistel.logic.ConsoleReader;


public class Main {
    private static final String APPLICATION_HEADER="############ MINI CHAT BOT ############";
    public static void printApplicationName(){

        System.out.println(APPLICATION_HEADER);
    }

    public static void startUserChat(){
        String[] strChatFragen = {"wer bist du", "Wie alt bist du","wie heißt du"};

        String[] strChatAnwort= {  "MC: Ich bin der MiniChatBot :D",
                "MC: Ich bin so alt wie die Ausführung des Programms selbst.",
                "MC: Ich heiße Mark Cäsar?"};

        for(int i=0;i<strChatFragen.length;i++){
            System.out.println(strChatFragen[i]);
        }
        String strUserInputtedMessage=ConsoleReader.in.readString();
        System.out.println("\nDu: " +strUserInputtedMessage+"\n");
        boolean isKnownQuestion = false;
        for(int index=0;index<strChatFragen.length;index++){
            if(strChatFragen[index].contains(strUserInputtedMessage)) {
                System.out.println(strChatAnwort[index]);
                isKnownQuestion=true;
            }
        }
        if(!isKnownQuestion){
            System.out.println("Diese Frage kenn ich nicht =(. Auf Wiedersehen =) !");
        }

 }
  public static void main(String[] args) {
        printApplicationName();
        startUserChat();
  }
}
