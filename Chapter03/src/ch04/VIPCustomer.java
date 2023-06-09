package ch04;

public class VIPCustomer extends Customer {
	private int agentId;
	double salesRatio;
	
	// super를 이용해 상위 클래스 생성자 명시 호출
	public VIPCustomer(int cId, String cName) {
		super(cId, cName);
		
		cGrade = "VIP";
		bonusRatio = 0.05;
		salesRatio = 0.1;
	}
	
	public int getAgendId() {
		return agentId;
	}

	// 오버라이딩
	// 하위 클래스에서 동일한 이름의 메서드를 재정의할 수 있음
	@Override
	public int calcPrice(int price) {
		// TODO Auto-generated method stub
		bonusPoint += price * bonusRatio;
		return price - (int)(price * salesRatio);
	}
	
	/*
	 * @overriding 애노테이션 (annotation)
	 * 	애노테이션 = 주석
	 * 	컴파일러에게 특별한 정보 제공
	 * 	- @Override : 재정의된 메서드
	 * 	- @FuctionalInterface : 함수형 인터페이스
	 * 	- @Deprecated : 이후 버전에서 사용되지 않을 수 있는 변수 메서드에 사용
	 * 	- @SuppressWarnings : 특정 경고가 나타나지 않도록 함
	 */
	
}
