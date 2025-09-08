package test;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "철수";
		int age = 18;
		double tall = 170.0;
		boolean student = true;
		char exam = 'A';
		
		System.out.println("이름은 " + name + "입니다.");
		System.out.println("나이는 " + age + "살 입니다.");
		System.out.println("키는 " + (int)tall + "cm 입니다.");
		System.out.println(student ? "저는 학생입니다." : "");
		System.out.println("성적은 " + exam + "입니다.");

		System.out.println();
		
		int a = 10;
		int b = 3;
		
		int result1 = a + b;
		int result2 = a - b;
		int result3 = a * b;
		double result4 = a / b;
		int result5 = a % b;
		
		boolean result6 = a < b;
		boolean result7 = a > b;
		boolean result8 = a == b;
		
		int c = 10;
		
		boolean result9 = a == c && a == b;
		boolean result10 = a == c || a == b;
		boolean result11 = !(a == c);
		
		System.out.println("a + b = " + result1);
		System.out.println("a - b = " + result2);
		System.out.println("a * b = " + result3);
		System.out.println("a / b = " + result4);
		System.out.println("a % b = " + result5);
		
		System.out.println();
		
		System.out.println("비교연산자 a < b = " + result6);
		System.out.println("비교연산자 a > b = " + result7);
		System.out.println("비교연산자 a == b = " + result8);
		System.out.println("논리연산자 a==c && a==b = " + result9);
		System.out.println("논리연산자 a==c || a==b = " + result10);
		System.out.println("논리연산자 !(a==c) = " + result11);
		
		System.out.println();
		
		int d;
		
		++a;
		System.out.println("증감연산자 ++a : " + a);
		
		d = a++;
		System.out.println("증감연산자 d = a++ : " + d);
		System.out.println("증감연산자 d = a++ : " + a);
		
		--a;
		System.out.println("증감연산자 --a : " + a);
		
		d = a--;
		System.out.println("증감연산자 d = a-- : " + d);
		System.out.println("증감연산자 d = a-- : " + a);
		
		System.out.println();
		
		int score = 85;
		
		if(score >= 90) {
			System.out.println("90점 이상입니다.");
		} else if (score >= 80) {
			System.out.println("80점 이상입니다.");
		} else {
			System.out.println("불합격입니다.");
		}
		
		System.out.println((score >= 80) ? "합격입니다." : "불합격입니다.");
		
		switch(score) {
		case 90 : 
			System.out.println("A학점");
			break;
		case 85 :
		case 80 : 
			System.out.println("B학점");
			break;
		default :
			System.out.println("C학점");
		}
		
		System.out.println();
		
		for(int i = 2; i< 10; i++) {
			System.out.println(i + "단");
			for(int k=1; k<10; k++) {
				System.out.println(i + " X " + k + " = " + (i * k));
			}
			System.out.println("----------------------------");
		}
	}
	
}
