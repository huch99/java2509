package ch02.sec01;

public class IntegerLiteralExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int var01 = 0b1011;	//2진수 2^3 + 0 + 2^1 + 2^0 = 8 + 2 + 1 = 11
		int var02 = 0206;	//8진수 8^2 * 2 + 0 + 8^0 * 6 = 128 + 6 = 134
		int var03 = 365; 	//10진수 365
		int var04 = 0xB3;  	//16진수 16^1 * 11 + 16^0 *3 = 176 + 3 = 179
		
		System.out.println(var01);
		System.out.println(var02);
		System.out.println(var03);
		System.out.println(var04);
	}

}
