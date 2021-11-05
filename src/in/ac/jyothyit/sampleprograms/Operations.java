package in.ac.jyothyit.sampleprograms;
import java.util.Scanner;

public class Operations{
	
	public static void main(String args[]) {
		
		int a,b,result;
		char op;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the first number: ");
		a=scanner.nextInt();
		System.out.println("Enter the second number: ");
		b=scanner.nextInt();
		System.out.println("Enter the operators(+,-,*,/): ");
		op =scanner.next().charAt(0);
		scanner.close();
		
		switch(op){
			case '+':
					result = a+b;
					System.out.println("Sum = "+result);
					break;
			
			case '-':
					result=a-b;
					System.out.println("Difference = "+result);
					break;
			
			case '*':
					result=a*b;
					System.out.println("Product = "+result);
					break;
			
			case '/':
					result=a/b;
					System.out.println("Quotient = "+result);
					break;
		}
	}
}