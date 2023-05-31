package ch07;

// reflection 프로그래밍
// Class 클래스를 사용하여 클래스의 정보(생성자, 변수, 메서드)등을 알 수 있고 인스턴스를 생성하고, 메서드를 호출하는 방식
// 일반적으로 자료형을 알고 있는 경우엔 사용하지 않음
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ClassMain {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException
	, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
		// 클래스 가져오는 방법 1
		Class c1 = Class.forName("ch07.Person");
		
		Person person = (Person)c1.newInstance();
		person.setName("Lee");
		System.out.println(person);
		
		// 클래스 가져오는 방법 2
		Class c2 = person.getClass();
		Person p = (Person)c2.newInstance();
		System.out.println(p);
		
		//Person kim2 = new Person("Kim"); 과 같은 내용
		Class[] parameterTypes = {String.class};
		Constructor cons = c2.getConstructor(parameterTypes);
		
		Object[] initargs = {"Kim"};
		Person kimPerson = (Person)cons.newInstance(initargs);
		System.out.println(kimPerson);
		
		
	}

}
