package ch02;

public class VIPCustomer extends Customer {
	private int agentId;
	double salesRatio;
	
	// super를 이용해 상위 클래스 생성자 명시 호출
	public VIPCustomer(int cId, String cName) {
		super(cId, cName);
		
		cGrade = "VIP";
		bonusRatio = 0.05;
		salesRatio = 0.1;
		
		System.out.println("VIPCustomer(int, String) 생성자 호출");
	}
	
	public int getAgendId() {
		return agentId;
	}
}
