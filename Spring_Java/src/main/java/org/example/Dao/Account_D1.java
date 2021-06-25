package org.example.Dao;

import java.util.List;

import org.example.Account.Account;

public interface Account_D1 {
	
public Account createAccount(Account account);
public Account updateAccount(Account accountId);
public void deleteAccount(Account accountId);
public List<Account> displayAllAvailableAccount();

}
