import java.util.Scanner;
import java.lang.Math;

public class Calculator {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		String operation;
		int numOper, operCounter, x, y, z;
		System.out.println("Enter # of operations: ");
		numOper = in.nextInt(); 
		if ((q>=1)&&(q<=100)){
				System.out.println("Enter all operations in one line: ");
			for (operCounter=1; operCounter<=numOper; operCounter++) {
				operation = in.next();
					if (oepration.equals("negate")) {
						y = in.nextInt();
						z = -y;
						System.out.println(z);
					} else if (operation.equals("add")) {
						x = in.nextInt();
						y = in.nextInt();
						z = x+y;
						System.out.println(z);
					} else if (operation.equals("max")) {
						x = in.nextInt();
						y = in.nextInt();
						z = Math.max(x, y);
						System.out.println(z);
						
				} 
			
			} 
		} else 	System.out.println("Invalid input.");	
	}
}

