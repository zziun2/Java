package ch01;

public class VIPCustomer extends Customer {
	private int agentId; // ���� ����
	double salesRatio;
	
	public VIPCustomer() {
		cGrade = "VIP";
		bonusRatio = 0.05;
		salesRatio = 0.1;
	}
	
	public int getAgendId() {
		return agentId;
	}
}
