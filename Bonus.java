import java.util.Scanner;

public class Bonus {
  public static void main(String[] args) {
    Scanner in = new Scanner (System.in);
    System.out.println("ABC Manufacturing Company \n Employee Bonus");
    System.out.println("Please enter the ff:\nName: ");
    String name = in.nextLine();
    System.out.println("Monthly Salary: ");
    double salary = in.nextDouble();
    
    System.out.println("Name: " + name);
    System.out.print("BONUS: P");
    if (salary < 1000) {
      System.out.print(salary/2);  
    } else if (salary > 1000) {
      System.out.print("1000");
                }
              }
            }
    
    