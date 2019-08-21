package com.retail.store.discount;

import com.retail.store.resource.Plan;

/**
 * The Class Default.
 *
 * @author veannapa Aug 18, 2019
 */
public class Default extends Plan {

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.retail.store.resource.Plan#getRate()
	 */
	@Override
	public Double getRate() {
		return m_dbRate = 0;
	}
}
