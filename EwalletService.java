package service;
import java.util.Set;

import Entity.Customer;


	public interface EwalletService {
		Customer findById(String mobileno);
		Set<Customer> allCustomers();
		void addCustomer(Customer c);;


}
