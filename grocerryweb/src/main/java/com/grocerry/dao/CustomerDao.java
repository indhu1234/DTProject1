package com.grocerry.dao;

import com.grocerry.model.Customer;
import com.grocerry.model.User;

public interface CustomerDao {
	 
	void registerCustomer(Customer customer);
	boolean isEmailValid(String email);
	boolean isUsernameValid(String username);
	User getUser(String username);
	
}
