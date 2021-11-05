package in.ac.jyothyit.sampleprograms.methodOverloading;

public class DisplayMessage{
	
	public static void display(String s) {
		System.out.println("welcome to "+s);
	}
	
	public static void display(String s, int n) {
		for(int i=1;i<=n;i++)
			System.out.println("welcome to "+s);
	}
	
	public static void display(int n, String s) {
		for(int i=1;i<=n;i++)
			System.out.println("welcome to "+s);
	}
}