import java.lang.Math;

public class CC2_Lab5 {
	public static void main(String[] srgs) {
		double messageCount = Math.random()*1000;
		
		System.out.println("You have sent " + (int)messageCount + " messages.");
		if (messageCount <= 200) {
			double charge = 0;
			System.out.println("You have incurred " + Dec.format("%.2f", charge) + " PHP in charges.");
		} else if (messageCount > 200) {
			double charge = (messageCount-200)*0.50;
			System.out.println("You have incurred " + String.format("%.2f", charge) + " PHP in charges.");
		}
		
	}

}