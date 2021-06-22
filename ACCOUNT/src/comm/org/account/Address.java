package comm.org.account;

import java.sql.SQLException;

import comm.org.account2.Account_D1;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.Setter;
import lombok.Getter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@ToString
@Getter


public class Address {
	public Address(String a_Line1, String a_Line2, comm.org.account.City valueOf) {
		
	}
	private String AddressLine1;
	private String AddressLine2;
	private String City;
	
	
	
	
}
