package dao;
import Entity.Customer;
import java.util.Set;

public interface EwalletDao {
	Customer findById(String mobileno);
	Set<Customer> allCustomers();
	void addCustomer(Entity.Customer c);

}
