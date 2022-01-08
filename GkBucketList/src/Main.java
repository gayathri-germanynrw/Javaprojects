import de.rhistel.logic.ConsoleReader;

public class Main {
    private static void getValuesFromUser() {
        String[] BucketList={"","","","",""};

        for (int index = 0; index < BucketList.length; index++) {
            BucketList[index] = ConsoleReader.in.readString();
        }
        OutputBucketListFromUser(BucketList);
    }
    private static void OutputBucketListFromUser(String [] BucketList) {

        for (int index = 0; index < BucketList.length; index++) {
            System.out.println(BucketList[index]);
        }
    }

    public static void main(String[] args) {
        getValuesFromUser();



    }
}
