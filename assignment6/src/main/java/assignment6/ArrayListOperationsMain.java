package assignment6;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/*Method should accept ArrayList of animals, 
if "lion" is present, return String "Yay", else "Oops".*/

public class ArrayListOperationsMain {
	private static final String strPresent = "Yay";
	private static final String strNotPresent = "Oops";
	
	public List<String> getListValueFromUser(Scanner scan,List<String> animals) {
		System.out.println("How many Animals do u want to add  ");
		int count=scan.nextInt();
		System.out.println("Enter Animal Names\n  ");
		for(int i=0;i<count;i++) {
			String animalName=scan.next();
			animals.add(animalName);
		}
		return animals;
		
	}
	public String displayListValues(List<String> animals) {
		
		String chkString = "";
		for(int i=0;i<animals.size();i++) {
			if(animals.get(i).equalsIgnoreCase("Lion")) {
				chkString=strPresent;
			}
			else {
				chkString=strNotPresent;
			}
			
		}
		System.out.println("Animals are in the List\n"+animals);
		return chkString;
		
		
		
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		List<String> animals =new ArrayList<String>();
		ArrayListOperationsMain arrayList=new ArrayListOperationsMain();
		animals=arrayList.getListValueFromUser(scan,animals);
		String afterChkString=arrayList.displayListValues(animals);
		System.out.println("Availability of the Lion is  :\t"+afterChkString);
	
	}
}
