import java.util.Scanner;

public class eggDozens {
	public static void main(String[] args){ // need String[] args for it to recognize it as a java application
		Scanner stdin = new Scanner(System.in);
		System.out.print("How many eggs do you have? ");
		int eggs = stdin.nextInt();
		int gross = eggs/144;
		int remain = eggs%144;
		int dozens = remain/12; // interger division doesn't have it's own operator
		int leftover = remain%12; 
		
		System.out.printf("You have %d gross, %d dozen eggs with %d leftover", gross, dozens, leftover);
		stdin.close();
			
	}
}
