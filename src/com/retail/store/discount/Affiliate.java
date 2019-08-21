package com.retail.store.discount;

import com.retail.store.contants.Constants;
import com.retail.store.resource.Plan;

/**
 * The Class Affiliate.
 *
 * @author veannapa Aug 18, 2019
 */
public class Affiliate extends Plan {

	/** The m s discount rate. */
	private static int m_sDiscountRate = Constants.AFFILIATE_DISCOUNT_RATE;

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
