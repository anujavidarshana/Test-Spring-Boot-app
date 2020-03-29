package com.anuja.spring.services;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@PropertySource("file:./override/override.properties")
public class Test {

//	private String ymlValue;

	@Value("${app.anuja.name}")
	private String testName;
	private String testAge;

	public Test() {
		super();
		System.out.println("test constructor");
	}

	/**
	 * @return the testName
	 */
	public String getTestName() {
		return testName;
	}

	/**
	 * @param testName the testName to set
	 */
	public void setTestName(String testName) {
		this.testName = testName;
	}

	/**
	 * @return the testAge
	 */
	public String getTestAge() {
		return testAge;
	}

	/**
	 * @param testAge the testAge to set
	 */
	public void setTestAge(String testAge) {
		this.testAge = testAge;
	}

}
