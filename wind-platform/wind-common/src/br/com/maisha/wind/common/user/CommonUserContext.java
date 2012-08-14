/**
 * 
 */
package br.com.maisha.wind.common.user;

import java.util.HashMap;
import java.util.Map;

/**
 * Common implementation of {@link IUserContext}
 * 
 * @author Paulo Freitas (pfreitas1@gmail.com)
 */
public class CommonUserContext implements IUserContext {

	/** Storage. */
	private Map<UserData, Object> storage = new HashMap<UserData, Object>();

	/**
	 * 
	 * @param sessionId
	 *            Session ID
	 */
	public CommonUserContext(String sessionId) {
		storeUserData(UserData.SESSION_ID, sessionId);
	}

	/**
	 * @see br.com.maisha.wind.common.user.IUserContext#getUserData(br.com.maisha.wind.common.user.IUserContext.UserData)
	 */
	@SuppressWarnings("unchecked")
	public <T> T getUserData(UserData key) {
		return (T) storage.get(key);
	}

	/**
	 * @see br.com.maisha.wind.common.user.IUserContext#storeUserData(br.com.maisha.wind.common.user.IUserContext.UserData,
	 *      java.lang.Object)
	 */
	public void storeUserData(UserData key, Object value) {
		storage.put(key, value);
	}

	/**
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return getUserData(UserData.SESSION_ID);
	}
}
