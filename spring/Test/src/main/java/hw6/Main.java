package hw6;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext cnt = new ClassPathXmlApplicationContext("bhw6.xml");
		Performer test = (Performer)cnt.getBean("test");
		test.perform();
	}

}
