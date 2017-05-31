package com.cognizant.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.cognizant.entity.ApplyHomeLoan;
import com.cognizant.entity.UserDetails;

@Component
public class ViewHomeLoanDAO {

	 @PersistenceContext
	    private EntityManager em;

@Transactional
	public List<ApplyHomeLoan> retriveHomeLoanDetails(long Account_Number) {
		System.out.println("dao");
		UserDetails retrieve=em.find(UserDetails.class,Account_Number);
		//ApplyHomeLoan retrieve1=em.find(ApplyHomeLoan.class, j);
		System.out.println(retrieve);
//		System.out.println("dao");
//		Query query=em.createQuery("from applyhomeloan ahl  where  ahl.loanID=? and ahl.AccountNumber=?");
//		System.out.println("ndao");
//		query.setParameter(1,i);
//		query.setParameter(2,j);
//		
//		List<ApplyHomeLoan> list=query.getResultList();
//		System.out.println(list);
		return null;
		
		
		// TODO Auto-generated method stub
		
	}

}
