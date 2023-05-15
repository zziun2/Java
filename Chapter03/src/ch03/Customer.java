package ch03;

// 상속
// 일반 고객
public class Customer {
	// 상위 클래스에 선언된 private는 하위에서 접근 불가
	// 따라서 protected 접근 제어자 사용
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
		return cName + "님의 등급은 " + cGrade + "이며, 보너스 포인트는 "
				+ bonusPoint + "입니다.";
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
