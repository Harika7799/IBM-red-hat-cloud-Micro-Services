package comm.org.main;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.security.Provider.Service;
import java.sql.SQLException;
import java.util.Enumeration;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.UUID;

import comm.org.account.A_Type;
import comm.org.account.Account;
import comm.org.account.Address;
import comm.org.account.City;
import comm.org.account2.Account_D1;
import comm.org.account3.Account_DAO;
import comm.org.account3.Account_DAO2;

public class Main {

	public static void main(String[] args) throws SQLException {
		Account_DAO a1 =new Account_DAO2();
		
		/*Account a= a1.createAccount(new Account(UUID.randomUUID().toString(),"Honey",A_Type.SAVINGS,new Address("2A","India",City.HYDERABAD,50000)));
		System.out.println(a);*/
		List<Account_D1> list=a1.displayAllAccount();
    	for(Account_D1 dto:list)
    	{
    		System.out.println(dto);
    	}
				


	}

}
