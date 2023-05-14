package ch09;

public class Subway {
	int subNo;
	int passengeCnt;
	int money;
	
	public Subway(int subNo) {
		this.subNo = subNo;
	}
	
	public void take(int money) {
		this.money += money;
		passengeCnt++;
	}
	
	public void showSubInfo() {
		System.out.println(subNo + "번의 지하철의 승객은 " 
				+ passengeCnt +"명 이고, 수입은 " 
				+ money + " 원 입니다.");
	}
}
