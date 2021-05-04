package assignment4;

public class ProviderAssign4 {
    private String revString;
    private String chkStr;
	private String finalStr;	
    private String comStr;
    private StringBuilder sb=new StringBuilder();
	public void reverseString(String str) {
		
		
		revString=sb.append(str).reverse().toString();
		System.out.println("Reversed String\n"+revString);
		sb.delete(0, sb.length());
			
	}
	
	public void chkPalindrome(String chkPalindrome) {
		
		chkStr=sb.append(chkPalindrome).reverse().toString();
		if(chkStr.equals(chkPalindrome))
		{
			System.out.println("Entered String is an Palindrome\n"+chkPalindrome);
				
		}
		else {
			System.out.println("Entered String is not an Palindrome\n"+chkPalindrome);
		}
			
		sb.delete(0, sb.length());
	}
	public void strOperations() {
		String aboutTiger = "   The tiger is listed as Endangered on the IUCN Red List.";
		sb.append(aboutTiger).append("The tiger is among the most recognisable and popular of the world's charismatic megafauna. "
				+ "As of 2015, the global wild tiger population was estimated to number between 3,062.");
	   
		String delString="IUCN";
		int index=sb.indexOf(delString);
		String repString="tiger"; 
		int indRepString=sb.indexOf(repString);
		sb.delete(index, index+delString.length());
		sb.append( "The generic name Panthera is derived from the Latin word panthera");
		sb.replace(indRepString, indRepString+repString.length(), "lion");
		String endString=sb.toString();
	    System.out.println("print the result sentences\n"+endString.trim().toLowerCase());
	    sb.delete(0, sb.length());
	}
	
	
	public  int findIndex(String[] animals,String str) {
			int index=-1;
			  for (int i=0;i<animals.length;i++) 
			  {
				  if(animals[i].equals(str)) index=i;
					 
			  }  
				 
			   return index;
		
		}
		
		public String processAnimal(String[] animals) {
			
	        animals[2]="Bear";
	        
			for (String string : animals) {
			int index=findIndex(animals,string);
			if(index > -1)
			{
				finalStr=sb.append(index).append(" ").append(string).append(" \n ").toString();
			}
		   }
			return finalStr;
			
		}
		
		public void arrayOperations() {
			
		}
		
  
}
