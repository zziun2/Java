package ch09;

public class Bus {
	int busNo;
	int passengeCnt;
	int money;
	
	public Bus(int busNo) {
		this.busNo = busNo;
	}
	public void take(int money) {
		this.money += money;
		passengeCnt ++;
	}
	
	public void showBusInfo() {
		System.out.println(busNo + "번의 버스의 승객은 " 
			+ passengeCnt +"명 이고, 수입은 " 
			+ money + " 원 입니다.");
	}
}
