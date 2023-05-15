package ch01;

public class VIPCustomer extends Customer {
	private int agentId; // 전문 상담원
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
