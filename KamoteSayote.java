import java.util.Scanner;

public class KamoteSayote {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n, m, k, x, y;
		System.out.println("Enter input:");
		n = in.nextInt();
		m = in.nextInt();
		k = in.nextInt();
		
		x = n/m;
		y = (n%m)*k;
		boolean val = (n <= 1000 && n >= 1) && (m <= 1000 && m >= 1) && (k <= 1000 && k >= 1);
		
		if (val) {
			System.out.println(x + " kamotes\n" + y + " sayotes");
			} else System.out.print("Invalid Input. ");
		
		}
	}