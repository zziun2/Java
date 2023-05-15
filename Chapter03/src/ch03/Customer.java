package ch03;

// ���
// �Ϲ� ��
public class Customer {
	// ���� Ŭ������ ����� private�� �������� ���� �Ұ�
	// ���� protected ���� ������ ���
	protected int cId;
	protected String cName;
	protected String cGrade;
	int bonusPoint;
	double bonusRatio;
	
	public Customer() {
		cGrade = "SILVER";
		bonusRatio = 0.01;
	}
	
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price;
	}
	
	public String showCustomerInfo() {
		return cName + "���� ����� " + cGrade + "�̸�, ���ʽ� ����Ʈ�� "
				+ bonusPoint + "�Դϴ�.";
	}

	public int getcId() {
		return cId;
	}

	public void setcId(int cId) {
		this.cId = cId;
	}

	public String getcName() {
		return cName;
	}

	public void setcName(String cName) {
		this.cName = cName;
	}

	public String getcGrade() {
		return cGrade;
	}

	public void setcGrade(String cGrade) {
		this.cGrade = cGrade;
	}

	public int getBonusPoint() {
		return bonusPoint;
	}

	public void setBonusPoint(int bonusPoint) {
		this.bonusPoint = bonusPoint;
	}

	public double getBonusRatio() {
		return bonusRatio;
	}

	public void setBonusRatio(double bonusRatio) {
		this.bonusRatio = bonusRatio;
	}
	
	
}
