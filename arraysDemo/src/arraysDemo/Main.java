package arraysDemo;

public class Main {

	public static void main(String[] args) {
	
		String student1 = "john";
		String student2 = "kerry";
		String student3 =  "teresa";
		
		System.out.println(student1);
		System.out.println(student2);
		System.out.println(student3);
		
		System.out.println("-------------------");
		
		String[] students = new String[3];
		
		students[0] = "jonh";
		students[1] = "kerry";
		students[2] = "teresa";
		
		for (int i = 0; i<students.length; i++) {
			System.out.println(students[i]);
								
		}	
		
		System.out.println("-------------------");
	
		for (String student:students) {
			
			System.out.println(student);
		}
		
		
	}
	
	

}
 