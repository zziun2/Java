package ch02;

// 상속
// 일반 고객
public class Customer {
	protected int cId;
	protected String cName;
	protected String cGrade;
	int bonusPoint;
	double bonusRatio;
	
	// 디폴트 삭제 후 매개 변수 있는 생성자 추가
	public Customer(int cId, String cName) {
		this.cId = cId;
		this.cName = cName;
		
		cGrade = "SILVER";
		bonusRatio = 0.01;
		System.out.println("Customer(int, String) 생성자 호출");
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
