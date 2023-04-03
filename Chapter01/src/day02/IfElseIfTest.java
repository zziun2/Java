package day02;

public class IfElseIfTest {

	public static void main(String[] args) {
		int age = 12;
		int charge;
		
		if(age < 8) {
			charge = 1000;
			System.out.println("미취학 아동입니다.");
		} else if (age < 14){
			charge = 2000;
			System.out.println("초등학생입니다.");
		} else if (age < 20){
			charge = 2500;
			System.out.println("중, 고등학생입니다.");
		} else {
			charge = 3000;
			System.out.println("일반인입니다.");
		}
		// charge가 초기화 되어 있으면 else문 생략 가능 
		System.out.println("입장료는 " + charge + "입니다.");

	}

}
