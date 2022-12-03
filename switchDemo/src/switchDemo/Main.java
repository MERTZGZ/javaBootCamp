package switchDemo;

public class Main {

	public static void main(String[] args) {
		char grade = 'A';
		
		switch (grade) {
			case 'A':
				System.out.println("PERFECT : SUCCESS");
				break;
			
			case 'B':
				System.out.println("VERY GOOD : SUCCESS");
				break;
			case 'C':
				System.out.println("GOOD : SUCCESS");
				break;
			case 'D':
				System.out.println("NOT BAD : SUCCESS");
				break;
			case 'F':
				System.out.println("BAD :UNSECCESSFUL");
				break;
			default:
				System.out.println("YOU HAVE ENTERED AN INVALID GRADE ");
		}
		
		
	}

}
