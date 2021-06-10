package comm.example;

public class Horbour {
	public static void main(String[] args) {
		Horbour hb=new Horbour();
		RiverBarge riverBarge=new RiverBarge();
		System.out.println(riverBarge.calcTripDistance(100.0, 200.0));
		System.out.println(riverBarge.calcFuelEfficiency(400));
		hb.givePermissionToDock(riverBarge);
		Plan pl= new Plan();
		pl.TakeOff();
		pl.Fly();
		pl.land();
		System.out.println(pl.calcTripDistance(100, 1900));
		System.out.println(pl.calcFuelEfficiency(900));
		hb.givePermissionToDock(pl);
		Monster mon=new Monster();
		mon.TakeOff();
		mon.Fly();
		mon.land();
		System.out.println(mon.calcTripDistance(100, 900));
		hb.givePermissionToDock(mon);

	}

}

	private void givePermissionToDock(Worker s) {
		s.dock();
		
	}
}

