package ch02;

public class EqualsMain {

	public static void main(String[] args) {
		Student Lee = new Student(100, "LEE");
		Student Lee2 = Lee;
		Student Shun = new Student(100, "Lee");
		
		System.out.println(Lee == Shun); //false
		System.out.println(Lee.equals(Shun)); //true, 재정의 안하면 false
		
		System.out.println(Lee.hashCode()); //100, 재정의 안하면 917142466
		System.out.println(Shun.hashCode()); //100, 재정의 안하면 1993134103
		
		Integer i1 = new Integer(100); 
		Integer i2 = new Integer(100);
		
		System.out.println(i1.equals(i2)); //true
		System.out.println(i1.hashCode()); //100
		System.out.println(i2.hashCode()); //100
		
		System.out.println(System.identityHashCode(i1)); // 917142466
		System.out.println(System.identityHashCode(i2)); // 1993134103


	}

}
