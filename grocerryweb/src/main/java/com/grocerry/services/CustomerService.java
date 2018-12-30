package com.grocerry.services;

import com.grocerry.model.Customer;
import com.grocerry.model.User;

public interface CustomerService {
	void registerCustomer(Customer customer);
	boolean isEmailValid(String email);
	boolean isUsernameValid(String username);
	User getUser(String username);

}
