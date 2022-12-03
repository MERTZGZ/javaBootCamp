
public class Main {

	public static void main(String[] args) {
		
		int number1 = 20;
		int number2 = 25;
		int number3 = 2;
		int bigNumber = number1;
		
		if (bigNumber < number2 ) {
			
			bigNumber = number2;
		}
		
		if (bigNumber < number3) {
			
			bigNumber = number3;
		}
		
		System.out.println("the big number = " + bigNumber);
	}
	
	
}
	