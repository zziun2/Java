package ch08;

import java.util.ArrayList;

import ch08.Eagle;
import ch08.Tiger;
import ch08.Human;
import ch08.Animal;

// �ٿ� ĳ����
// ��ĳ���õ� Ŭ������ �ٽ� ������ Ÿ������ �� ��ȯ
// ���� Ŭ�������� �� ��ȯ�� ��������� �ؾ� ��

// ������ : Customer vc = new VIPCustomer(); 
// ����� : VIPCustomer vCustomer = (VIPCustomer)vc;

public class AnimalMain {
	
	public void testDownCasting(ArrayList<Animal> list) {
		for(int i=0; i<list.size(); i++) {
			Animal animal = list.get(i);

			// instanceof�� �̿��� �ν��Ͻ� �� üũ
			// => ���� �ν��Ͻ��� ���� �´��� ���θ� üũ�ϴ� Ű���� ������ true �ƴϸ� false�� ��ȯ ��
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
