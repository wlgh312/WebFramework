package week11;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
      public static void main(String[] args) {
	ApplicationContext context = new ClassPathXmlApplicationContext("bw11.xml");
	ItemTarget itemTarget = (ItemTarget)context.getBean("itemTarget");
	itemTarget.selectItem();
	itemTarget.buyItem();
	itemTarget.buyItems();

	KimsTarget kimsTarget = (KimsTarget)context.getBean("KimsTarget");
	kimsTarget.buyKims();

    }
}
