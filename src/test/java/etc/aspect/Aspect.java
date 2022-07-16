package etc.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@org.aspectj.lang.annotation.Aspect
public class Aspect {

    @Before(value = "pointCut()" )
    public void before() {
        System.out.println("before");
    }

    @After(value = "pointCut()")
    public void after() {
        System.out.println("after");
    }

    @Around(value = "pointCut()")
    public void around(ProceedingJoinPoint point) throws Throwable {
        System.out.println("before around");
        point.proceed();
        System.out.println("after around");
    }

    @Pointcut(value = "execution(* etc.aspect.User.pointDemo(..))")
    public void pointCut() {
    }

}


