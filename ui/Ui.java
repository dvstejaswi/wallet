package Wallet.ui;

import java.util.*;

import Calculator.Employee;
import Calculator.Manager;
import Wallet.entity.*;

public class Ui {
	public static void main(String[] args) {
		Ui u = new Ui();
		u.execute();

	}

	Map<String, Entity> store = new HashMap<>();

	public void execute() {

		Entity e1 = new Entity("7893378000", "Sam", 200);
		store.put("7893378000", e1);
		Entity fetched = findById("7893378000");
		System.out.println(fetched.getName());

		Entity e2 = new Entity("8893378000", "Ram", 200);
		store.put("8893378000", e2);
		Entity fetched1 = findById("8893378000");
		System.out.println(fetched1.getName());
		print();
	}

	public Entity findById(String mobileno) {
		Entity e = store.get(mobileno);
		return e;
	}

	public void print() {
		Set<String> keys = store.keySet();
		for (String id : keys) {
			Entity A = store.get(id);
			System.out.println(A.getName());
		}
	}

}
