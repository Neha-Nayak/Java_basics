package in.ac.jyothyit.sampleprograms.Maximum_num;
import java.util.Scanner;

public class Maximum_demo{
	
	public static void main(String args[]) {
		
		int x,y, max;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the first number: ");
		x=scanner.nextInt();
		System.out.println("Enter the second number: ");
		y=scanner.nextInt();
		scanner.close();
		
		max= Maximum.findMaximum(x,y);
		
		System.out.println("The maximum of the two numbers is: "+max);
	}
}
