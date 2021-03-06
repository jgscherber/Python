import java.util.Scanner;

public class WordExploder {

	public static void main(String[] args) {
		// Strip all punctuation
		// Split on words
		// Print one word per line
		Scanner stdin = new Scanner(System.in);
		System.out.print("Enter the sentence to break up: ");
		String sentence = stdin.nextLine();
		int s_length = sentence.length();
		String[] words = new String[s_length];
		int w_index = 0;
		int b_index = 0;
		int e_index = 0;
		boolean within = true;
		// substring
		for(int i=0;i<s_length;i++)
		{
			//System.out.println(sentence.charAt(i));
			if(Character.isLetter(sentence.charAt(i)) && !within)
			{
				within = true;
				b_index = i;
			}
			if(!Character.isLetter(sentence.charAt(i)) && within && sentence.charAt(i)!='\'') // char is a primitive type
			{
				
				within = false;
				e_index = i;
				words[w_index] = sentence.substring(b_index, e_index);
				w_index++;
			}
		}
		for (int j=0;j<w_index;j++)
		{
			System.out.println(words[j]);
		}
		
		stdin.close();
	}

}

