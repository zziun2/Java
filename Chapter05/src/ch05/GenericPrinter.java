package ch05;

public class GenericPrinter<T> {
	// T �ڷ���
	private T material; 

	public void setMaterial(T material) {
		this.material = material;
	}
	
	// T �ڷ����� ��ȯ�ϴ� ���ʸ� �޼���
	public T getMaterial() {
		return material;
	}
	public String toString() {
		return material.toString();
	}
}
