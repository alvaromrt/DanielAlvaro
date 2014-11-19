package my_pack;

/**
 * Class which is on charge of controlling access to confidential information
 * @author Pablo Sánchez (p.sanchez@unican.es)
 * 		   http://personales.unican.es/sanchezbp	
 */
public class AccessControl {
	
	/**
	 * Unique username and password. Security is high in this toy application :-)
	 */
	static final protected String USERNAME = "Go";
	static final protected String PASSWORD = "Go";
	
	
	//**------------------------------------------------------------------------**//
	//** 						Class Public Interface						    **//
	//**------------------------------------------------------------------------**//
	
	/**
	 * This method ask for a username and a password, and if the data corresponds 
	 * to the ones stored in the application, it returns true. Otherwise, it is false.
	 * @return true if the user is login in successfully, otherwise false 
	 */
	public boolean hasAccess() {
		
		String data [] = getUsernameAndPassword();
		
		return data[0].equals(USERNAME) &&
			   data[1].equals(PASSWORD);
	} // hasAccess
	
	
	//**------------------------------------------------------------------------**//
	//** 						    Helper methods 								**//
	//**------------------------------------------------------------------------**//
	
	/**
	 * Returns the pair username, password after reading them by console
	 * @return The pair username and password. The username is returned 
	 * 		   in the zero position, and the password is returned in the 
	 *         the next one. 
	 */
	protected String [] getUsernameAndPassword() {
		
		AuthorizationView view = new AuthorizationView();
		
		String result [] = new String[2];
		
		result[0] = view.askForUsername();
        result[1] = view.askForPassword();
 
		return result;
        
	}  // getUsernameAndPassword
	
} // AccessControl
