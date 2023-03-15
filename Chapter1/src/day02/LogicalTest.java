package day02;

public class LogicalTest {

	public static void main(String[] args) {
		int n = 10;
		int i = 2;
		
		// 앞의 항이 False기 때문에 i는 2
		boolean val = ((n = n+10) < 10) && ((i=i+2) < 10);
		
		System.out.println(val);
		System.out.println(n);
		System.out.println(i);
	}

}
