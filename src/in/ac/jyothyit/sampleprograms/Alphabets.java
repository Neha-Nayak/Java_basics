package in.ac.jyothyit.sampleprograms;
import java.util.Scanner;

public class Alphabets{
	
	public static void main(String args[]) {
		
		String ch;
		boolean flag= false;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Alphabet: ");
		ch =scanner.next();
		scanner.close();
		
		switch(ch) {
			case "a":
			case "e":
			case "i":
			case "o":
			case "u":
			case "A":
			case "E":
			case "I":
			case "O":
			case "U":
					flag=true;
					break;
		}
		
		if (flag == true)
			System.out.println(ch+" is a Vowel ");
		else 
			System.out.println(ch+" is a Consonant ");
			
	}
}