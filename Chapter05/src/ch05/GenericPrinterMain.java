package ch05;

/*
 * 제네릭(Generic)
 * 	클래스에서 사용하는 변수의 자료형이 여러개 일수 있고, 그 기능(메서드)은 동일한 경우 클래스의 자료형을 특정하지 않고
 * 	추후 해당 클래스를 사용할 때 지정 할 수 있도록 선언
 * 	실제 사용되는 자료형의 변환은 컴파일러에 의해 검증되므로 안정적인 프로그래밍 방식
 * 	컬렉션 프레임워크에서 많이 사용되고 있음
 */

/*
 * 다이아몬드 연산자 <>
 * 	- ArrayList list = new ArrayList<>();  //다이아몬드 연산자 내부에서 자료형은 생략가능 함
 * 	- 제네릭에서 자료형 추론(자바 10부터)
 * 		ArrayList list = new ArrayList()  => var list = new ArrayList();
 */
public class GenericPrinterMain {

	public static void main(String[] args) {
		GenericPrinter<Powder> powerPrinter = new GenericPrinter<Powder>();
		powerPrinter.setMaterial(new Powder());
		System.out.println(powerPrinter);
		
		GenericPrinter<Plastic> plasticPrinter = new GenericPrinter<Plastic>();
		plasticPrinter.setMaterial(new Plastic());
		System.out.println(plasticPrinter);
	}

}
