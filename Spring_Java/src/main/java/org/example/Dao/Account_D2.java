package org.example.Dao;

import java.util.List;

import org.example.Account.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class Account_D2 implements Account_D1{
	
	
	private List<Account>list;
	@Autowired
	public Account_D2(List<Account> list) {
		super();
		this.list = list;
	}


	@Override
	public Account createAccount(Account account) {
		list.add(account);
		return account;
	}

	@Override
	public List<Account> displayAllAvailableAccount() {
		
		return list;
	}
	
	public void setList(List<Account> list) {
		this.list = list;
	}


	@Override
	public Account updateAccount(Account accountId) {
		Account acc =new Account();
		list.add(acc);
		return acc;
	}


	@Override
	public void deleteAccount(Account accountId) {
		Account acc =new Account();
		list.remove(acc);
		System.out.println("Account Deleted Successfully.....");

		
	}

}
