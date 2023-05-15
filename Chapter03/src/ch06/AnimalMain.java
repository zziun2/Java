package ch06;

import java.util.ArrayList;


/*
 * 	다형성 : 하나의 코드가 여러 자료형으로 구현되어 실행되는 것
 * 	같은 코드에서 여러 다른 실행 결과 발생
 * 	객체지향 프로그래밍의 가장 큰 특징 => 정보은닉, 상속, 다형성
 * 	유연성, 확장성, 유지보수 편리
 */
public class AnimalMain {

	public static void main(String[] args) {
		Animal hAnimal = new Human();
		Animal tAnimal = new Tiger();
		Animal eAnimal = new Eagle();
		
		AnimalMain main = new AnimalMain();
		main.moveAnimal(hAnimal);
		main.moveAnimal(tAnimal);
		main.moveAnimal(eAnimal);
		
		ArrayList<Animal> animalList = new ArrayList<Animal>();
		animalList.add(hAnimal);
		animalList.add(tAnimal);
		animalList.add(eAnimal);
		
		for(Animal animal : animalList) {
			animal.move();
		}
	}
	
	public void moveAnimal(Animal animal) {
		animal.move();
	}

}
