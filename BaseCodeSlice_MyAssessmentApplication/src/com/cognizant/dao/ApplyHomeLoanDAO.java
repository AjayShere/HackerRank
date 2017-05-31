package com.cognizant.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.cognizant.entity.ApplyHomeLoan;
import com.cognizant.entity.UserDetails;




@Component
public class ApplyHomeLoanDAO {
	
	
	
	/*public static void main(String[] args)
	{  
		
		SessionFactory sessionFactory = new AnnotationConfiguration().
	            configure().
	            addAnnotatedClass(ApplyHomeLoan.class).
	            buildSessionFactory();

		Session session = sessionFactory.openSession();
		Transaction t=session.beginTransaction();
		
		userDetails ud=new userDetails(12345,"ghd","fwdhuf");
		
		
		ApplyHomeLoan ahl=new ApplyHomeLoan(44354,453543,4656,5443,454343,"bhshhfk",null);
		
		ApplyHomeLoan ahl1 =new ApplyHomeLoan(4434,455435,534,76,44343,"bhfk",null);
		ApplyHomeLoan ahl2 =new ApplyHomeLoan(4454,453535,454,5443,54343,"bshhfk",null);
		
		List<ApplyHomeLoan> list=new ArrayList<ApplyHomeLoan>();
		
		list.add(ahl);
		list.add(ahl1);
		list.add(ahl2);
		ud.setList(list);
		
		
		session.save(ud);
		t.commit();
		session.close();
		
		
	}*/

	@PersistenceContext
    private EntityManager em;
	
	
	 @Transactional
	public void inserHomeLoanDetails(UserDetails userDetails) {
		// TODO Auto-generated method stub
		 
		 em.persist(userDetails);
		
		
		
	}


	public UserDetails updateHomeLoanDetails(long l) {
		// TODO Auto-generated method stub
		UserDetails retrive=em.find(UserDetails.class,l); 
		
		return retrive;

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*public void addCustomer(ApplyHomeLoan obj) {
		// TODO Auto-generated method stub
		
		Session session = sessionFactory.openSession();
		Transaction t=session.beginTransaction();
		
		session.save(obj);
		t.commit();
		session.close();
		
	}*/

}
