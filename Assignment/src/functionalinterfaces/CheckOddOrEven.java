package functionalinterfaces;

public class CheckOddOrEven  {

public static void main(String[] args) {
	IEvenOdd objEvenOdd=(a)-> {
			if(a%2==0) {
				System.out.println("Entered number is Even---->"+a);
				
			}else {
				System.out.println("Entered number is Odd---->"+a);
				
			}
			
			
		
	};

	objEvenOdd.evenOdd(13);

}
}
