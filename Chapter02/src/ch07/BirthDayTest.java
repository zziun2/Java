package ch07;

public class BirthDayTest {

	public static void main(String[] args) {
		BirthDay date = new BirthDay();
		date.setYear(2019);
		date.setMonth(13);
		date.setDay(30);
		
		// date.month = 100; 불가
		
		date.showDate();
	}

}
