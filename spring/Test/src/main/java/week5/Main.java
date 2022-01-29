package week5;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext cnt = new ClassPathXmlApplicationContext("b1001.xml");
		Performer test = (Performer)cnt.getBean("test");
		test.perform();
	}

}
