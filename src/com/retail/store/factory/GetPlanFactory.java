package com.retail.store.factory;

import com.retail.store.contants.Constants;
import com.retail.store.discount.Affiliate;
import com.retail.store.discount.Customer;
import com.retail.store.discount.Default;
import com.retail.store.discount.Employee;
import com.retail.store.resource.Plan;

/**
 * A factory for creating GetPlan objects.
 *
 * @author veannapa Aug 18, 2019
 */
public class GetPlanFactory {

	// use getPlan method to get object of type Plan
	/**
	 * Gets the plan.
	 *
	 * @param p_sPlanType
	 *            the p s plan type
	 * @return the plan
	 */
	public Plan getPlan(String p_sPlanType) {
		if (p_sPlanType == null) {
			return null;
		}
		if (p_sPlanType.equalsIgnoreCase(Constants.AFFILIATE_AS_USER)) {
			return new Affiliate();
		} else if (p_sPlanType.equalsIgnoreCase(Constants.CUSTOMER_AS_USER)) {
			return new Customer();
		} else if (p_sPlanType.equalsIgnoreCase(Constants.EMPLOYEE_AS_USER)) {
			return new Employee();
		}
		return new Default();
	}
}
