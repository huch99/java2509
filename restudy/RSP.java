package restudy;

import java.util.Scanner;

public class RSP {
	public RSP () {
		play();
	}
	void play() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("가위바위보 게임");
		System.out.println("1. 가위 | 2. 바위 | 3.보");
		System.out.println("게임을 종료하려면 0을 입력하세요");
		
		int win = 0;
		int draw = 0;
		int lose = 0;
		int total = win + draw + lose;
		
		boolean go = true;
		
		System.out.println();
		System.out.println("현재 스코어 - 총 : " + total + "판, 승 : " + win + ", 패 : " + lose + ", 무 : " + draw);
	
		System.out.println();
		
		int userSelect;
		
		while (go) {
			System.out.print("선택하세요 (0:종료, 1:가위, 2:바위, 3:보) >> ");
			if (!scanner.hasNextInt()) { 
				String badInput = scanner.next();  
				System.out.println("입력 형식이 올바르지 않습니다. 숫자(0~3)를 입력해 주십시오."); 
				continue;				
			} else {
				userSelect = scanner.nextInt();
			}
		
			switch(userSelect) {
			case 0:
				System.out.println("총 스코어 - 총 : " + total + "판, 승 : " + win + ", 패 : " + lose + ", 무 : " + draw);
				System.out.println("게임을 종료합니다.");
				go = false;
				scanner.close();
				break;
			case 1:
				System.out.println("플레이어 : 가위");
				break;
			case 2:
				System.out.println("플레이어 : 바위");
				break;
			case 3:
				System.out.println("플레이어 : 보");
				break;
			default :
				System.out.println("잘못된 입력입니다. 0,1,2,3 중 하나를 입력해 주십시오");
				break;
			}
			
			if (userSelect != 0 && (userSelect > 0 && userSelect <= 3)) {
				int computerSelect = (int)(Math.random() * 3) + 1;
				switch(computerSelect) {
				case 1:
					System.out.println("컴퓨터 : 가위");
					break;
				case 2:
					System.out.println("컴퓨터 : 바위");
					break;
				case 3:
					System.out.println("컴퓨터 : 보");
					break;
				}
				
				if (userSelect == computerSelect) {
					System.out.println("무승부입니다.");
					System.out.println();
					draw += 1;
				} else if (userSelect != computerSelect && userSelect != 0) {
					if ((userSelect == 1 && computerSelect ==2) || (userSelect == 2 && computerSelect == 3) || (userSelect == 3 && computerSelect == 1)) {
						System.out.println("패배 했습니다.");
						System.out.println();
						lose += 1;
					} else if ((userSelect == 1 && computerSelect == 3) || (userSelect == 2 && computerSelect == 1) || (userSelect == 3 && computerSelect == 2)) {
						System.out.println("승리 했습니다.");
						System.out.println();
						win += 1;
					}
				}
			}
		}
	}
}
