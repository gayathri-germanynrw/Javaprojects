package truck.load.problem;

import java.util.Arrays;

public class TruckLoadAlgorithm {
	  int maxDiff;
	  public int truckAlgorithmMethod(UserInput userInputVal){
		  
	  try {
		  
		  System.out.println("userVal.getNoOfTrucks();-----"+userInputVal.getNoOfTrucks());
		  int noOfTrucks= userInputVal.getNoOfTrucks();
		  System.out.println("print the noOfTrucks- 2 nd line-->"+noOfTrucks);
		  
		  
	  int[] boxWeights=userInputVal.getBoxweights();
	  
	  int[] weightDiff=new int[noOfTrucks];
	  
	  
	 
	  for(int i=0;i<boxWeights.length;i++)
	  {
		  Arrays.sort(boxWeights);
		  weightDiff[0]= weightDiff[0]+boxWeights[i];
		  
	  }
	  Arrays.sort(weightDiff);
	  maxDiff= weightDiff[noOfTrucks-1]-weightDiff[0];
	  
	
	  }catch(Exception e) {
		  e.printStackTrace();
	  }
	
	return maxDiff;
	
	  
	  }

	  

}

