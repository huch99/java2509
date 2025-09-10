package ch12.sec04;

public class ErrExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int value = Integer.parseInt("1oo");
		} catch (NumberFormatException e) {
			// TODO: handle exception
			System.out.println("에러내용");
			System.out.println(e.getMessage());
		}
	}

}
