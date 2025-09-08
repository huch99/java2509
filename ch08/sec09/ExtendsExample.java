package ch08.sec09;

public class ExtendsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterfaceImpl impl = new InterfaceImpl();
		
		InterfaceA ia = impl;
		ia.methodA();
//		ia.methodB();
		
		System.out.println();
		
		InterfaceB ib = impl;
		ib.methodB();
//		ib.methodA();
		
		System.out.println();
		
		C ic = impl;
		ic.methodA();
		ic.methodB();
		ic.methodC();
	}

}
