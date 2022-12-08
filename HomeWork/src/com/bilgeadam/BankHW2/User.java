package com.bilgeadam.BankHW2;

public class User {
	
	public String name;
	public String surname;
	public String email;
	public Account account;
	
	public User(String name, String surname, Account account) {
		
		this.name = name;
		this.surname = surname;
		this.account = account;
	}

	@Override
	public String toString() {
		return "İsim : " + name + " Surname : " + surname +" Email : "+ email +" "+ account;
	}
	
	
	
}
