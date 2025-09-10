package ch12.sec03.exam01;

public class EqualsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Member obj1 = new Member("blue");
		Member obj2 = new Member("blue");
		Member obj3 = new Member("red");
		
		if(obj1.equals(obj2)) {
			System.out.println("obj1과 obj2는 동등합니다.");
		} else {
			System.out.println("obj1과 obj2는 동등하지 않습니다.");
		}
//		매개값이 둘 다 Member이고 id 또한 같기에 true
		
		if(obj1 == obj2) {
			System.out.println("obj1과 obj2는 동등합니다.");
		} else {
			System.out.println("obj1과 obj2는 동등하지 않습니다.");
		}
//		매개값은 둘 다 Member이고 field또한 같지만 서로 다른 객체이므로 false
		
		if(obj1.equals(obj3)) {
			System.out.println("obj1과 obj3는 동등합니다.");
		} else {
			System.out.println("obj1과 obj3는 동등하지 않습니다.");
		}
//		매개값은 같으나 id는 다르기에 false
	}

}
