package hw5;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext con = new ClassPathXmlApplicationContext("bhw5.xml");
		Emotion emo = (Emotion)con.getBean("yesterday");
		emo.Emotion();
		Emotion emo2 = (Emotion)con.getBean("today");
		emo2.Emotion();
		Emotion emo3 = (Emotion)con.getBean("past");
		emo3.Emotion();

	}

}
