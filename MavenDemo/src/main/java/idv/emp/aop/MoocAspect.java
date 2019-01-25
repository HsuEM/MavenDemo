package idv.emp.aop;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class MoocAspect {

	@Pointcut("@annotation(controller.EmpController.go)")
    //@Pointcut("execution(* controller.EmpController.go*(..))")  
    private void goToMaint22() {}

    @Before("goToMaint22()")
    public void beforeLogAdvice(JoinPoint jointPoint) { 
    	System.out.println(" ●●目標物件方法執行之前");
    	System.out.println(" ●●目標物件方法執行之前");
    	System.out.println(" ●●目標物件方法執行之前");
    	System.out.println(" ●●目標物件方法執行之前");
    }

}
