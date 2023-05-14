package com.spring.Set;

import java.util.Set;

public class Bank {
	private String name;
	private Set<String> accountTypes;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<String> getAccountTypes() {
		return accountTypes;
	}

	public void setAccountTypes(Set<String> accountTypes) {
		this.accountTypes = accountTypes;
	}
}
