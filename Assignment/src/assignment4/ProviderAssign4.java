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
	
     public void chkTernary() {
		
		for(int i=0;i<100;i++)
		{
			String chkEvenOdd=(i%2==0)? "The number is Even---"+i:"The number is Odd----"+i;
			System.out.println(chkEvenOdd);
		}
	}
    
     
     public void addMatrix() {
    	 try 
    	 {
    		 
    	 int [][] a= {{2,3,4},{6,7,8}};
    	 int [][] b= {{5,6,22},{23,45,9}};
    	 int size=3;    	
    	 int [][] c=new int[size][size];
     	  for(int i=0;i<2;i++)
    	  {
    		  for (int j=0;j<size;j++) {
    			  c[i][j]= a[i][j]+b[i][j];
    			  System.out.print(c[i][j]+" ");
    		  }
    		  System.out.println();
    	  }
      }catch(Exception e) {
    	 System.out.println("print the exception ---"+e);
     }
     
     }  
     
  
     public void chkWhile(int num) {
    	 boolean chkValue=false;
    	 while(num==5) {
    		 
    		 System.out.println("re-enter the another input ");
    		 chkValue=true;
    		 if(chkValue) {
        		 System.out.println("You are exited from the program ");
        	 }
    		 
    	 }
    	 
     }
   
}
