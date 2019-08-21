package com.retail.store.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * The Class Products.
 *
 * @author veannapa Aug 18, 2019
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Products {

	/** The m s title. */
	private String m_sTitle;

	/** The m s type. */
	private String m_sType;

	/** The m s description. */
	private String m_sDescription;

	/** The m s price. */
	private String m_sPrice;

	/**
	 * Gets the title.
	 *
	 * @return the title
	 */
	public String getTitle() {
		return m_sTitle;
	}

	/**
	 * Sets the title.
	 *
	 * @param p_sTitle
	 *            the new title
	 */
	public void setTitle(String p_sTitle) {
		this.m_sTitle = p_sTitle;
	}

	/**
	 * Gets the type.
	 *
	 * @return the type
	 */
	public String getType() {
		return m_sType;
	}

	/**
	 * Sets the type.
	 *
	 * @param p_sType
	 *            the new type
	 */
	public void setType(String p_sType) {
		this.m_sType = p_sType;
	}

	/**
	 * Gets the description.
	 *
	 * @return the description
	 */
	public String getDescription() {
		return m_sDescription;
	}

	/**
	 * Sets the description.
	 *
	 * @param p_sDescription
	 *            the new description
	 */
	public void setDescription(String p_sDescription) {
		this.m_sDescription = p_sDescription;
	}

	/**
	 * Gets the price.
	 *
	 * @return the price
	 */
	public String getPrice() {
		return m_sPrice;
	}

	/**
	 * Sets the price.
	 *
	 * @param p_sPrice
	 *            the new price
	 */
	public void setPrice(String p_sPrice) {
		this.m_sPrice = p_sPrice;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Product Details : [Title =" + m_sTitle + "," + " Description =" + m_sDescription + "," + " Type ="
				+ m_sType + ", Price=" + m_sPrice + "]";
	}

}
