package ch08;

public class Person {
	String name;
	int age;
	
	public Person() {
		// 생성자에서 또 다른 생성자를 호출할 때 사용
		this("no name", 20); // name = "test"; 안됨(밑에는 사용 가)
		
		//this
		// 인스턴스 자신의 메모리를 가르킴
		// 생성된 인스턴스 메모리의 주소(참조값)을 가짐
	}
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void showPerson() {
		System.out.println(name + ", " + age);
	}
	
	public Person getPerson() {
		return this; // 주소값
	}
	
	public static void main(String[] args) {
		Person person = new Person();
		person.showPerson();
		
		System.out.println(person);
		
		Person person2 = person.getPerson();
		System.out.println(person2); // person.showPerson();와 같은 값
	}
}
