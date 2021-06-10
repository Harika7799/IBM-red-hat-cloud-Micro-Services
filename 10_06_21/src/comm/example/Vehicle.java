package comm.example;

public abstract class Vehicle {
	public abstract double calcFuelEfficiency(double fuelConsumed);
	public abstract double calcTripDistance(double StartPoint,double EndPoint);
	private String message;
	public String getDetails() 
	{
		return "Hello ";
	}
	public String getMessage()
	{
		return message;
	}
	public void setMessage(String message)
	{
		this.message = message;
	}

}
