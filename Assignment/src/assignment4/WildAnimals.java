package assignment4;

public class WildAnimals {
	

	public  int findIndex(String[] animals,String str) {
			int index=-1;
			  for (int i=0;i<animals.length;i++) 
			  {
				  if(animals[i].equals(str)) index=i;
					 
			  }  
				 
			   return index;
		
		}
		
		public String processAnimal(String[] animals) {
			StringBuilder sb3=new StringBuilder();
	        animals[2]="Bear";
	        
	        
	        String finalStr="";
	        
			for (String string : animals) {
			int index=findIndex(animals,string);
			if(index > -1)
			{
				finalStr=sb3.append(index).append(" ").append(string).append(" \n ").toString();
			}
		   }
			return finalStr;
			
		}
	
		
public static void main(String[] args) {
	
	String[] animals = {"Caiman", "Caiman Lizard", "Cairn Terrier", "Camel", "Camel Spider", "Canaan Dog", "Canadian Eskimo Dog", "Capybara", "Caracal", "Carolina Dog", "Carp", "Cassowary", "Cat", "Caterpillar", "Catfish", "Cavador", "Cavalier King Charles Spaniel", "Cavapoo", "Centipede","Cesky Fousek", "Cesky Terrier", "Chameleon",  "Chamois", "Cheagle", "Cheetah", "Chesapeake Bay Retriever", "Chicken", "Chihuahua",  "Chimaera", "Chimpanzee", "Chinchilla",
			"Chinese Crested Dog",  "Chinese Paddlefish", "Chinook", 
			"Chinstrap Penguin", "Chipmunk", "Chipoo"};
	String comStr;
	WildAnimals wa=new WildAnimals();
	
	comStr=wa.processAnimal(animals);
	System.out.println("---- String array with Animals ---\n");
	System.out.println(comStr);
  	}
}