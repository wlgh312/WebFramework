package week6;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class GradMain {
	public static void main(String[] args) {
		ApplicationContext con = new ClassPathXmlApplicationContext("bw6.xml");
		Grad g2 = (Grad)con.getBean("grad");
		g2.printGrad();
	}
}
