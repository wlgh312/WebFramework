package week10_2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class animalMain {
	public static void main(String[] args) {
		ApplicationContext con = new ClassPathXmlApplicationContext("bhw10_2.xml");
		Animal cat = (Animal)con.getBean("cat");
		cat.printAnimal();
		Animal dog = (Animal)con.getBean("dog");
		dog.printAnimal();
	}
}
