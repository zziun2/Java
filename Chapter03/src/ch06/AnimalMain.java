package ch06;

import java.util.ArrayList;


/*
 * 	������ : �ϳ��� �ڵ尡 ���� �ڷ������� �����Ǿ� ����Ǵ� ��
 * 	���� �ڵ忡�� ���� �ٸ� ���� ��� �߻�
 * 	��ü���� ���α׷����� ���� ū Ư¡ => ��������, ���, ������
 * 	������, Ȯ�强, �������� ��
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
