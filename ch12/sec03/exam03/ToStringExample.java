package ch12.sec03.exam03;

public class ToStringExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SmartPhone myPhone = new SmartPhone("아이폰", "ios");
		
		String strObj = myPhone.toString()	;
		System.out.println(strObj);
		
		System.out.println(myPhone);
	}

}
