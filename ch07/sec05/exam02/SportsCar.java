package ch07.sec05.exam02;

public class SportsCar extends Car {
	@Override
	public void speedUp() {
		speed += 10;
	}
	
	@Override
	public void stop() { //불가능
		System.out.println("스포츠카를 멈춤");
		speed = 0;
	}
}
