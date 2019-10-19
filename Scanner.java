import java.util.Scanner;

public class Scanner {
	public static void main(String[] args) {
		String name="";
		Scanner in = new Scanner (System.in);
		System.out.println("Enter your name: ");
		name = in.nextLine();
		System.out.println("Hi" + name);
		}
	}