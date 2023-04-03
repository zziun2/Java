package day02;

public class BreakTest {

	public static void main(String[] args) {
		int sum=0;
		int num;
		
		for(num=1;;num++) {
			sum+=num;
			 // num++로 인해 증감 후 num이 출력될 수 있으므로 break문으로 제어
			if(sum >= 100) {
				break;
			}
		}
		
		System.out.println(sum);
		System.out.println(num);
	}

}
