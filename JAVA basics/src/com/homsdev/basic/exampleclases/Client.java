package com.homsdev.basic.exampleclases;

public class Client {

	private String name;
	private String account;
	private double total;

	public Client(String name, String account, double total) {
		super();
		this.name = name;
		this.account = account;
		this.total = total;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	@Override
	public String toString() {
		return "Client [name=" + name + ", account=" + account + ", total=" + total + "]";
	}

	
}
