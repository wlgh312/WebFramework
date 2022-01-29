package hw4_p01;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Main {

	public static void main(String[] args) {
		HelloWorld hi= new HelloWorld();
		hi.setMessage("안녕");
		System.out.println(hi.getMessage());
	}
	public static void main2(String[] args) {
		ApplicationContext con = new ClassPathXmlApplicationContext("beans.xml");
		HelloWorld h = (HelloWorld)con.getBean("hi");
		System.out.println(h.getMessage());
	}

}
