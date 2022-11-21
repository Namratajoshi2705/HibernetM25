package org.tnsindia.service;

public interface CustomerService {
	void addCustomer(Customer customer);
	void updateCustomer(Customer customer);
	void deleteCustomer(Customer customer);
	Customer getCustomerById(int cust_ID);
}
