package test;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 2; i < 10; i++) {
			System.out.print(i + "단\t\t" + ((i==9)? "\n":""));			
		}
		
		for (int i = 1; i < 10; i++) {
			for(int k = 2; k<10; k++) {
				System.out.print(k + " X " + i + " = " + (i*k) + "\t" + ((k==9)? "\n": ""));
			}			
		}
		
	}

}
