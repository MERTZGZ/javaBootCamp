package findNumber;

public class Main {

	public static void main(String[] args) {
		int[] numbers = new int [] {1,2,5,7,9,0};
		int toBeSearched = 5;
		
		for(int i = 0; i < numbers.length; i++ ) {
			
			if(toBeSearched == 5) {
				System.out.println("this number found");
				break;
			}
			
			else {
				System.out.println("this number not found");
				break;
			}
		}

	}

}
