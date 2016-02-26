package com.dao.oe;

import com.dto.oe.Customers;

public interface CustomerDao {
	public Customers getCustomer(int customerId);

	public void createCustomer(Customers customer);

	public boolean updateCustomer(Customers customer);
	
	public Customers getCustomer(Integer phoneNumber);
	
}
