package com.anuja.spring.services;

import org.springframework.stereotype.Service;

@Service
public class TestServices {

	private String name;
	private String address;

	public TestServices() {
		super();
		System.out.println("TEst service constructor");
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}
}
