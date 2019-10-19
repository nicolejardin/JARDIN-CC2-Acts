//Import util package
import java.util.Scanner;

public class Triangle {
	public static void main(String[] args) {
	//Instantiate Scanner class
	Scanner in = new Scanner(System.in);
	//Declare variable for input
	int height;
	//Display user instruction
	System.out.println("Enter Triangle Height: ");
	//Store user inpt in 'height' variable
	height = in.nextInt();
	//Only accept values from 1 to 50
	if ((height >= 1) && (height <= 50)) {
		//Use nested loop
		for (int x=1; x <= height; ++x) {
			for (int y=1; y <= x; ++y)	{
					System.out.print(y);
					if (y < x) System.out.print("_");
			} System.out.println();
		}
		//Error message	
		} else if ((height < 1) && (height > 50)) {
			System.out.print("Error!");
		}
	}

}