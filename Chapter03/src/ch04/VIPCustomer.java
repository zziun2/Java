package ch04;

public class VIPCustomer extends Customer {
	private int agentId;
	double salesRatio;
	
	// super�� �̿��� ���� Ŭ���� ������ ��� ȣ��
	public VIPCustomer(int cId, String cName) {
		super(cId, cName);
		
		cGrade = "VIP";
		bonusRatio = 0.05;
		salesRatio = 0.1;
	}
	
	public int getAgendId() {
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
