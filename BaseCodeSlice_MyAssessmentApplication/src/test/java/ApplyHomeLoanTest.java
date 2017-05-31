package test.java;

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
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:beans.xml")
public class ApplyHomeLoanTest {

	@Autowired
	ApplyHomeLoanService applyHomeLoanService;
	private List<ApplyHomeLoan> ApplyHomeLoanList;
	
	
	private UserDetails userDetails;
	ApplyHomeLoan obj2= new ApplyHomeLoan(46456,123456,4576, 100000, 45,  "Dev",null,userDetails);

	@Before

	public void setup(){
		
		
		userDetails=new UserDetails(12345678901234566l,"savings","sumit",5665635);
	
		
		ApplyHomeLoan obj= new ApplyHomeLoan(466,123456,456, 10000, 45,  "Manager",null,userDetails);
		ApplyHomeLoan obj1= new ApplyHomeLoan(466,123856,456, 10000, 45,  "Manager",null,userDetails);
		String id=applyHomeLoanService.generateRandomNumber(userDetails.getAccount_Number());
		obj.setLoanID(id);
	obj1.setLoanID(id);
	long loanAccNum=applyHomeLoanService.generateLoanAccNumber();
	obj.setLoanAccountNumber(loanAccNum);
	long loanAccNum1=applyHomeLoanService.generateLoanAccNumber();
	obj1.setLoanAccountNumber(loanAccNum1);
		ApplyHomeLoanList=new ArrayList<>();
		
		ApplyHomeLoanList.add(obj);
		ApplyHomeLoanList.add(obj1);
		
		
		
		
	}
	
//	@Test
	public void addDetails(){
		userDetails.setList(ApplyHomeLoanList);
			
		applyHomeLoanService.insertHomeDetails(userDetails);
		
		
		
	}
	@Test
	public void updateHomeLoanDetails(){
		long loanACCNum=applyHomeLoanService.generateLoanAccNumber();
		String id=applyHomeLoanService.generateRandomNumber(12345678901234566l);
		obj2.setLoanID(id);
		obj2.setLoanAccountNumber(loanACCNum);
			applyHomeLoanService.updateHomeLoanDetails(12345678901234566l,obj2);
		
		
	}
}
