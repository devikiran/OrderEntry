package com.oe.dao;

import com.oe.dto.Customers;

public interface CustomerDao {
	
	public Customers getCustomerwithId(Integer customerId);

	public void createCustomer(Customers customer);

	public boolean updateCustomer(Customers customer);
	
	public Customers getCustomer(Integer phoneNumber);
	
	public Customers getCustomer(String emailId);
	
	public Integer getCustomerCreditLimit(int customerId);
	
}
