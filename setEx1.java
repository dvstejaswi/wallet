package Calculator;
//import java.util.HashSet;//
import java.util.*;

public class setEx1 {


public static void main(String[] args) {
	Employee e1=new Employee(10, "ram", 1000);
	Employee e2=new Employee(12, "sam", 1000);
	Employee e3=new Employee(13, "kate", 1000);
	Employee e4=new Employee(14, "kane", 1000);
	boolean equals=e1.equals(e2);
	Comparator<Employee>comparator=new EmployeeComparator();
	Set <Employee>set=new TreeSet<>(comparator);
	//LinkedHashSet
	//HashSet
	//boolean added=//
	set.add(e1);
	set.add(e3);
	set.add(e4);
	set.add(e2);
	setEx1 ex1=new setEx1();
	ex1.print(set);
	System.out.println(set);
	int size=set.size();
	System.out.println("size="+size);
	boolean contains=set.contains(e2);
	System.out.println("set contains e2="+contains);
	setEx1 ex=new setEx1();
	ex.print(set);
	boolean removed=set.remove(e2);
	System.out.println("removed="+removed);
	ex.print(set);
	
	
}

public void print(Set<Employee> set) {
	//Employee - oject//
for (Employee e:set) {
	//Employee e=(Employee)o;//
	System.out.println(e.getId()+" "+e.getName());
}
}
}