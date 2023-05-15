package ch07;

public class VIPCustomer extends Customer {
	private int agentId;
	double salesRatio;
	
	public VIPCustomer(int cId, String cName, int agentId) {
		super(cId, cName);
		cGrade = "VIP";
		bonusRatio = 0.05;
		salesRatio = 0.1;
		this.agentId = agentId;
	}
	
	public String showCustomerInfo(){
		return super.showCustomerInfo() + " ��� ���� ��ȣ�� " + agentId + "�Դϴ�";  
	}
	
	public int getAgentId(){
		return agentId;
	}

	// �������̵�
	// ���� Ŭ�������� ������ �̸��� �޼��带 �������� �� ����
	@Override
	public int calcPrice(int price) {
		// TODO Auto-generated method stub
		bonusPoint += price * bonusRatio;
		return price - (int)(price * salesRatio);
	}
	
	/*
	 * @overriding �ֳ����̼� (annotation)
	 * 	�ֳ����̼� = �ּ�
	 * 	�����Ϸ����� Ư���� ���� ����
	 * 	- @Override : �����ǵ� �޼���
	 * 	- @FuctionalInterface : �Լ��� �������̽�
	 * 	- @Deprecated : ���� �������� ������ ���� �� �ִ� ���� �޼��忡 ���
	 * 	- @SuppressWarnings : Ư�� ��� ��Ÿ���� �ʵ��� ��
	 */
	
}
