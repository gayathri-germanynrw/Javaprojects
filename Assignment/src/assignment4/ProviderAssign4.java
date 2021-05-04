package assignment4;

public class ProviderAssign4 {
	
  	  public String reverseString(String str) {
    	StringBuilder sb=new StringBuilder();
    	String revString;
		revString=sb.append(str).reverse().toString();
		System.out.println("Reversed String\n"+revString);
		sb.setLength(0);
		return revString;
			
	}
	
	public void chkPalindrome(String chkPalindrome) {
		StringBuilder sb1=new StringBuilder();
		String chkStr;
		chkStr=sb1.append(chkPalindrome).reverse().toString();
		if(chkStr.equals(chkPalindrome))
		{
			System.out.println("Entered String is an Palindrome\n"+chkPalindrome);
				
		}
		else {
			System.out.println("Entered String is not an Palindrome\n"+chkPalindrome);
		}
		sb1.setLength(0);
	}
	public void strOperations() {
		StringBuilder sb2=new StringBuilder();
		String aboutTiger = "   The tiger is listed as Endangered on the IUCN Red List.";
		sb2.append(aboutTiger).append("The tiger is among the most recognisable and popular of the world's charismatic megafauna. "
				+ "As of 2015, the global wild tiger population was estimated to number between 3,062.");
	   
		String delString="IUCN";
		int index=sb2.indexOf(delString);
		String repString="tiger"; 
		int indRepString=sb2.indexOf(repString);
		sb2.delete(index, index+delString.length());
		sb2.append( "The generic name Panthera is derived from the Latin word panthera");
		sb2.replace(indRepString, indRepString+repString.length(), "lion");
		String endString=sb2.toString();
	    System.out.println("print the result sentences\n"+endString.trim().toLowerCase());
	    sb2.setLength(0);
	}
	
	
		
		public void arrayOperations() {
			
		}
		
  
}
