package Calculator;
import java.util.*;

public class EmployeeUi {
    public static void main(String[] args)
    {
	EmployeeUi ui = new EmployeeUi();
	ui.execute();
    
    }
	

 /* EmployeeMain em=new EmployeeMain();
	 em.print(store);*/
    Map<Integer,Employee> store= new HashMap<>();			
public void execute() {
	
	Employee e1=new Employee(1,"a",100);
 // Employee[] store=new Employee[2];
  //store[0]=new Employee( 1, "a", 100);
	store.put(1,e1);
	
Manager m1=new Manager( 2, "b", 20);
store.put(1,m1);

//store[1]=m1;
m1.addManagedEmployee(e1);
print();
Employee fetched=findById(2);
System.out.println(fetched.getName());

}
  
 public Employee findById(int id) {
	 Employee e=store.get(id);
	 return e;
 } 
  
     //  public void print(Employee[] employee)
    public void print()
    {
    	Set<Integer> keys=store.keySet();
	  for(Integer id : keys)
	  {
		  Employee e=store.get(id);
		  System.out.println(e.getName() + e.getBalance());
		  boolean isManager= e instanceof Manager;
		  if(isManager)
		  {
			  Manager m= (Manager) e;
			  System.out.println("Managed employees");
			  Employee[] managedEmployee = m.getManagedEmployes();
			  for(Employee managed : managedEmployee)
			  {
				  if (managed!=null)
					  System.out.println(managed.getName() + " "+ managed.getBalance());
			  }
		   }
	  }

}}