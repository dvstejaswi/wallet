package service;
import java.util.Set;

import Entity.Customer;
import dao.EwalletDao;
import exceptions.IncorrectIdException;

public class EwalletServiceImpl implements EwalletService {
	private EwalletDao dao;
	
	public EwalletServiceImpl(EwalletDao dao) {
		this.dao=dao;
	}

	
	 @Override
	 public void addCustomer(Customer c) {
		 dao.addCustomer(c);
	 }
	
	
	@Override
	public Customer findById(String mobileno) {
		if(mobileno==null || mobileno.length()!=10) {
			throw new IncorrectIdException("incorrect id");
			
		}
		Customer c=dao.findById(mobileno);
		return c;
	}
	
	@Override
	public Set<Customer> allCustomers(){
		Set<Customer> customers=dao.allCustomers();
		return customers;
	}
}
