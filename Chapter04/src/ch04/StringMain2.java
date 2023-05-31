package ch04;

public class StringMain2 {

	public static void main(String[] args) {
		String java = new String("java");
		String android = new String("android");
		System.out.println(System.identityHashCode(java)); //292938459
		
		java = java.concat(android);
		
		System.out.println(java); // javaandroid
		
		// String을 연결하면 기존의 String에 연결되는 것이 아닌 새로운 문자열이 생성됨 ( 메모리 낭비가 발생할 수 있음)
		System.out.println(System.identityHashCode(java)); //917142466
	}

}
