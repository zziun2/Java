package ch06;

public class GenericPrinterMain {

	public static void main(String[] args) {
		GenericPrinter<Powder> powderPrinter = new GenericPrinter<Powder>();
		powderPrinter.setMaterial(new Powder());
		Powder powder = powderPrinter.getMaterial(); // ����ȯ ���� ����
		System.out.println(powder);
		
		GenericPrinter<Plastic> plasticPrinter = new GenericPrinter<Plastic>();
		plasticPrinter.setMaterial(new Plastic());
		Plastic plastic = plasticPrinter.getMaterial(); // ����ȯ ���� ����
		System.out.println(plasticPrinter);
		
		/*
			GenericPrinter powderPrinter2 = new GenericPrinter();
			powderPrinter2.setMaterial(new Powder());
			Powder powder2 = (Powder)powderPrinter.getMaterial(); -> ����ȯ
			System.out.println(powder2);
		*/
	}

}
