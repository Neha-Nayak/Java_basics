package in.ac.jyothyit.sampleprograms;
import java.util.Scanner;

public class FullName{
	
	public static void main(String args[]) {
		
		String firstName,lastName,fullName;
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the First Name: ");
		firstName=scanner.next();
		System.out.println("Enter the Last Name: ");
		lastName=scanner.next();
		scanner.close();
		
		fullName= firstName+" "+lastName;
		
		System.out.println("Full Name= "+fullName);
	}
}