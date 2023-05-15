package ch09;
// 추상 클래스 : 구현 코드 없이 메서드의 선언만 있는 추상 메서드를 포함한 클래스
// abstract 로 선언 시 인스턴스화 할 수 없음
public abstract class Computer {
	//추상 메소드
	abstract void display();
	abstract void typing();
	
	public void turnOn() {
		System.out.println("전원을 켭니다.");
	}
	
	public void turnOff() {
		System.out.println("전원을 끕니다.");
	}
}
