package ch08;

import java.util.ArrayList;

import ch08.Eagle;
import ch08.Tiger;
import ch08.Human;
import ch08.Animal;

// 다운 캐스팅
// 업캐스팅된 클래스를 다시 원래의 타입으로 형 변환
// 하위 클래스로의 형 변환은 명시적으로 해야 함

// 묵시적 : Customer vc = new VIPCustomer(); 
// 명시적 : VIPCustomer vCustomer = (VIPCustomer)vc;

public class AnimalMain {
	
	public void testDownCasting(ArrayList<Animal> list) {
		for(int i=0; i<list.size(); i++) {
			Animal animal = list.get(i);

			// instanceof를 이용해 인스턴스 형 체크
			// => 원래 인스턴스의 형이 맞는지 여부를 체크하는 키워드 맞으면 true 아니면 false를 반환 함
			if(animal instanceof Human) {
				Human human = (Human)animal;
				human.readBooks();
			} else if (animal instanceof Tiger) {
				Tiger tiger = (Tiger)animal;
				tiger.hunting();
			} else if (animal instanceof Eagle) {
				Eagle eagle = (Eagle)animal;
				eagle.flying();
			} else {
				System.out.println("error");
			}
 		}
	}
	
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
