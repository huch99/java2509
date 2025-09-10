package restudy;

public class Car {
//	String model;
//	boolean start;
//	int speed;
	
	
//	---------------------------------------------------
	
//	String model = "파나메라";
//	String company = "포르쉐";
//	String color = "노랑";
//	int maxSpeed = 280;
//	int speed;				//0
	
//	---------------------------------------------------
	
//	Car(String model, String color, int maxSpeed) {
//		
//	}
	
//	---------------------------------------------------
	
//	필드 선언
//	String model;
//	String company = "포르쉐";
//	String color;
//	int maxSpeed;
	
//	생성자 선언
//	오버로딩
//	Car () {};	//방법 1 - 기본생성자
//	
//	Car (String model) {	//방법 2
//		this.model = model;
//	}
//	
//	Car (String model, String color) {	//방법 3
//		this.model = model;
//		this.color = color;
//	}
//	
//	Car (String model, String color, int maxSpeed) {	//방법 4
//		this.model = model;
//		this.color = color;
//		this.maxSpeed = maxSpeed;
//	}
	
//	---------------------------------------------------
	
	String model;
	String company;
	String color;
	int maxSpeed = 300;
	
	Car (String model, String company, String color) {
		this.model = model;
		this.company = company;
		this.color = color;
	}	// 공통 초기화 코드
	
	Car (String model){
		this(model, "포드", "빨강");
	}
	
	Car (String model, String company) {
		this(model, company, "검정");
	}
	
}
