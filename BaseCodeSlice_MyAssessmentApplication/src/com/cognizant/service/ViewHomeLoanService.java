package com.cognizant.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cognizant.dao.ViewHomeLoanDAO;
import com.cognizant.entity.ApplyHomeLoan;

@Component
public class ViewHomeLoanService {

	
	@Autowired
	ViewHomeLoanDAO viewHomeLoanDAO;
	
	private List<ApplyHomeLoan> list=new ArrayList<>();
	
	public List<ApplyHomeLoan> retriveHomeLoanDetails(long i){
		
		list=viewHomeLoanDAO.retriveHomeLoanDetails(i);
		System.out.println("servie");
		return list;
		
	}

}
