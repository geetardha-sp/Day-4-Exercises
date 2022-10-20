package com.sechpoint;

public class Customer {
	@JsonIgnore
	int customerId;
	String name;
	
	public Customer(int customerId, String name) {
		super();
		this.customerId = customerId;
		this.name = name;
	}

	@JsonIgnore(ignoreJson = "Ignore Json (Customer)")
	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
