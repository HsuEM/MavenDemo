package idv.emp.aop;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MoocAspect {

	//@Pointcut("@annotation(controller.EmpController.go)")
    //@Pointcut("execution(* controller.EmpController.go*(..))")
	@Pointcut("execution(* idv.emp.controller.*.*(..))")	
    private void goToMaint22() {}

    @Before("goToMaint22()")
    public void beforeLogAdvice(JoinPoint jointPoint) { 
    	System.out.println(" ●●目標物件方法執行之前");
    	System.out.println(" ●●目標物件方法執行之前");
    	System.out.println(" ●●目標物件方法執行之前");
    	System.out.println(" ●●目標物件方法執行之前");
    }
    
    @After("goToMaint22()")
    public void AfterLogAdvice(JoinPoint jointPoint) { 
    	System.out.println(" ●●目標物件方法執行之後");

    }
    
    @Around("goToMaint22()")
    public void AfterLogAdvice3333(ProceedingJoinPoint jointPoint) throws Throwable{ 
		Object result = null;
		result = jointPoint.proceed();
    	System.out.println(" 2222"+ result);

    }

}
