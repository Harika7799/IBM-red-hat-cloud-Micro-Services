package comm.org.account2;
import java.util.List;

import comm.org.account.Account;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString

public class Account_D1 {
	private String accountId;
	private String accountType;
	private String accountHolderName;
	private String addressLine1;
	private String addressLine2;
	private String city;
	private double balance;
	
	public Account createAccount(Account account) {
		
		return null;
	}

	public List<Account_D1> displayAllAccount() {
		
		return null;
	}

	public void deposit(double amount) {
		
		
	}

	public double withdrawl(double amount) {

		return 0;
	}
	

}
