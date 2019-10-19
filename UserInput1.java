import javax.swing.*;

public class UserInput1 {
	public static void main(String[] args) {
		String name="";
		name = JOptionPane.showInputDialog("Enter your name: ");
		JOptionPane.showMessageDialog(null,"Hi " + name);
		}
	}