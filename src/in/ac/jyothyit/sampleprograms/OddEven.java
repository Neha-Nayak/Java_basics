package in.ac.jyothyit.sampleprograms;
import java.util.Scanner;

public class OddEven{
	
	public static void main(String args[]) {
		
		int n;
		
		System.out.println("Enter a number: ");
		Scanner scanner = new Scanner(System.in);		//requesting a resource
		n=scanner.nextInt();							//using the resource
		scanner.close();								//closing the resource
		
		if (n%2==0)
			System.out.println("The number is Even");
		else
			System.out.println("The number is Odd");
	}
	
}