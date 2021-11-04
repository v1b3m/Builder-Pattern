package ug.mak.patterns;

import java.util.Currency;

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
	
	public static class Builder {
		//required
		private final int NiN;
		
		// optional
		private String email;
		private String firstName;
		private String middlename;
		private String surname;
		private String StreetAddress;
		private long postalCode;
		private String country;
		private String city;
		private long mobileNumber;
		private String mobileMoneyProvider;
		private Currency balance;
		
		public Builder(int NiN) {
			this.NiN = NiN;
		}
		
		public Builder addEmail(String email) {
			this.email = email;
			return this;
		}
		
		public Builder addFirstName(String firstName) {
			this.firstName = firstName;
			return this;
		}
		
		public Builder addMiddleName(String middlename) {
			this.middlename = middlename;
			return this;
		}
		
		public Builder addSurname(String surname) {
			this.surname = surname;
			return this;
		}
		
		public Builder addStreetAddress(String StreetAddress) {
			this.StreetAddress = StreetAddress;
			return this;
		}
		
		public Builder addPostalCode(long postalCode) {
			this.postalCode = postalCode;
			return this;
		}
		
		public Builder addCountry(String country) {
			this.country = country;
			return this;
		}
		
		public Builder addCity(String city) {
			this.city = city;
			return this;
		}
		
		public Builder addMobileNumber(long mobileNumber) {
			this.mobileNumber = mobileNumber;
			return this;
		}
		
		public Builder addMobileMoneyProvider(String mobileMoneyProvider) {
			this.mobileMoneyProvider = mobileMoneyProvider;
			return this;
		}
		
		public Builder addBalance(Currency balance) {
			this.balance = balance;
			return this;
		}
		
		public BankAccount build() {
			return new BankAccount(this);
		}
	}
	
	private BankAccount(Builder builder) {
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
		BankAccount myAccount = new BankAccount.Builder(21)
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
