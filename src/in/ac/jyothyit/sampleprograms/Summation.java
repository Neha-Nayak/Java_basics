package in.ac.jyothyit.sampleprograms;
import java.util.Scanner;

public class Summation{
	
	public static void main(String args[]) {
		
		int n, result=0;
		
		Scanner scanner =new Scanner(System.in);
		System.out.println("Enter the value of n: ");
		n=scanner.nextInt();
		scanner.close();
		
		for(int i=0;i<=n;i++)
			result+=i;
		
		System.out.println("Summation = "+result);
	}
}