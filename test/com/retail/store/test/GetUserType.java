package com.retail.store.test;

import java.util.List;

import com.retail.store.model.User;

/**
 * The Class GetUserType.
 */
public class GetUserType {

	/**
	 * Gets the user type.
	 *
	 * @param p_sUserName
	 *            the p s user name
	 * @param m_lstUserObjects
	 *            the m lst user objects
	 * @return the user type
	 */
	public static String getUserType(String p_sUserName, List<User> m_lstUserObjects) {
		String l_sUserType = "Default";
		for (User user : m_lstUserObjects) {
			if (p_sUserName.equalsIgnoreCase(user.getUsername())) {
				l_sUserType = user.getUserType();
			}
		}
		return l_sUserType;
	}
}
