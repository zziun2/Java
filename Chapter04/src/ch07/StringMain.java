package ch07;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class StringMain {

	public static void main(String[] args) throws ClassNotFoundException {
		// Class 클래스 사용하기
		// 장점 : 동적 로딩
		Class c = Class.forName("java.lang.String");
		
		// lava.lang.String 
		Constructor[] cons = c.getConstructors();
		for(Constructor co : cons) {
			System.out.println(co);
		}
		
		// lava.lang.String 안의 메소드들
		Method[] m = c.getMethods();
		for(Method mth : m) {
			System.out.println(mth);
		}
	}
	

}