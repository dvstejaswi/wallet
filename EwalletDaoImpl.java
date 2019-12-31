package dao;
import Entity.Customer;
import Entity.Customer.*;
import exceptions.CustomerNotFoundException;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class EwalletDaoImpl implements EwalletDao {
	 private Map<String, Customer> store = new HashMap<>();
	 
	 @Override
	 public void addCustomer(Customer c) {
		 store.put(c.getMobileno(),c);
	 }
	 
	 @Override
		public Customer findById(String mobileno) {
			Customer c = store.get(mobileno);
			if (c==null) {
				throw new CustomerNotFoundException("customer not found =" +  mobileno);
			}
			return c;
		}
	 
	 @Override
	 public Set<Customer> allCustomers(){
		 Collection<Customer> Customers = store.values();
		 Set<Customer> CustomerSet = new HashSet<>(Customers);
		 return CustomerSet;
	 }

}
