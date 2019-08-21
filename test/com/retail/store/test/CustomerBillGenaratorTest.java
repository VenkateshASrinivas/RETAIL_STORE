/*
 * 
 */
package com.retail.store.test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.BeforeClass;
import org.junit.Test;

import com.retail.store.factory.GetPlanFactory;
import com.retail.store.parser.ProductsJSONReader;
import com.retail.store.parser.UserJSONReader;
import com.retail.store.resource.Plan;

/**
 * The Class CustomerBillGenaratorTest.
 *
 * @author veannapa Aug 18, 2019
 */
public class CustomerBillGenaratorTest {

	/** The m s plan type. */
	private static String m_sPlanType;

	/** The m lst products. */
	private static List<String> m_lstProducts;

	/** The m obj PO details. */
	private static Map<String, String> m_objPODetails = new HashMap<String, String>();

	/** The m obj plan factory. */
	private static GetPlanFactory m_objPlanFactory = new GetPlanFactory();

	/** The l obj plan. */
	private static Plan l_objPlan;

	/**
	 * Sets the up before class.
	 *
	 * @throws Exception
	 *             the exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		m_lstProducts = new ArrayList<String>();
		m_lstProducts.add("Brown eggs");
		m_lstProducts.add("Asparagus");
		m_lstProducts.add("Papaya");
		m_lstProducts.add("Godrej");
		m_lstProducts.add("Himalaya");
		m_objPODetails.put("Product", m_lstProducts.toString());
	}

	/**
	 * Purchase orders.
	 *
	 * @throws IOException
	 *             Signals that an I/O exception has occurred.
	 */
	@Test
	public void purchaseOrders() throws IOException {
		getPurchaseOrderBill(m_objPODetails);
	}

	/**
	 * Gets the purchase order bill.
	 *
	 * @param p_mapPODetails
	 *            the p map PO details
	 * @return the purchase order bill
	 * @throws IOException
	 *             Signals that an I/O exception has occurred.
	 */
	private static void getPurchaseOrderBill(Map<String, String> p_mapPODetails) throws IOException {
		String l_iTotal = "";
		Double l_dDiscountRate = null;
		m_sPlanType = GetUserType.getUserType("Antonette", UserJSONReader.reader());
		l_objPlan = m_objPlanFactory.getPlan(m_sPlanType);
		l_dDiscountRate = l_objPlan.getRate();
		l_iTotal = l_objPlan.calculateBill(ProductsJSONReader.reader(), p_mapPODetails);

		String result = BillTemplate.getBillTemplate(m_sPlanType, l_dDiscountRate, p_mapPODetails, l_iTotal, l_objPlan);
		System.out.println(result);
	}

}
