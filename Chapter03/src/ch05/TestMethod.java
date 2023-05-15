package ch05;

public class TestMethod {
	// 메서드의 이름은 주소값을 나타냄
	// 다른 인스턴스라도 같은 메서드가 호출됨
	// 인스턴스가 생성되면 힙 메모리에 따로 생성되지만, 메서드 명령어 set은 한 번만 로드됨
	// 힙 : a1의 num, a2의 num
	// 스택 : a1, a2, args
	// 메서드 영역 : aaa() 메서드 영역
	int num;
	
	void aaa() {
		System.out.println("aaa() 호출");
	}

	public static void main(String[] args) {
		TestMethod a1 = new TestMethod();
		a1.aaa();
		
		TestMethod a2 = new TestMethod();
		a2.aaa();

	}
	
	// but, 재정의된 경우는 재정의된 메서드의 주소를 가리킴
	
}
