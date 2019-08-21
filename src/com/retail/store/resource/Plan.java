package com.retail.store.resource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import com.retail.store.model.Products;

/**
 * The Class Plan.
 *
 * @author veannapa Aug 18, 2019
 *
 *         Purpose of this abstract class is to calculate bill based on the
 *         plan.
 */
public abstract class Plan {

	/** The m db rate. */
	protected double m_dbRate;

	/**
	 * Gets the rate.
	 *
	 * @return the rate
	 */
	public abstract Double getRate();

	/** The is discount applicable. */
	boolean isDiscountApplicable = false;

	/** The m i final price. */
	int m_iFinalPrice = 0;

	/** The m d sum. */
	double m_dSum = 0;

	/**
	 * Calculate bill.
	 *
	 * @param m_lstProductsObjects
	 *            the m lst products objects
	 * @param p_mapPODetails
	 *            the p map PO details
	 * @return the string
	 */
	public String calculateBill(List<Products> m_lstProductsObjects, Map<String, String> p_mapPODetails) {

		List<Double> l_lstPriceList = new ArrayList<Double>();
		List<String> l_lstProducts = new ArrayList<String>();
		String l_sProducts = p_mapPODetails.get("Product");
		l_sProducts = l_sProducts.substring(1, l_sProducts.length() - 1);
		String l_sProduct[] = l_sProducts.split(",");
		l_lstProducts = Arrays.asList(l_sProduct);

		for (String p_sProd : l_lstProducts) {
			for (Products p_sProdt : m_lstProductsObjects) {
				if ((p_sProd.trim().equalsIgnoreCase(p_sProdt.getTitle()))
						&& !(p_sProdt.getType().equalsIgnoreCase("Grocery"))) {
					isDiscountApplicable = true;
					l_lstPriceList.add(Double.valueOf(p_sProdt.getPrice()));
				}
			}
		}
		if (l_lstPriceList.isEmpty()) {
			isDiscountApplicable = false;
			for (String p_sProd : l_lstProducts) {
				for (Products p_sProdt : m_lstProductsObjects) {
					if ((p_sProd.trim().equalsIgnoreCase(p_sProdt.getTitle()))) {
						l_lstPriceList.add(Double.valueOf(p_sProdt.getPrice()));
					}
				}
			}
		}

		for (int i = 0; i < l_lstPriceList.size(); i++) {
			m_dSum += l_lstPriceList.get(i);
		}
		return String.valueOf(isDiscountApplicable ? Math.round(getDiscount(m_dSum)) : m_dSum);
	}

	/**
	 * Gets the discount.
	 *
	 * @param p_dSum
	 *            the p d sum
	 * @return the discount
	 */
	public Double getDiscount(Double p_dSum) {
		m_iFinalPrice = (int) ((p_dSum * m_dbRate) / 100);
		m_iFinalPrice = (int) (p_dSum - m_iFinalPrice);
		return (double) m_iFinalPrice;
	}

	/**
	 * Gets the actual amount.
	 *
	 * @return the actual amount the purchase
	 */
	public Double getActuallAmount() {
		return m_dSum;
	}
}
