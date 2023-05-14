package ch09;

//협력
public class TakeTransform {

	public static void main(String[] args) {
		Student student1 = new Student("James", 5000);
		Student student2 = new Student("Tomas", 10000);

		Bus bus100 = new Bus(100);
		Bus bus500 = new Bus(500);
		student1.takeBus(bus100); // 학생이 100번 버스를 탔다.
		
		Subway greenSub = new Subway(2);
		student2.takeSubway(greenSub);
		
		student1.showInfo();
		student2.showInfo();
		
		bus100.showBusInfo();
		greenSub.showSubInfo();
		
		bus500.showBusInfo();
	}

}
