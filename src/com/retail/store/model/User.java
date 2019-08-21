package com.retail.store.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * The Class User.
 *
 * @author veannapa Aug 18, 2019
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class User {

	/** The m s name. */
	private String m_sName;

	/** The m s username. */
	private String m_sUsername;

	/** The m s email. */
	private String m_sEmail;

	/** The m user type. */
	private String m_UserType;

	/** The m s member ship. */
	private String m_sMemberShip;

	/**
	 * Gets the name.
	 *
	 * @return the name
	 */
	public String getName() {
		return m_sName;
	}

	/**
	 * Sets the name.
	 *
	 * @param p_sName
	 *            the new name
	 */
	public void setName(String p_sName) {
		this.m_sName = p_sName;
	}

	/**
	 * Gets the username.
	 *
	 * @return the username
	 */
	public String getUsername() {
		return m_sUsername;
	}

	/**
	 * Sets the username.
	 *
	 * @param p_sUsername
	 *            the new username
	 */
	public void setUsername(String p_sUsername) {
		this.m_sUsername = p_sUsername;
	}

	/**
	 * Gets the email.
	 *
	 * @return the email
	 */
	public String getEmail() {
		return m_sEmail;
	}

	/**
	 * Sets the email.
	 *
	 * @param p_sEmail
	 *            the new email
	 */
	public void setEmail(String p_sEmail) {
		this.m_sEmail = p_sEmail;
	}

	/**
	 * Gets the user type.
	 *
	 * @return the user type
	 */
	public String getUserType() {
		return m_UserType;
	}

	/**
	 * Sets the user type.
	 *
	 * @param p_sUserType
	 *            the new user type
	 */
	public void setUserType(String p_sUserType) {
		this.m_UserType = p_sUserType;
	}

	/**
	 * Gets the member ship.
	 *
	 * @return the member ship
	 */
	public String getMemberShip() {
		return m_sMemberShip;
	}

	/**
	 * Sets the member ship.
	 *
	 * @param p_sMemberShip
	 *            the new member ship
	 */
	public void setMemberShip(String p_sMemberShip) {
		this.m_sMemberShip = p_sMemberShip;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "User [Name=" + m_sName + ", Membership=" + m_sMemberShip + ", Username=" + m_sUsername + ", Email="
				+ m_sEmail + ", User Type=" + m_UserType + "]";
	}
}
