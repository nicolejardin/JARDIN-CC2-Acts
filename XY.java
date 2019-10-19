import java.util.Scanner;

public class XY {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		System.out.println("X: ");
		int x = in.nextInt();
		System.out.println("Y:");
		int y = in.nextInt();
		int diff = x - y;
		
		if (diff < 0) {
			int R = x + y;
			System.out.print("X: " + x + " Y: " + y + " R: " + R);
			} else if (diff == 0) { 
				int R = (2*x) + (2*y);
				System.out.print("X: " + x + " Y: " + y + " R: " + R);
				} else if (diff > 0) {
					int R = x*y;
					System.out.print("X: " + x + " Y: " + y + " R: " + R);
				}

				
			
		}
	}