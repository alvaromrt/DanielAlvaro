package my_pack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * User interface for the AccessControl class
 * @author Pablo Sánchez (p.sanchez@unican.es)
 *		   http://personales.unican.es/sanchezbp
 */
public class AuthorizationView {
	
	/**
	 * This function simply shows a message on the console asking for a string
	 * and read such a string from the standard input
	 * @param prompt Message to be displayed on the console for asking for a string
	 * @return The string read as input from the console
	 */
	private String readStringWithPrompt(String prompt) {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print(prompt);
		String text = null;
		try {
			text = in.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		} // try
		return text;
	}
	
	/** 
	 * Function for asking for a username by console
	 * @return The introduced username
	 */
	public String askForUsername() {
		
		String name = this.readStringWithPrompt("Username : ");
		return name;
	} // askForUsername
	
	/** 
	 * Function for asking for a username by console
	 * @return The introduced username
	 */
	public String askForPassword() {

		String name = this.readStringWithPrompt("Password : ");
		return name;
	} // askForPassword

} // AuthorizationView
