package day01;

public class VariableTest {

	public static void main(String[] args) {
		byte bnum = -128; // -128 ~ 127
		System.out.println(bnum); // 128일 경우 에러
		
		// int num = 12345678900; // 에러
		long lnum = 12345678900L; // 작은 수에 경우 int 형으로 자동 변환
		System.out.println(lnum);
		
		
	}

}
