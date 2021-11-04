package ug.mak.patterns;

import java.util.Currency;

class BankAccountBuilder {
	//required
	final int NiN;
		
	// optional
	String email;
	String firstName;
	String middlename;
	String surname;
	String StreetAddress;
	long postalCode;
	String country;
	String city;
	long mobileNumber;
	String mobileMoneyProvider;
	Currency balance;
	
	public BankAccountBuilder(int NiN) {
		this.NiN = NiN;
	}
	
	public BankAccountBuilder addEmail(String email) {
		this.email = email;
		return this;
	}
	
	public BankAccountBuilder addFirstName(String firstName) {
		this.firstName = firstName;
		return this;
	}
	
	public BankAccountBuilder addMiddleName(String middlename) {
		this.middlename = middlename;
		return this;
	}
	
	public BankAccountBuilder addSurname(String surname) {
		this.surname = surname;
		return this;
	}
	
	public BankAccountBuilder addStreetAddress(String StreetAddress) {
		this.StreetAddress = StreetAddress;
		return this;
	}
	
	public BankAccountBuilder addPostalCode(long postalCode) {
		this.postalCode = postalCode;
		return this;
	}
	
	public BankAccountBuilder addCountry(String country) {
		this.country = country;
		return this;
	}
	
	public BankAccountBuilder addCity(String city) {
		this.city = city;
		return this;
	}
	
	public BankAccountBuilder addMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
		return this;
	}
	
	public BankAccountBuilder addMobileMoneyProvider(String mobileMoneyProvider) {
		this.mobileMoneyProvider = mobileMoneyProvider;
		return this;
	}
	
	public BankAccountBuilder addBalance(Currency balance) {
		this.balance = balance;
		return this;
	}
	
	public BankAccount build() {
		return new BankAccount(this);
	}
}

public class BankAccount {
	int NiN;
	String email;
	String firstName;
	String middlename;
	String surname;
	String StreetAddress;
	long postalCode;
	String country;
	String city;
	long mobileNumber;
	String mobileMoneyProvider;
	Currency balance;
	
	public BankAccount(BankAccountBuilder builder) {
		NiN = builder.NiN;
		email = builder.email;
		firstName = builder.firstName;
		middlename = builder.middlename;
		surname = builder.surname;
		StreetAddress = builder.StreetAddress;
		postalCode = builder.postalCode;
		country = builder.country;
		city = builder.city;
		mobileNumber = builder.mobileNumber;
		mobileMoneyProvider = builder.mobileMoneyProvider;
		balance = builder.balance;
	}

	public static void main(String[] args) {
		BankAccount myAccount = new BankAccountBuilder(21)
				.addEmail("allan.com")
				.addFirstName("allan")
				.addSurname("Okedi")
				.addStreetAddress("Pool road")
				.addMobileMoneyProvider("MTN")
				.addPostalCode(7062)
				.addCountry("Kawempe")
				.addCity("Kampala")
				.addMobileNumber(0756100562)
				.addMobileMoneyProvider("airtel")
				.build();
		System.out.println(myAccount.mobileMoneyProvider);
	}
}
