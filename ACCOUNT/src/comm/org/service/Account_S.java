package comm.org.service;

import java.sql.SQLException;
import java.util.List;

import comm.org.account.Account;
import comm.org.account2.Account_D1;
import comm.org.account3.AccountNotValidException;

public interface Account_S {
	public Account createAccount(Account account)throws SQLException;
	public List<Account_D1> displayAllAccount()throws SQLException ;
	public void deposite(double amount) throws SQLException;
	public double withdrawl(double amount) throws SQLException, AccountNotValidException;

}
