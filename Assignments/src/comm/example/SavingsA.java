package comm.example;

public class SavingsA extends Account{
	
private double MinimumB;
public SavingsA() {
	super();
}

public SavingsA(int accountNumber, Customer customerObj, double balance,double MinimumB) {
	super(accountNumber, customerObj, balance);
	this.MinimumB= MinimumB;
}

@Override
public boolean WithDraw(double amount) {
	if(balance>=MinimumB)
	{
		System.out.println("WithDraw Succesfully :"+amount);
		balance =balance -amount;
		System.out.println("Available Balance :"+amount);
		return true;
	}
	else {
		
	System.out.println("WithDraw Failed Message");
	System.out.println("Available Balance "+ balance);
	return false;
	}
}
	
}
	
	


