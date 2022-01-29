package week10_1;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AopApp {
	public static void main(String[] args) throws Exception{
		ApplicationContext con = new ClassPathXmlApplicationContext("bhw10.xml");
		Grad g2 = (Grad)con.getBean("grad");
		g2.printGrad();
	}
}
