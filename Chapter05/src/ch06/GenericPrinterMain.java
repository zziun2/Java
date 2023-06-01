package ch06;

public class GenericPrinterMain {

	public static void main(String[] args) {
		GenericPrinter<Powder> powderPrinter = new GenericPrinter<Powder>();
		powderPrinter.setMaterial(new Powder());
		Powder powder = powderPrinter.getMaterial(); // 형변환 하지 않음
		System.out.println(powder);
		
		GenericPrinter<Plastic> plasticPrinter = new GenericPrinter<Plastic>();
		plasticPrinter.setMaterial(new Plastic());
		Plastic plastic = plasticPrinter.getMaterial(); // 형변환 하지 않음
		System.out.println(plasticPrinter);
		
		/*
			GenericPrinter powderPrinter2 = new GenericPrinter();
			powderPrinter2.setMaterial(new Powder());
			Powder powder2 = (Powder)powderPrinter.getMaterial(); -> 형변환
			System.out.println(powder2);
		*/
	}

}
