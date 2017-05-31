package com.cognizant.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.cognizant.dao.ApplyHomeLoanDAO;
import com.cognizant.entity.ApplyHomeLoan;
import com.cognizant.entity.UserDetails;


@Component
@Transactional
public class ApplyHomeLoanService {
	
	@Autowired
	ApplyHomeLoanDAO applyHomeLoanDAO;
	 ApplyHomeLoan obj;
	 UserDetails userDetails=new UserDetails ();
	 ApplyHomeLoanService applyHomeLoanService;
	 
	public void insertHomeDetails(UserDetails userDetails){
		
	//for(ApplyHomeLoan obj:userDetails)
		applyHomeLoanDAO.inserHomeLoanDetails(userDetails);
		
	}
	
	public String generateRandomNumber(long accoNum ){
		
		String a=String.valueOf(accoNum).substring(13);
		String id="HL-"+a;
		return id;
	}

	public long generateLoanAccNumber() {
		Long num=(long) (Math.random() * 100000000000000L);
		return num;
	}

	public void updateHomeLoanDetails(long l, ApplyHomeLoan obj2) {
		
		userDetails=applyHomeLoanDAO.updateHomeLoanDetails(l);
		// TODO Auto-generated method stub
		
		List<ApplyHomeLoan> list=userDetails.getList();

		obj2.setUserDetails(userDetails);

		
	list.add(obj2);
	userDetails.setList(list);
	}
}
