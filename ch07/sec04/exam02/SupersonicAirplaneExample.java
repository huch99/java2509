package ch07.sec04.exam02;

public class SupersonicAirplaneExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SuperonicAirplane sa = new SuperonicAirplane();
		sa.takeOff();
		sa.fly();
		sa.flyMode = SuperonicAirplane.SUPERSONIC;
		sa.fly();
		sa.flyMode = SuperonicAirplane.NOMAL;
		sa.fly();
		sa.land();
	}

}
