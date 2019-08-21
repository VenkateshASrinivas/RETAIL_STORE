package com.retail.store.discount;

import com.retail.store.resource.Plan;
import com.retail.store.contants.Constants;

/**
 * The Class Employee.
 *
 * @author veannapa Aug 18, 2019
 */
public class Employee extends Plan {

	/** The m s discount rate. */
	private static int m_sDiscountRate = Constants.EMPLOYEE_DISCOUNT_RATE;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.retail.store.resource.Plan#getRate()
	 */
	@Override
	public Double getRate() {
		return m_dbRate = m_sDiscountRate;

	}

}
