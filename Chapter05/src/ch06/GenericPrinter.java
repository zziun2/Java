package ch06;

public class GenericPrinter<T extends Material> {
	// T 자료형
	private T material; 

	public void setMaterial(T material) {
		this.material = material;
	}
	
	// T 자료형을 반환하는 제너릭 메서드
	public T getMaterial() {
		return material;
	}
	
	public String toString() {
		return material.toString();
	}
	
	public void printing() {
		material.doPrinting();
	}
}
