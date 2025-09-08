package ch03.sec08;

public class BitLogicExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		45 = 00101101, 25 = 00011001
		System.out.println("45 & 25 = " + (45 & 25));	// 00001001 -> + 0 0 0 8 0 0 1 = 9
		System.out.println("45 | 25 = " + (45 | 25));	// 00111101 -> + 0 32 16 8 4 0 1 = 61
		System.out.println("45 ^ 25 = " + (45 ^ 25));	// 00110100 -> + 0 32 16 0 4 0 0 = 52
		System.out.println("~45 = " + (~45));			// 11010010 -> - 64 0 16 0 0 2 0 = -82??가 아니라 -(원본 + 1) 
		System.out.println("----------------------------------------------");
		
		byte receiveData = -120;
		
//		방법1 : 비트 논리곱 연산으로 Unsigned 정수 얻기
		int unsignedInt1 = receiveData & 255;
		System.out.println(unsignedInt1);
		
//		방법2 : 자바 API를 이용해서 Unsigned 정수 얻기
		int unsignedInt2 = Byte.toUnsignedInt(receiveData);
		System.out.println(unsignedInt2);
		
		int test = 136;
		byte btest = (byte) test;
		System.out.println(btest);
	}

}
