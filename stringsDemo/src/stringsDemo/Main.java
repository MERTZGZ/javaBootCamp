package stringsDemo;

public class Main {

	public static void main(String[] args) {
		String message = "   the weather is very nice today  ";
		System.out.println(message);
		
				
		System.out.println("number of elements:" + message.length());
		System.out.println("the fifth element:" + message.charAt(5));
		System.out.println(message.concat(" thumbs up!"));
		System.out.println(message.startsWith("c"));
		System.out.println(message.endsWith("y"));
		
		char [] characters = new char[5];
		message.getChars(0, 5, characters, 0);
		System.out.println(characters);
		System.out.println(message.indexOf("er"));
		System.out.println(message.lastIndexOf('y'));
		
		
		String newMessage = message.replace(' ','-');
		System.out.println(newMessage);
		System.out.println(message.substring(2));
		System.out.println(message.substring(3,15));
		
		for (String word : message.split(" ")) {
			
			System.out.println(word);
			
		}
		String newMessage2 = message.toUpperCase();
		String newMessage3 = newMessage2.replace('İ','I');
		System.out.println(newMessage3);
		
		System.out.println(message.trim());
		
	}
	

}