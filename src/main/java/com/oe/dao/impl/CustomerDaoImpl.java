package com.oe.dao.impl;

import org.springframework.orm.hibernate4.HibernateTemplate;

import com.oe.dao.CustomerDao;
import com.oe.dto.Customers;

public class CustomerDaoImpl implements CustomerDao{
	
	HibernateTemplate template;  
	public void setTemplate(HibernateTemplate template) {  
	    this.template = template;  
	}

	public Customers getCustomerwithId(Integer customerId) {
		
		Customers e=(Customers)template.get(Customers.class,customerId);  
		return e;
	}

	public void createCustomer(Customers customer) {
		// TODO Auto-generated method stub
		
	}

	public boolean updateCustomer(Customers customer) {
		// TODO Auto-generated method stub
		return false;
	}

	public Customers getCustomer(Integer phoneNumber) {
		// TODO Auto-generated method stub
		return null;
	}

	public Customers getCustomer(String emailId) {
		// TODO Auto-generated method stub
		return null;
	}

	public Integer getCustomerCreditLimit(int customerId) {
		// TODO Auto-generated method stub
		return null;
	}

}
