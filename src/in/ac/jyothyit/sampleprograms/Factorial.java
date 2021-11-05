package in.ac.jyothyit.sampleprograms;
import java.util.Scanner;

public class Factorial{
	
	public static void main(String args[]) {
		
		int n, result=1;
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the value of n: ");
		n=scanner.nextInt();
		scanner.close();
		
		for(int i=1;i<=n;i++)
			result=result*i;
		
		System.out.println("Factorial = "+result);
	}
}