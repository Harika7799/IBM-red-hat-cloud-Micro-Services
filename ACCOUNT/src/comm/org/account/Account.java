package comm.org.account;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.ToString;
import lombok.Getter;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@Getter
@Setter

public class Account {
	
	private String A_Id;
	private String A_HolderName;
	private A_Type AType;
	private Address address;
	private double Balance;
	
	
}
