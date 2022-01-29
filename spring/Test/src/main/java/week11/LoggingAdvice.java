package week11;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;

import org.aspectj.lang.Signature;

public class LoggingAdvice {
	public void beforeAdvice() {
		System.out.println("------------메소드를 실행전에 보임-------------");
	}
	public void beforeAdvice2() { System.out.println("------------구매전에 확인해 주세요-------------"); }
	public void afterAdvice() { System.out.println("########메소드를 실행후에 보임########"); }
	public void aroundAdvice(ProceedingJoinPoint  joinPoint) throws Throwable{
		//추가 로직
		Signature method = joinPoint.getSignature();
  	             System.out.println("실행한 메소드 : " + method.getName()); 

		//메소드 실행
		joinPoint.proceed();

		//추가 로직
		if("buyKims".equals(method.getName())) 
			System.out.println("Kims 상품을 구입하셨군요~~");
		else
			System.out.println("Item 상품을 구입하셨군요~~");
	}

}
