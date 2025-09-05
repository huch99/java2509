package ch06.sec08;

public class CalculatorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator myCal = new Calculator();
		
		myCal.powerOn();
		
		int result1 = myCal.plus(5, 6);
		System.out.println("result1 : " + result1);
		
		int x = 10;
		int y = 4;
		
		double result2 = myCal.devide(x, y);
		System.out.println("result2 : " + result2);
		
		myCal.powerOff();
		
		Calculator myCalcu = new Calculator();
		
		double result3 = myCalcu.areaRectangle(10);
		double result4 = myCalcu.areaRectangle(10, 20);
		
		System.out.println("정사각형 넓이 : " + result3);
		System.out.println("직사각형 넓이 : " + result4);
	}

}
