package ch10;

public class TakeTaxi {

	public static void main(String[] args) {
		People p = new People("Edward", 20000);
		Taxi t = new Taxi("잘나간다 운수");
		
		p.takeTaxi(t, 10000);
		
		p.showMoneyInfo();
		t.showTaxiInfo();
	}

}
