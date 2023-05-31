package ch03;

public class EqualsMain {

	public static void main(String[] args) throws CloneNotSupportedException {
		Student Lee = new Student(100, "LEE");
		Student Lee3 = (Student)Lee.clone();
		System.out.println(System.identityHashCode(Lee)); // 917142466
		System.out.println(System.identityHashCode(Lee3)); // 1993134103
	}

}
