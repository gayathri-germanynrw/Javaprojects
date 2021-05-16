package truck.load.problem;

import java.util.Scanner;

public class GetInputFromUser {
	private Scanner scanner=new Scanner(System.in);
	
public UserInput getUserInput() {
		
		UserInput userInputVal=new UserInput();
		System.out.println("Enter no. of Boxes\n");
		int boxes=scanner.nextInt();
		userInputVal.setNoOfBoxes(boxes);
		System.out.println("Boxes----GetInputFromUser-->\n"+boxes);
		 
		System.out.println("Enter No.of trucks\n");
		int noOfTrucks=scanner.nextInt();
		userInputVal.setNoOfTrucks(noOfTrucks);
		System.out.println("noOfTrucks  ----GetInputFromUsern"+noOfTrucks);
		
		
		System.out.println("Enter weights of Boxes\n");
		int[] boxWeights=new int[boxes];
		for(int i=0;i<boxWeights.length;i++) {
			
			boxWeights[i]=scanner.nextInt();
			System.out.println("boxWeights-GetInputFromUser-- Inside For loop---"+boxWeights[i]);
		}
				
		userInputVal.setBoxweights(boxWeights);	
		System.out.println("boxWeights-GetInputFromUser--"+boxWeights);
				
	  // scanner.close();			
		
		return userInputVal;
		
	}
	
	
}
