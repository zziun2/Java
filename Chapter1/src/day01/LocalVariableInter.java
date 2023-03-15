package day01;

public class LocalVariableInter {

	public static void main(String[] args) {
		// java 10부터 가능, 현재 17.0.5
		// project - properties - java build path - library - add- jre 업데이트 가능
		var i = 10;
		var j = 10.0;
		var str = "test";
		
		System.out.println(i);
		System.out.println(j);
		System.out.println(str);
		
		var str2 = str; 
		System.out.println(str2);
		
		str = "hello";
		System.out.println(str);
		//str = 3; // 에러
	}

}
