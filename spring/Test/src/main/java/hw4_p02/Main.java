package hw4_p02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import hw4_p01.HelloWorld;

public class Main {

	public static void main(String[] args) {
		EnPrint ep = new EnPrint();
		ep.show();
		
		KrPrint kp = new KrPrint();
		kp.show();
		
		Name np = new Name("이만두");
		kp.setName(np);
		kp.show();
		
		np.setName("최말자");
		kp.setName(np);
		kp.show();
	
		ApplicationContext con = new ClassPathXmlApplicationContext("beans.xml");
		KrPrint h = (KrPrint)con.getBean("kp");
		h.show();
	}

}
