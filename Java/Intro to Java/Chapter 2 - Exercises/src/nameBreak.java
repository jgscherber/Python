import java.util.Scanner;

public class nameBreak {
	public static void main(String[] args){
		Scanner stdin = new Scanner(System.in);
		System.out.print("Enter your full name: ");
		String full_name = stdin.nextLine(); // next will end on first non-character
		stdin.close();
		//System.out.print(full_name);
		int spLoc = full_name.indexOf(' ');
		String first_name = full_name.substring(0, spLoc);
		String last_name = full_name.substring(spLoc+1,full_name.length());
		System.out.println("Your first name is "+first_name);
		System.out.println("Your last name is "+last_name);
		System.out.printf("Your first name has %d letters\n",first_name.length());
		System.out.printf("Your last name has %d letters\n",last_name.length());
		System.out.println("Your initials are " + first_name.charAt(0)+last_name.charAt(0));
		
	}
}
