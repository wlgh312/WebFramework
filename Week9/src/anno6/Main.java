package anno6;

import java.lang.reflect.Method;

public class Main {
	public static void main(String[] args) {
		Method[] k = Service.class.getDeclaredMethods();
		for(Method m:k) {
			if(m.isAnnotationPresent(PrtAnnotation.class)) {
				PrtAnnotation p = m.getAnnotation(PrtAnnotation.class);
				System.out.println("<" + m.getName() + ">");
				for(int i=0; i<p.cnt(); i++)
					System.out.print(p.value());
				System.out.println();
				try {
					m.invoke(new Service());
				}catch(Exception e) {
					e.printStackTrace();
				}
				System.out.println();
			}
		}
	}	
}