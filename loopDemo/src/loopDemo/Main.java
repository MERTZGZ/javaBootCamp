package loopDemo;

public class Main {

	public static void main(String[] args) {
		//FOR
		
		for(int i = 2 ; i < 10 ; i += 2) {
			System.out.println(i);
		}
		System.out.println("THE FOR LOOP IS OVER");
		
		//WHILE
		int i = 1;
		while (i < 10) {
			System.out.println(i);
			i+=2;
		}
		
		System.out.println("THE WHILE LOOP IS OVER");
		
		//DO-WHILE (sart saglanmasa bile bir kere calisan)
		int j = 100;
		do {			
			System.out.println(j);
			j+=2;	
			
		}while(j<10);
		
		System.out.println("THE DO-WHILE LOOP IS OVER");
		
	}
	

}
