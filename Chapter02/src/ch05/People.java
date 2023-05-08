package ch05;

public class People {
	public int height;
	public int weight;
	public String sex;
	public String name;
	public int age;
	
	public People(int height, int weight, String sex, String name, int age) {
		this.height = height;
		this.weight = weight;
		this.sex = sex;
		this.name = name;
		this.age = age;
	}
	
	public String profile() {
		return "키가 "+ height + "이고, 몸무게가 "
				+ weight+ " 킬로 인 " + sex + "이 있습니다. 이름은 "
				+ name + "이고, 나이는 " + age + " 입니다.";
	}
	
	
	public static void main(String[] args) {
		People p1 = new People(180, 78, "남성", "Tomas", 37);
		String result = p1.profile();
		System.out.println(result);
	}
}
