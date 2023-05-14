package ch10;

public class Taxi {
	String taxiName;
	int income;
	
	public Taxi(String taxiName) {
		this.taxiName = taxiName;
		this.income = 0;
	}
	
	public void take(int income) {
		this.income += income;
	}
	
	public void showTaxiInfo() {
		System.out.println(taxiName + " 수입은 " + income + "입니다.");
	}
}
