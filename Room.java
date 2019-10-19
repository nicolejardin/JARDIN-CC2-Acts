import java.io.*;
import java.text.DecimalFormat;

public class Room {
	public static void main(String[] args)throws IOException{
		BufferedReader in = new BufferedReader (new InputStreamReader (System.in));
	
		System.out.println("Enter length: ");
		String l = in.readLine();
		double length = Double.parseDouble(l);
		System.out.println("Enter width: ");
		String w = in.readLine();
		double width = Double.parseDouble(w);
		DecimalFormat df = new DecimalFormat("######.00");
		
		double area = length*width;
		System.out.println("The floor space of the room is " + df.format(area) + " square units.");
			}
		}