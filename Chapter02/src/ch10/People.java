package ch10;

public class People {
	String name;
	int money;
	
	public People(String name, int money) {
		this.name = name;
		this.money = money;
	}
	
	public void takeTaxi(Taxi taxi, int fee) {
		this.money -= fee;
		taxi.take(fee);
	}
	
	public void showMoneyInfo() {
		System.out.println(name + "의 남은 돈은 " + money + "원 입니다.");
	}
}
