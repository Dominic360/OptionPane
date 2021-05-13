package JavaNote8;

import javax.swing.JOptionPane;
/**
 *	Creating a User Input form with jOptionPane
 */
public class InputBox {
	public static void main(String[] args){
		String first_Name;
		String family_Name;
		String full_Name;
		
		first_Name = JOptionPane.showInputDialog("Firest Name", "Enter your first name..");
		family_Name = JOptionPane.showInputDialog("Family Name", "Enter your family name..");
		full_Name = "You are " + first_Name + " " + family_Name;
		
		//To display the Result in a message box
		JOptionPane.showMessageDialog(null, full_Name,"Result", JOptionPane.INFORMATION_MESSAGE);
		
		System.exit(0);
	}
}
