package com.test.connection;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

import com.dto.oe.Customers;
import com.dto.oe.Inventories;
import com.dto.oe.Product_Information;

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
			// String hql = "from PRODUCT_INFORMATION where product_id=2243";
			Session session = getSession();
			// Product_Information
			// obj=(Product_Information)session.get(Product_Information.class,
			// 2243);
			// Query qry = session.createQuery(hql);
			// List<Product_Information> list = qry.list();
			// System.out.println(obj.getPRODUCT_DESCRIPTION());
			Criteria crieteria = session.createCriteria(
					Product_Information.class).add(
					Restrictions.eq("PRODUCT_ID", 2243));

			System.out.println(crieteria.list());

			session.close();

		} catch (HibernateException e) {
			e.printStackTrace();
		}
	}

	public void getCustomer() {
		try {

			Session session = getSession();
			Customers obj = (Customers) session.get(Customers.class, 102);
			System.out.println(obj.getCUST_FIRST_NAME());
			System.out.println(obj.getCust_addressData()+"cust address data");
			session.close();

		} catch (HibernateException e) {
			e.printStackTrace();
		}
	}

	@SuppressWarnings("deprecation")
	private Session getSession() {
		return new Configuration().configure().buildSessionFactory()
				.openSession();
	}
}
