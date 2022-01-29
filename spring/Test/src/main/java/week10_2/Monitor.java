package week10_2;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;

@Aspect
public class Monitor {
	@Before(value="execution(public * printAnimal(..))")
	public void beforeAnimal() {
		System.out.println("what is the animal?");
	}
	@AfterThrowing(value="execution(* *.newYear(..))")
	public void happyNewYear() {
		System.out.println("Happy New Year! You get one year older");
	}
	@Around(value="execution(* *.printAnimal(..))")
	public void aroundAnimal(ProceedingJoinPoint jp) throws Throwable {
		System.out.println("before around");
		jp.proceed();
		System.out.println("finish around");
	}
}
