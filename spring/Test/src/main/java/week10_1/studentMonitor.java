package week10_1;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Around;
@Aspect
public class studentMonitor {
	@Before(value="execution(* *.GradResult(..))")
	public void checkGraduate() {
		System.out.println("Check graduation requirements");
	}
	@Around(value="execution(* *.GradResult(..))")
	public void noCheckGraduate() {
		System.out.println("Do not check graduation requirements");
	}
}
