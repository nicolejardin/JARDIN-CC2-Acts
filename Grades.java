import java.util.Scanner;

public class Grades {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int gradeVal;
		System.out.println("Enter your grade: [numerical value] ");
		gradeVal = in.nextInt();

		if ((gradeVal >= 92)&&(gradeVal <= 100)) {
			System.out.println('A');
		} else if ((gradeVal >= 87)&&(gradeVal <= 91)) {
			System.out.println("B+");
		} else if ((gradeVal >= 83)&&(gradeVal <= 86)) {
			System.out.println('B');
		} else if ((gradeVal >= 79)&&(gradeVal <= 82)) {
			System.out.println("C+");
		} else if ((gradeVal >= 75)&&(gradeVal <= 78)) {
			System.out.println('C');
		} else if ((gradeVal >= 70)&&(gradeVal <= 74)) {
			System.out.println('D');
		} else if (gradeVal < 70) {
			System.out.println('F');
		} else if (gradeVal < 0) {
			System.out.println("Invalid input.");
		}




	}
}