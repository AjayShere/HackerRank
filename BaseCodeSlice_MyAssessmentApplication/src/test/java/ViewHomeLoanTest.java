package test.java;

import org.springframework.stereotype.Component;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.cognizant.entity.ApplyHomeLoan;
import com.cognizant.entity.Employee;
import com.cognizant.entity.UserDetails;
import com.cognizant.service.ApplyHomeLoanService;
import com.cognizant.service.ViewHomeLoanService;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:beans.xml")
public class ViewHomeLoanTest {
	
	@Autowired
	ViewHomeLoanService viewHomeLoanService;
	private List<ApplyHomeLoan> HomeLoan;
	
	
	@Test
	public void test(){
		System.out.println("test");
		
		HomeLoan=viewHomeLoanService.retriveHomeLoanDetails(12345678901234566l);
		System.out.println(HomeLoan);
	
	}

}
