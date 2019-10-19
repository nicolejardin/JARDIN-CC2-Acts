import java.io.*;

public class UserInput2 {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter your name: ");
		String name = br.readLine();
		System.out.println("Hi " + name);
		}
	}