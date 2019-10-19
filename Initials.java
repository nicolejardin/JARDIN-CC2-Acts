import javax.swing.*;

public class Initials {
	public static void main(String[] args) {
		String firstName, middleName, lastName;
		firstName = JOptionPane.showInputDialog("Enter your first name's initial:");
		middleName = JOptionPane.showInputDialog("Enter your middle name's initial:");
		lastName = JOptionPane.showInputDialog("Enter your last name's initial:");
		JOptionPane.showMessageDialog(null, (firstName.charAt(0)) + "." + (middleName.charAt(0)) + "." + (lastName.charAt(0)) + ".");
		}
	}