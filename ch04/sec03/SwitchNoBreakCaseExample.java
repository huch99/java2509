package ch04.sec03;

public class SwitchNoBreakCaseExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int time = (int) (Math.random()*4) +8;
		System.out.println("현재 시간 : " + time + "시");
		
		switch(time) {
		case 8:
			System.out.println("출근합니다.");
		case 9:
			System.out.println("회의시간");
		case 10:
			System.out.println("업무시간");
		case 11:
			System.out.println("외근을 나갑니다.");
		}
	}

}
