package org.example.Service;

import java.util.List;

import org.example.Account.Account;
import org.example.Dao.Account_D1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component(value= "services")
public class Account_S2 implements Account_S1 {
	
	private Account_D1 account_D2;
	
	@Autowired
	public Account_S2(Account_D1 account_D2) {
		super();
		this.account_D2 = account_D2;
	}


	@Override
	public Account createAccount(Account account) {
		
		return account_D2.createAccount(account) ;
	}

	@Override
	public List<Account> displayAllAvailableAccount() {
		
		return account_D2.displayAllAvailableAccount();
	}


	@Override
	public Account updateAccount(Account accountId) {
     
		return account_D2.updateAccount(accountId);
	}


	@Override
	public void deleteAccount(Account accountId) {
	
	account_D2.deleteAccount(accountId);
	}

}
