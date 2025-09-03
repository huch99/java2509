package ch03.sec09;

public class BitShiftExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 1;
		int result1 = num1 << 3;					//00000001 -> 00001000 = 8
		int result2 = num1 * (int) Math.pow(2, 3);	//1 * 2^3 = 8
		System.out.println("result1 : " + result1);
		System.out.println("result2 : " + result2);
		
		int num2 = -8;
		int result3 = num2 >> 3;					//10001000 -> 10000001 = -1 정확한 표현은 아니지만 간단하게 부호는 유지된다고 보자.
		int result4 = num2 / (int) Math.pow(2, 3);	//-8 / 2^3 = -1
		System.out.println("result3 : " + result3);
		System.out.println("result5 : " + result4);
	}	

}
