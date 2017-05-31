/*package com.cognizant.entity;

import java.util.Date;

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
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.cognizant.entity.UserDetails;

@Entity
//@Table(name="Home_Loan_Details")
public class ApplyHomeLoan {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	long homeLoanId;
	
	// @Column(name="LOAN_AMOUNT")
	long loanAmount;
	
	// @Column(name="LOAN_DURATION")
	 int loanDuration;
	 
	 //long accountNumber;
	
	 String loanApplyDate;
	 long annualIncome;
	 String companyName;
	 String designation;
	 int totalExperience;
	 int currentExperience;
	 @GeneratedValue(strategy=GenerationType.AUTO )
	 long loanAccountNumber;
//	 public long getAccountNumber() {
//		return accountNumber;
//	}
//	public void setAccountNumber(long accountNumber) {
//		this.accountNumber = accountNumber;
//	}
	public long getLoanAccountNumber() {
		return loanAccountNumber;
	}
	public void setLoanAccountNumber(long loanAccountNumber) {
		this.loanAccountNumber = loanAccountNumber;
	}


	@ManyToOne(fetch=FetchType.LAZY,cascade=CascadeType.ALL)
	 @JoinColumn(name = "ACCOUNT_NUMBER")
		private UserDetails userDtails;
	 
	 public UserDetails getUserDtails() {
		return userDtails;
	}
	public void setUserDtails(UserDetails userDtails) {
		this.userDtails = userDtails;
	}



	 
	public long getHomeLoanId() {
		return homeLoanId;
	}
	public void setHomeLoanId(long homeLoanId) {
		this.homeLoanId = homeLoanId;
	}
	public long getLoanAmount() {
		return loanAmount;
	}
	public void setLoanAmount(long loanAmount) {
		this.loanAmount = loanAmount;
	}
	public int getLoanDuration() {
		return loanDuration;
	}
	public void setLoanDuration(int loanDuration) {
		this.loanDuration = loanDuration;
	}
	
	public String getLoanApplyDate() {
		return loanApplyDate;
	}
	public void setLoanApplyDate(String loanApplyDate) {
		this.loanApplyDate = loanApplyDate;
	}
	public long getAnnualIncome() {
		return annualIncome;
	}
	public void setAnnualIncome(long annualIncome) {
		this.annualIncome = annualIncome;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public int getTotalExperience() {
		return totalExperience;
	}
	public void setTotalExperience(int totalExperience) {
		this.totalExperience = totalExperience;
	}
	public int getCurrentExperience() {
		return currentExperience;
	}
	public void setCurrentExperience(int currentExperience) {
		this.currentExperience = currentExperience;
	}
	@Override
	public String toString() {
		return "HomeLoan [homeLoanId=" + homeLoanId + ", loanAmount=" + loanAmount + ", loanDuration=" + loanDuration
				+ ", loanApplyDate=" + loanApplyDate + ", annualIncome="
				+ annualIncome + ", companyName=" + companyName + ", designation=" + designation + ", totalExperience="
				+ totalExperience + ", currentExperience=" + currentExperience + "]";
	}
	public ApplyHomeLoan( long loanAmount, int loanDuration, String loanApplyDate,
			long annualIncome, String companyName, String designation, int totalExperience, int currentExperience,UserDetails userDetails) {

	
		this.loanAmount = loanAmount;
		this.loanDuration = loanDuration;
		this.loanApplyDate = loanApplyDate;
		this.annualIncome = annualIncome;
		this.companyName = companyName;
		this.designation = designation;
		this.totalExperience = totalExperience;
		this.currentExperience = currentExperience;
		this.userDtails=userDetails;
	}
	
	  
	public ApplyHomeLoan(){}	
}
*/

package com.cognizant.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class ApplyHomeLoan {

	
	
	
	//@GeneratedValue(strategy=GenerationType.AUTO)
	String loanID;
	
	
	@Id
	long loanAccountNumber;
	
	long annualIncome,loanAmount;
	int loanDuration,totalExperience,currentExperience;
	String designation;
	Date loanApplyDate;
	
	@ManyToOne(fetch=FetchType.LAZY,cascade=CascadeType.ALL)
	 @JoinColumn(name = "AccountNumber")
	private UserDetails userDetails;

	
 
	public long getLoanAccountNumber() {
		return loanAccountNumber;
	}

	public void setLoanAccountNumber(long loanAccountNumber) {
		this.loanAccountNumber = loanAccountNumber;
	}

	public UserDetails getUserDetails() {
		return userDetails;
	}

	public void setUserDetails(UserDetails userDetails) {
		this.userDetails = userDetails;
	}


	public ApplyHomeLoan(){
		
	}
	
	
	public ApplyHomeLoan( long annualIncome, long loanAmount, int loanDuration,
			int totalExperience, int currentExperience, String designation, Date loanApplyDate,
			UserDetails userDetails) {
		super();
		//this.loanID = loanID;
		this.annualIncome = annualIncome;
		this.loanAmount = loanAmount;
		//Account_number = account_number;
		this.loanDuration = loanDuration;
		this.totalExperience = totalExperience;
		this.currentExperience = currentExperience;
		this.designation = designation;
		this.loanApplyDate = loanApplyDate;
		this.userDetails = userDetails;
	}

	public long getAnnualIncome() {
		return annualIncome;
	}
	public String getLoanID() {
		return loanID;
	}

	public void setLoanID(String loanID) {
		this.loanID = loanID;
	}

	public void setAnnualIncome(long annualIncome) {
		this.annualIncome = annualIncome;
	}
	public long getLoanAmount() {
		return loanAmount;
	}
	public void setLoanAmount(long loanAmount) {
		this.loanAmount = loanAmount;
	}
	public int getLoanDuration() {
		return loanDuration;
	}
	public void setLoanDuration(int loanDuration) {
		this.loanDuration = loanDuration;
	}
	public int getTotalExperience() {
		return totalExperience;
	}
	public void setTotalExperience(int totalExperience) {
		this.totalExperience = totalExperience;
	}
	public int getCurrentExperience() {
		return currentExperience;
	}
	public void setCurrentExperience(int currentExperience) {
		this.currentExperience = currentExperience;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}

    @Temporal(TemporalType.DATE)
	public Date getLoanApplyDate() {
		return loanApplyDate;
	}
	public void setLoanApplyDate(Date loanApplyDate) {
		this.loanApplyDate = loanApplyDate;
	}

	@Override
	public String toString() {
		return "ApplyHomeLoan [loanID=" + loanID + ", loanAccountNumber=" + loanAccountNumber + ", annualIncome="
				+ annualIncome + ", loanAmount=" + loanAmount + ", loanDuration=" + loanDuration + ", totalExperience="
				+ totalExperience + ", currentExperience=" + currentExperience + ", designation=" + designation
				+ ", loanApplyDate=" + loanApplyDate + "]";
	}

	
	
	
	
	
	

}
