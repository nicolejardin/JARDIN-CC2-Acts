public class VariablesAndDataTypes {
  public static void main(String[] args) {
	String baguioTemp = "The temperature in Baguio has warmed throughout the years.";
	char article = 'A';
	float avgTemp = 16.0f;
	double noonTemp = 23.5;
	byte hours = 24;
	short days = 7;
	int weeks = 4;
	long months = 12;
	boolean f = false, t = true;
  
  if (t == false) {
		System.out.print(baguioTemp + "\n");
		System.out.print("\t" + article + " recent news article stated that the City has been averaging " + avgTemp + " degrees celsius at dawn and " + noonTemp + " at noon.\n");
		System.out.print("\t\tRegardless, lowlanders still feel cold " + hours + " hours a day " + days + ", days a week, " + weeks + " weeks per month and " + months + " months each year.\n");
  } else {
			System.out.print("The boolean was changed to a False value.");
		}
	}
  }
  