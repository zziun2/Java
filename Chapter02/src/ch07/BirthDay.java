package ch07;

// 정보 은닉

/*
  [접근 제어 지시자]
	- private : 같은 클래스 내부에서만 접근 가능, 외부 절대 접근 불가, 상속 관계도 불가
	- default : 같은 패키지 내부에서만 접근 가능, 생략 가능
	- protect : 같은 패키지 혹은 상속 관계만 가능
	- public : 클래스 외부 어디서나 접근 가능 
*/
public class BirthDay {
	private int day;
	private int month;
	private int year;
	
	private boolean isValid; // 정의 안할 경우, 기본값 false
	
	/*
	 	[get() / set() 메서드]
			private 으로 선언된 멤버 변수에 대해 접근, 수정할 수 있는 메서드를 Public 으로 제공
	 		우클릭으로 정의 가능
	 */
	public int getDay() {
		return day;
	}
	
	public void setDay(int day) {
		this.day = day;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		if(month < 1 || month > 12) 
			isValid = false;
		else 
			isValid = true;
		
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
	public void showDate() {
		if(isValid) { // 존재하는 날짜일 경우
			System.out.println(year + "년 " + month + "월 " + day + "일 입니다.");
		} else {
			System.out.println("유효하지 않은 날짜입니다.");
		}
	}
}
