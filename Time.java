import java.util.Scanner;

public class Time {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int mins, hrs, rMins;
		System.out.println("Enter the number of minutes: ");
		mins = sc.nextInt();
		hrs = mins/60;
		rMins = mins%60;
		
		if (rMins == 0){
		System.out.println(mins + " minutes is " + hrs + " hour/s.");
			} else System.out.println(mins + " minutes is " + hrs + " hours and " + rMins + " minutes.");
		}
	}