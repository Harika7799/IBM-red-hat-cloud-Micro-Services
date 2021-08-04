package com.example.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.demo.config.DemoConfig;
import com.example.demo.dao.AccountDAO;
import com.example.demo.dao.MembershipDAO;
import com.example.demo.model.Account;

public class App {
	public static void main(String[] args) {

		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(DemoConfig.class);
		
		AccountDAO theAccountDAO = context.getBean("accountDAO", AccountDAO.class);
		
		MembershipDAO theMembershipDAO = 
				context.getBean("membershipDAO", MembershipDAO.class);
				
		Account myAccount = new Account();
		theAccountDAO.addAccount(myAccount, true);
		theAccountDAO.doWork();
		
		theMembershipDAO.addSillyMember();
		theMembershipDAO.goToSleep();
		
		context.close();
	}
}