package ch02;

public class VIPCustomer extends Customer {
	private int agentId;
	double salesRatio;
	
	// super�� �̿��� ���� Ŭ���� ������ ��� ȣ��
	public VIPCustomer(int cId, String cName) {
		super(cId, cName);
		
		cGrade = "VIP";
		bonusRatio = 0.05;
		salesRatio = 0.1;
		
		System.out.println("VIPCustomer(int, String) ������ ȣ��");
	}
	
	public int getAgendId() {
		return agentId;
	}
}
