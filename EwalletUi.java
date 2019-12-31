package Ui;
import java.util.Collection;
import java.util.Set;

import Entity.Customer;
import dao.EwalletDaoImpl;
import service.EwalletService;
import service.EwalletServiceImpl;
public class EwalletUi {
	private EwalletService service = new EwalletServiceImpl(new EwalletDaoImpl());
	
	 public static void main(String[] args) {
	        EwalletUi ui = new EwalletUi();
	        ui.runUi();
	    }

	 
	 public void runUi() {
		 try {
			 Customer c1= new Customer("7893378000", "sara");
			 Customer c2= new Customer("7893389000", "maira");
			 service.addCustomer(c1);
			 service.addCustomer(c2);
			 Customer fetched1 = service.findById("7893378000");
			 Customer fetched2 = service.findById("7893389000");
			  System.out.println(fetched1.getName());
	            System.out.println(fetched2.getName());
	            System.out.println("********printing all customers****");
	            Set<Customer> customers = service.allCustomers();
	            print(customers);
	        }catch (Throwable e){
	            e.printStackTrace();
	            System.out.println("something went wrong");
	        }
	    }

	    void print(Collection<Customer>customers){
	        for (Customer c:customers){
	            System.out.println(c.getName());
	        }
	    }

		 

}
		 
	 

	
