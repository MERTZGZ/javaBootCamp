package tinyProjectPrimeNumber;

public class Main {

	public static void main(String[] args) {
		//int number = 25;
		//int remainder = number % 2;
		//System.out.println(remainder);
		
		int number = 15;
		
		boolean isPrime = true;
		
		if(number == 1 ) {
			
			System.out.println("this number is not prime");
			return;
		}
		
		if(number < 1) {
			System.out.println("invalid number");
			return;
		}
		
		for (int i = 2; i < number; i++) {
			
			if(number % i == 0) {
				
				isPrime = false;
			}
		}
		
		if(isPrime == true ) {
			System.out.println("this number is prime");
		}else {
			System.out.println("this number is not prime");
		}

	}

}
