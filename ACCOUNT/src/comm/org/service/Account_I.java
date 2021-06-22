package comm.org.service;

import java.sql.SQLException;
import java.util.List;

import comm.org.account.Account;
import comm.org.account2.Account_D1;
import comm.org.account3.AccountNotValidException;

public class Account_I  implements Account_S{
	private Account_D1 a1;

	@Override
	public Account createAccount(Account account) throws SQLException {
		
		return a1.createAccount(account);
	}

	@Override
	public List<Account_D1> displayAllAccount() throws SQLException {
		
		return a1.displayAllAccount();
	}

	@Override
	public void deposite(double amount) throws SQLException {
		a1.deposit(amount);
		
	}

	@Override
	public double withdrawl(double amount) throws SQLException, AccountNotValidException {
              double balance = 0;
              try {
            	  balance =a1.withdrawl(amount);
              }catch(AccountNotValidException e) {
            	  System.err.println("Invalid Amount...");
              }
              return balance;
		
	}

}
