package multiDimensionalArrayDemo;

public class Main {

	public static void main(String[] args) {
		String[] [] cities = new String [3] [3];
		
		cities [0][0] = "istanbul"; 
		cities [0][1] = "bursa"; 
		cities [0][2] = "bilecik"; 
		cities [1][0] = "ankara"; 
		cities [1][1] = "konya"; 
		cities [1][2] = "eskisehir"; 
		cities [2][0] = "diyarbakir"; 
		cities [2][1] = "sanliurfa"; 
		cities [2][2] = "gaziantep";  
		
		for(int i = 0 ; i<=2 ; i++) {
			System.out.println("----------------");
			for (int j=0; j<=2; j++) {
				System.out.println(cities[i][j]);
			}
		}
		
	}

}
