/**
 * 
 */
package br.com.maisha.wind.common.user;

/**
 * Determines what kind of data can be stored at "session scope" per user
 * 
 * 
 * @author Paulo Freitas (pfreitas1@gmail.com)
 */
public interface IUserContext {

	/** Key used to store a UserContext at a session scope. */
	public static final String USER_CONTEXT = "userContext";
	
	public static enum UserData {
		SESSION_ID, NAVIGATION_HISTORY, NAVIGATION_TRAIL, OPENED_INSTANCE, OPENED_OBJECT
	}

	/**
	 * Retrieve information stored under the given key
	 * 
	 * @param key
	 *            UserData used to store information to be retrieved.
	 * @return Information stored.
	 */
	<T> T getUserData(UserData key);

	/**
	 * Stores some information under the given key
	 * 
	 * @param key
	 *            UserData to use as key.
	 * @param value
	 *            Value to be stored.
	 */
	void storeUserData(UserData key, Object value);

}
