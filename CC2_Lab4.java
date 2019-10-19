import java.util.Scanner;

public class CC2_Lab4 {
  public static void main(String[] args) {
  Scanner in = new Scanner (System.in);
  String name, pet;
  int age;
   
  System.out.print("Enter name:");
  name = in.nextLine();
  System.out.print("Enter age:");
  age = in.nextInt();
  
  System.out.println("PETS:");
  
	if (name.equals("Jhim")|| name.equals("Ethan")){
		if ((age >= 5)&&(age <=10)) {
			System.out.println("Hamster, Dog");
		} else if ((age >= 11)&&(age <= 15)) {
			System.out.println("Spider, Dog");
		} else if ((age >= 16)&&(age <= 20)) {
			System.out.println("Dog, Snake");
		} else if (age == 21) {
			System.out.println("No pets, Not interested");
		}
	} else if (name.equals("Sally")||name.equals("Joy")) {
		if ((age >= 5)&&(age <=10)) {
			System.out.println("Hamster, Cat");
		} else if ((age >= 11)&&(age <= 15)) {
			System.out.println("Cat, Rabbit");
		} else if ((age >= 16)&&(age <= 20)) {
			System.out.println("Cat");
		} else if (age == 21) {
			System.out.println("No pets, Not interested");
		}
	}
  
  }
  

}

