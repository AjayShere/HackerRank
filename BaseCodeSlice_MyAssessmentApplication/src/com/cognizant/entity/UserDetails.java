//package com.cognizant.entity;
//
//import java.util.List;
//
//import javax.persistence.CascadeType;
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.FetchType;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.OneToMany;
//
//
//
//
//@Entity
//public class UserDetails {
//
//	@Id
//	@GeneratedValue(strategy=GenerationType.AUTO)
//	@Column(name = "ACCOUNT_NUMBER")
//	long accountNumber;
//	String accountType;
//	String accountHolderName;
//	long acconutBalance;
//	
//	
//	@OneToMany(mappedBy = "userDtails", cascade = CascadeType.ALL,fetch=FetchType.LAZY)
//		private List<ApplyHomeLoan> homeLoan;
//	public  UserDetails(){}                   
//	public List<ApplyHomeLoan> getHomeLoan() {
//			return homeLoan;
//		}
//		public void setHomeLoan(List<ApplyHomeLoan> homeLoan) {
//			this.homeLoan = homeLoan;
//		}
//		@OneToMany(cascade=CascadeType.ALL,fetch=FetchType.LAZY)
//		@JoinColumn(name="ACCOUNT_NUMBER")
//	public long getAccountNumber() {
//		return accountNumber;
//	}
//	public void setAccountNumber(long accountNumber) {
//		this.accountNumber = accountNumber;
//	}
//	public String getAccountType() {
//		return accountType;
//	}
//	public void setAccountType(String accountType) {
//		this.accountType = accountType;
//	}
//	public String getAccountHolderName() {
//		return accountHolderName;
//	}
//	public void setAccountHolderName(String accountHolderName) {
//		this.accountHolderName = accountHolderName;
//	}
//	public long getAcconutBalance() {
//		return acconutBalance;
//	}
//	public void setAcconutBalance(long acconutBalance) {
//		this.acconutBalance = acconutBalance;
//	}
//	
//	public UserDetails( String accountType, String accountHolderName, long acconutBalance
//			) {
//		super();
//	//	this.accountNumber = accountNumber;
//		this.accountType = accountType;
//		this.accountHolderName = accountHolderName;
//		this.acconutBalance = acconutBalance;
//		//this.homeLoan = homeLoan;
//	}
//	@Override
//	public String toString() {
//		return "UserDetails [accountNumber=" + accountNumber + ", accountType=" + accountType + ", accountHolderName="
//				+ accountHolderName + ", acconutBalance=" + acconutBalance + "]";
//	}
//
//	
//}


package com.cognizant.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class UserDetails {
	
	@Id
	@Column(name="AccountNumber")
    long Account_Number;
	
	String Account_Type,Account_HolderName;
	long Account_balance;
	
	
	@OneToMany(mappedBy = "userDetails", cascade = CascadeType.ALL,fetch=FetchType.LAZY)
	private List<ApplyHomeLoan> list;
	public List<ApplyHomeLoan> getList() {
		return list;
	}
	public void setList(List<ApplyHomeLoan> list) {
		this.list = list;
	}
	public  UserDetails()
	{}
	
	
	
	@OneToMany(cascade=CascadeType.ALL,fetch=FetchType.LAZY)
	@JoinColumn(name="AccountNumber")
	public long getAccount_Number() {
		return Account_Number;
	}
	public void setAccount_Number(long account_Number) {
		Account_Number = account_Number;
	}
	
	
	public String getAccount_Type() {
		return Account_Type;
	}
	public void setAccount_Type(String account_Type) {
		Account_Type = account_Type;
	}
	public String getAccount_HolderName() {
		return Account_HolderName;
	}
	public void setAccount_HolderName(String account_HolderName) {
		Account_HolderName = account_HolderName;
	}
	public long getAccount_balance() {
		return Account_balance;
	}
	public void setAccount_balance(long account_balance) {
		Account_balance = account_balance;
	}
	

	public UserDetails(long account_Number, String account_Type, String account_HolderName, long account_balance) {
		super();
		Account_Number = account_Number;
		Account_Type = account_Type;
		Account_HolderName = account_HolderName;
		Account_balance = account_balance;
	}
	@Override
	public String toString() {
		return "UserDetails [Account_Number=" + Account_Number + ", Account_Type=" + Account_Type
				+ ", Account_HolderName=" + Account_HolderName + ", Account_balance=" + Account_balance + ", list="
				+ list + "]";
	}
		
	
	
	
	
}
