package com.spring.auto.wire;

public class Emp {

	
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

	public Emp(com.spring.auto.wire.address address) {
		super();
		this.address = address;
	}
	
}
