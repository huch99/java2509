package restudy;

import java.util.Scanner;

public class Account {
	private String number;
	private String name;
	private int money;
	
	int count = 0;
	
	public Account() {
		
	}
	
	public Account(String number, String name, int money) {
		this.number = number;
		this.name = name;
		this.money = money;
	}
	
	public String getNumber() {
		return number;
	}
	
	public String getName() {
		return name;
	}
	
	public int getMoney() {
		return money;
	}	
	
	public void setMoney(int money) {
		this.money = money;
	}
	
	@Override
	public String toString() {
		return  "계좌번호: " + number + ", 계좌주: " + name + ", 잔액: " + money;
	}
	
	Account[] accounts = new Account[100];
	
	
	void selectMenu() {
		System.out.println("-------------------------------------------");
		System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
		System.out.println("-------------------------------------------");
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("선택 > ");
		int select = scanner.nextInt();
		System.out.println("-----------");
		switch (select) {
		case 1 : 
			System.out.println("계좌생성");
			System.out.println("-----------");
			Scanner scannerNumber = new Scanner(System.in);
			System.out.print("계좌번호 : ");
			String sNumber = scanner.next();
			Scanner scannerName = new Scanner(System.in);
			System.out.print("계좌주 : ");
			String sName = scanner.next();
			Scanner scannerMoney = new Scanner(System.in);
			System.out.print("초기 입금액 : ");
			int sMoney = scanner.nextInt();
			System.out.println("계좌가 생성되었습니다.");
			
			accounts[count] = new Account(sNumber, sName, sMoney);
	        count++;
			break;
			
		case 2 : 
			System.out.println("계좌목록");
			System.out.println("-----------");
			for (int i=0; i<accounts.length; i++) {
				System.out.println(accounts[i]);
				if(accounts[i] == null) {
					break;
				}
			}
			break;
			
		case 3:
			System.out.println("-----------");
			System.out.println("예금");
			System.out.println("-----------");
			Scanner inpNumber = new Scanner(System.in);
			System.out.print("계좌번호 : ");
			String inpNum = scanner.next();
			
			Account found = null;
			int foundIndex = -1;
			for (int i = 0; i < count; i++) {
			    if (accounts[i] != null && accounts[i].getNumber().equals(inpNum)) {
			        found = accounts[i];
			        foundIndex = i;
			        break;
			    }
			}

			if (found != null) {
			    System.out.print("예금액 : ");
			    int inpM = scanner.nextInt();
			    
			    int newMoney = found.getMoney() + inpM;
			    found.setMoney(newMoney);
			    
			    System.out.println("입금 완료 : " + found.getMoney());			    
			} else {
			    System.out.println("해당 계좌가 존재하지 않습니다.");			    
			}
			break;
		case 4:
			System.out.println("-----------");
			System.out.println("출금");
			System.out.println("-----------");
			Scanner inpNumber2 = new Scanner(System.in);
			System.out.print("계좌번호 : ");
			String inpNum2 = scanner.next();
			
			Account found2 = null;
			int foundIndex2 = -1;
			for (int i = 0; i < count; i++) {
			    if (accounts[i] != null && accounts[i].getNumber().equals(inpNum2)) {
			        found2 = accounts[i];
			        foundIndex2 = i;
			        break;
			    }
			}

			if (found2 != null) {
			    System.out.print("출금액 : ");
			    int inpM2 = scanner.nextInt();
			    
			    if(found2.getMoney() < inpM2) {
			    	System.out.println("잔액이 부족합니다.");
			    	System.out.println("현재 잔액 : " + found2.getMoney());
			    } else {
			    	int newMoney2 = found2.getMoney() - inpM2;
				    found2.setMoney(newMoney2);
				    
				    System.out.println("출금 완료 : " + found2.getMoney());
			    }
			    			    
			} else {
			    System.out.println("해당 계좌가 존재하지 않습니다.");			    
			}
			break;
		case 5: 
			System.out.println("프로그램 종료.");
			break;
			
		default:
			break;
		}
		
		System.out.println("-------------------------------------------");
		System.out.println("1.추가업무 | 2.종료");
		System.out.println("-------------------------------------------");
		Scanner scanner2 = new Scanner(System.in);
		System.out.print("선택 > ");
		int select2 = scanner.nextInt();
		switch(select2) {
		case 1:
			selectMenu();
			break;
		
		case 2:
			System.out.println("프로그램 종료.");
			break;
		}
		
		
	}
}
