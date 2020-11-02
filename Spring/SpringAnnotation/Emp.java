package com.spring.auto.wire.annotation;

public class Emp {

	
	public Emp(com.spring.auto.wire.annotation.address address) {
		super();
		this.address = address;
	}

	private address address;

	public address getAddress() {
		return address;
	}

	@Override
	public String toString() {
		return "Emp [address=" + address + "]";
	}

	public void setAddress(address address) {
		this.address = address;
	}

	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
}
