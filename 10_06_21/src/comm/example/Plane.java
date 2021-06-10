package comm.example;

public class Plan extends AirWays implements Worker {

	
	public void dock() {
		
		System.out.println("Permission granted for SeaPlane to Dock in the Harbour..");
	}

	@Override
	public void TakeOff() {
		System.out.println("Seaplane Is Taking Off");
		
	}

	@Override
	public void land() {
		System.out.println("Seaplane Is Landed");
		
	}

	@Override
	public void Fly() {
		System.out.println("Seaplane Is Flying.");
		
	}

	@Override
	public double calcFuelEfficiency(double fuelConsumed) {
		// TODO Auto-generated method stub
		return super.calcFuelEfficiency(fuelConsumed);
	}

	@Override
	public double calcTripDistance(double startPoint, double endPoint) {
		// TODO Auto-generated method stub
		return super.calcTripDistance(startPoint, endPoint);
	}
}
