package sample2;

public class HelloApp {
	public static void main(String[] args) {
		MessageBean m1 = new MessageBeanKr();
		m1.sayHello("kim");
		MessageBean m2 = new MessageBeanEn();
		m2.sayHello("kim");
	}

}
