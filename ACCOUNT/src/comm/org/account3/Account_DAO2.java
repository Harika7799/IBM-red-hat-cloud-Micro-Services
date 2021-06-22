package comm.org.account3;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mysql.cj.xdevapi.Statement;

import comm.org.account.Account;
import comm.org.account1.MyConnectionFactory;
import comm.org.account2.Account_D1;

public class Account_DAO2 implements Account_DAO
{
	private Connection conn;
	private List<Account_D1> accounts;
	private Account acc;
	private MyConnectionFactory mcf;
	{
		
			try {
				mcf = MyConnectionFactory.createFactory();
				conn = mcf.getMyConnection();
			} catch (SQLException e) {

				e.printStackTrace();
			}
	}
	
	@Override
	public Account createAccount(Account account) throws SQLException {
		PreparedStatement ps = conn.prepareStatement("insert into account values(?,?,?,?,?,?,?)");
		ps.setString(1, account.getA_Id());
		ps.setString(2, account.getAType().getMessage());
		ps.setString(3, account.getA_HolderName());
	    ps.setString(4, account.getAddress().getAddressLine1());
		ps.setString(5, account.getAddress().getAddressLine2());
		ps.setString(6, account.getAddress().getCity());
		ps.setDouble(7, account.getBalance());
		ps.executeUpdate();
		return account;
	}
	@Override
	public List<Account_D1> displayAllAccount() throws SQLException {
		
		accounts = new ArrayList<Account_D1>();
		Statement st = (Statement) conn.createStatement();
		ResultSet rs= ((java.sql.Statement) st).executeQuery("select * from account");
		while (rs.next()) {

			accounts.add(new Account_D1(rs.getString(1), rs.getString(2), rs.getString(3),
					rs.getString(4), rs.getString(5), rs.getString(6), rs.getDouble(7)));
		}

		return accounts;
	}
		
	@Override
	public void deposite(double amount) throws SQLException {
		
				acc.setBalance(amount + acc.getBalance());
				System.out.println(amount +"Rs "+"Deposited Successfully");
				System.out.println("Balance in Rs" +acc.getBalance());
				PreparedStatement ps =conn.prepareStatement("insert into Account values()");
				ps.setDouble(1, acc.getBalance());
				ps.executeUpdate();
			
		
		
	}
	@Override
	public double withdrawl(double amount) throws SQLException, AccountNotValidException{
		if(acc.getBalance() > 1000)
		{
			double newAmount = acc.getBalance() - amount;
			if(newAmount >1000)
			{
				acc.setBalance(newAmount);
				PreparedStatement ps =conn.prepareStatement("insert into Account values()");
				ps.setDouble(1, acc.getBalance());
				ps.executeUpdate();
				
			}
			
		else
			{
				throw new AccountNotValidException("Amount Not Valid to WithDraw");
			}
		}
			else
			{
				throw new AccountNotValidException("Amount Not Valid to WithDraw");
			}
		return acc.getBalance();
	}
	
	
}