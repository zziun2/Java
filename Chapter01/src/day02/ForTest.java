package day02;

public class ForTest {

	public static void main(String[] args) {
		int count = 1;
		int sum = 0;
		for(int i=0; i<10; i++, count++) { //i는 횟수
			sum += count;
		}
		System.out.println(sum);
	}

}
