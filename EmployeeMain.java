package Calculator;

public class EmployeeMain
{

	 public static void main(String []args)
	 {
	 Employee[] store=new Employee[6];
	 
	 store[0]=new Employee(1,"a",200); 
	 store[1]=new Employee(2,"b",300);
	 store[0].addSalary(100);
	 store[1].addSalary(200);
	 
	 
	 Manager m1=new Manager(12,"Man", 10);
	 store[5]=m1;
	 m1.addManagedEmployee(store[0]);
	 
	 EmployeeMain em=new EmployeeMain();
	 em.print(store);
	 
 }
public void print(Employee[] store)
{
for(int i=0;i<2;i++) {
	
	System.out.println("id:"+store[i].getId());
    System.out.println("name:"+store[i].getName());
    System.out.println("balance:"+store[i].getBalance());
}
}
}