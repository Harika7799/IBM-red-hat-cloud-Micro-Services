package comm.example;

public class Monster extends AirWays implements Worker {

	
	public void dock() {
		System.out.println("Allow Monster To Dock in the Harbour");
	}

	@Override
	public void TakeOff() {
		System.out.println("Monster takeoff");
		
	}

	@Override
	public void land() {
		System.out.println("Monster Landed.");
		
	}

	@Override
	public void Fly() {
		System.out.println("Monster Flying.");
		
	}

	@Override
	public double calcTripDistance(double StartPoint, double EndPoint) {
		
		return super.calcTripDistance(StartPoint, EndPoint);
	}
	

}
