package col;
import java.util.*;
public class SetEx {
public static void main(String[] args) {
	Calculator.Employee e1=new Calculator.Employee(10, "sam", 1000);
	Calculator.Employee e2=new Calculator.Employee(11, "ram", 200);
	Calculator.Employee e3=new Calculator.Employee(11, "kate", 200);
	Calculator.Employee e4=new Calculator.Employee(11, "kriti", 200);

		boolean equals=e1.equals(e2);
		System.out.println("equals");
		boolean Same =e1==e2;
		System.out.println("same");
		
}
}
