package com.test.connection;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

import com.dto.oe.Customers;
import com.dto.oe.Inventories;
import com.dto.oe.Order_Items;
import com.dto.oe.Orders;
import com.dto.oe.Product_Information;
import com.dto.oe.UtcTimestampType;
import com.dto.oe.Warehouses;

public class HibernateUtil {
	public static void main(String[] args) {
		new HibernateUtil().getCustomer();
	}

	public List<Inventories> getAllProducts() {

		try {
			String hql = "from Inventories";
			Session session = getSession();
			Query qry = session.createQuery(hql);
			List<Inventories> list = qry.list();
			System.out.println(list.get(0).product_id);
			System.out.println(list.get(0).quantity_on_hand);
			System.out.println(list.get(0).warehouse_id);

			session.close();

			return list;
		} catch (HibernateException e) {
			e.printStackTrace();
		}
		return null;

	}

	public void getProductinfo() {
		// * from CUSTOMERS m where m.CUST_ADDRESS.country_id = 'US';

		try {
			String hql = "from PRODUCT_INFORMATION where product_id=2243";
			Session session = getSession();
			// Product_Information
			Product_Information obj = (Product_Information) session.get(
					Product_Information.class, 2243);
			Query qry = session.createQuery(hql);
			List<Product_Information> list = qry.list();
			System.out.println(obj.getPRODUCT_DESCRIPTION());
			/*
			 * Criteria crieteria = session.createCriteria(
			 * Product_Information.class).add( Restrictions.eq("PRODUCT_ID",
			 * 2243));
			 * 
			 * System.out.println(crieteria.list());
			 */

			session.close();

		} catch (HibernateException e) {
			e.printStackTrace();
		}
	}

	public void getCustomer() {
		try {

			Session session = getSession();
			Customers obj = (Customers) session.get(Customers.class, 327);
			System.out.println(obj.getCUST_FIRST_NAME());
			System.out.println(obj.getCust_addressData() + "cust address data");
			System.out.println("phone numbers"+obj.getPhone_numbers());
			session.close();

		} catch (HibernateException e) {
			e.printStackTrace();
		}
	}

	public void getOrders() {
		try {
			Session session = getSession();
			Orders orders = (Orders) session.get(Orders.class, 2397);
			System.out.println(orders.getORDER_DATE());

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void getOrder_items()
	{
		try {
			Session session = getSession();
			Order_Items orders = (Order_Items) session.get(Order_Items.class, 2355);
			System.out.println(orders.getPRODUCT_ID());

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void getWarehouses()
	{
		try {
			Session session = getSession();
			Warehouses orders = (Warehouses) session.get(Warehouses.class, 2355);
			System.out.println(orders.getWAREHOUSE_NAME());

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@SuppressWarnings("deprecation")
	private Session getSession() {
		Configuration configuration = new Configuration();
		configuration.registerTypeOverride(new UtcTimestampType());
		return configuration.configure().buildSessionFactory().openSession();

	}
}
