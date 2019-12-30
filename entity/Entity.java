package Wallet.entity;
import java.util.*;

import bank.entity.Account;
public class Entity {
	private String mobileno;
	private String name;
	private double balance;
	public String getMobileno() {
		return mobileno;
	}
	public void setMobileno(String mobileno) {
		this.mobileno = mobileno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	
	
	
	public Entity() {}
	public Entity(String mobileno, String name, double balance)
	{
		this.mobileno=mobileno;
		this.name=name;
		this.balance=balance;
		
	}
	public String transfer(Entity b, double amt)
	{
		this.balance +=amt;
		b.balance -=amt;
		return "The balance after crediting is" + this.balance +  "The balance after debting is" + b.balance;
	}

}
