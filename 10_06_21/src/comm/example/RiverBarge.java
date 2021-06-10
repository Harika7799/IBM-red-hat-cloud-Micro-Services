package comm.example;

public class RiverBarge extends Vehicle implements Worker {
	private double StartPoint;
	private double EndPoint;
	private double DistanceCovered;
	private double FuelEfficiency;

	@Override
	public double calcFuelEfficiency(double fuelConsumed) {
		FuelEfficiency = DistanceCovered/fuelConsumed;
		return FuelEfficiency;
	}

	@Override
	public double calcTripDistance(double StartPoint, double EndPoint) {
		this.StartPoint =StartPoint;
		this.EndPoint =EndPoint;
		DistanceCovered =this.EndPoint - this.StartPoint;
		return DistanceCovered;
	}

	@Override
	public String getDetails() {
		return super.getDetails()+"RiverBarge------>";
	}

	@Override
	public String getMessage() {
		return super.getMessage();
	}

	@Override
	public void setMessage(String message) {
		super.setMessage(message);
	}
	public void dock() {
		System.out.println("RiverBarge Permission to Dock..");
	}
	

}
