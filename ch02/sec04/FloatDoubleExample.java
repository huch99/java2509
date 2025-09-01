package ch02.sec04;

public class FloatDoubleExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float var1 = 0.1234567890123456789f;	// 8bit로 표현
		double var2 = 0.1234567890123456789;	// 11bit로 표현 나머지는 bit는 모두 가수를 표현 하는 데 사용.
		System.out.println(var1);
		System.out.println(var2);
		
		double var3 = 3e6;	//3000000
		float var4 = 3e6F;	//3000000
		double var5 = 2e-3; //0.002
		System.out.println(var3);
		System.out.println(var4);
		System.out.println(var5);
	}

}
