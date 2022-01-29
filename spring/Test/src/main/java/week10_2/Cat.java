package week10_2;

public class Cat implements Animal{
	String name;
	String kind;
	int age;
	public Cat(String name, String kind, int age) {
		this.name=name;
		this.kind=kind;
		this.age=age;
	}
	public void printAnimal() {
		System.out.printf("name : %s\nkind : %s\nage : %d",name, kind, age);
	}
}
