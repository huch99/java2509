package restudy;

public class CarExample {

	public static void main(String[] args) {
//		객체생성
//		Car myCar = new Car();
		
//		Car myCar = new Car("파나메라", "포르쉐", 280);
		
//		Car car1 = new Car();
//		Car car2 = new Car("타이칸");
//		Car car3 = new Car("파나메라", "검정");
//		Car car4 = new Car("911", "빨강", 300);
		
		Car car1 = new Car("머스탱");
		Car car2 = new Car("머스탱", "포드");
		Car car3 = new Car("머스탱", "포드", "파랑");
		
//		-------------------------------------------------------------
		
//		Car 객체의 필드값 읽기
//		System.out.println("모델 : " + myCar.model);		
//		System.out.println("시동여부 : " + myCar.start);
//		System.out.println("현재속도 : " + myCar.speed);	//필드 초기값을 지정하지 않으면 호출 시 값이 반영되지 않음.
		
//		-------------------------------------------------------------
		
//		Car 객체의 필드값 읽기
//		System.out.println("모델 : " + myCar.model);
//		System.out.println("제작사 : " + myCar.company);
//		System.out.println("색상 : " + myCar.color);
//		System.out.println("최고속도 : " + myCar.maxSpeed);
//		System.out.println("현재속도 : " + myCar.speed);
		
//		Car 객체의 필드값 변경
//		myCar.speed = 100;
//		System.out.println("현재속도 : " + myCar.speed);
		
//		-------------------------------------------------------------
		
//		System.out.println("car1.company : " + car1.company);
//		System.out.println();
//		
//		System.out.println("car2.company : " + car2.company);
//		System.out.println("car2.model : " + car2.model);
//		System.out.println();
//		
//		System.out.println("car3.company : " + car3.company);
//		System.out.println("car3.model : " + car3.model);
//		System.out.println("car3.color : " + car3.color);
//		System.out.println();
//		
//		System.out.println("car4.company : " + car4.company);
//		System.out.println("car4.model : " + car4.model);
//		System.out.println("car4.color : " + car4.color);
//		System.out.println("car4.maxSpeed : " + car4.maxSpeed);
		
//		-------------------------------------------------------------
		
		System.out.println("car1.model : " + car1.model);
		System.out.println();
		
		System.out.println("car2.model : " + car2.model);
		System.out.println("car2.company : " + car2.company);
		System.out.println();		
		
		System.out.println("car3.model : " + car3.model);
		System.out.println("car3.company : " + car3.company);
		System.out.println("car3.color : " + car3.color);
	}

}
