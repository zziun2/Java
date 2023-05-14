package ch13;

// single tone 
public class Company {
	
	// 클래스 내부 유일한 private 인스턴스 생성
	private static Company instance = new Company();
	
	// 외부에서 생성하지 못하도록 private
	private Company() {}

	public static Company getInstance() {
		if(instance == null) {
			instance = new Company();
		}
		return instance;
	}
}
