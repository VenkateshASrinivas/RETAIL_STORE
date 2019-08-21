package com.retail.store.test;

import java.text.MessageFormat;
import java.util.Map;

import com.retail.store.resource.Plan;

/**
 * The Class BillTemplate.
 */
public class BillTemplate {

	/**
	 * Gets the bill template.
	 *
	 * @param p_sPlanType
	 *            the p s plan type
	 * @param p_dDiscountRate
	 *            the p d discount rate
	 * @param pm_objPODetails
	 *            the pm obj PO details
	 * @param p_sTotal
	 *            the p s total
	 * @param p_objPlan
	 *            the p obj plan
	 * @return the bill template
	 */
	public static String getBillTemplate(String p_sPlanType, Double p_dDiscountRate,
			Map<String, String> pm_objPODetails, String p_sTotal, Plan p_objPlan) {
		java.util.Date m_sDate = new java.util.Date();

		return MessageFormat.format(
				"----------------------------------------" + "\r\n " + "--------Retail Store--------" + "\r\n "
						+ "--------Total Bill (in $) ---------" + "\r\n " + "{3}" + "\r\n " + "PLAN TYPE : {0}" + "\r\n "
						+ "Items : {2}" + "\r\n " + "Total Bill : {5}" + "\r\n " + "DISCOUNT RATE : {1}%" + "\r\n "
						+ "AMOUNT TO BE PAID AFTER DISCOUT : {4}" + "\r\n " + "NOTE : DISCOUNT NOT APPLICABLE ON GROCERIES**" + "\r\n "
						+ "----------------------------------------",
				new String[] { p_sPlanType, String.valueOf(p_dDiscountRate), pm_objPODetails.get("Product"),
						String.valueOf(m_sDate), p_sTotal, String.valueOf(p_objPlan.getActuallAmount()) });
	}
}
