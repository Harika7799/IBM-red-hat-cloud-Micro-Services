package comm.example;

public class Tester {

	public static void main(String[] args) {
		Vehicle myVehicle =new Truck();
		System.out.println(myVehicle.calcTripDistance(120.4,1045.8));
		System.out.println(myVehicle.calcFuelEfficiency(89));
		System.out.println(myVehicle.getDetails());
		myVehicle = new RiverBarge();
		System.out.println(myVehicle.calcTripDistance(85,975.88));
		System.out.println(myVehicle.calcFuelEfficiency(2000));
		System.out.println(myVehicle.getDetails());
		myVehicle.setMessage("Riverbarge is great place");
		System.out.println(myVehicle.getMessage());

	}
}

