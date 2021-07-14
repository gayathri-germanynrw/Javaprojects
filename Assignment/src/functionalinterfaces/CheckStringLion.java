package functionalinterfaces;

public class CheckStringLion {
	public static void main(String[] args) {
		ICheckString obj=(a)->{
			if(a.equalsIgnoreCase("Lion")) {
				System.out.println("Entered String is Lion--->"+a);
			}else {
				System.out.println("Entered String is not Lion--->"+a);
			}
			
		};
		obj.isLion("Lioness");
	}
}
