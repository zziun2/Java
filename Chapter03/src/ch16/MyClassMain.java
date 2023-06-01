package ch16;

public class MyClassMain {
	public static void main(String[] args) {
		MyClass mClass = new MyClass();
		
		X xClass = mClass;
		xClass.x();
		
		Y yClass = mClass;
		yClass.y();
		
		MyClass iClass = mClass;
		iClass.x();
		iClass.y();
		iClass.myMethod();
		
	}
}
