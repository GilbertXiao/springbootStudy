package com.gilxyj.aop21.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * @program: aop21
 * @description:
 * @author: GilbertXiao
 * @create: 2019-08-19 23:20
 **/
@Component
@Aspect
public class LogComponent {

    @Pointcut("execution(* com.gilxyj.aop21.service.*.*(..))")
    public void pc1(){
    }

    @Before(value = "pc1()")
    public void before(JoinPoint joinPoint){
        String name = joinPoint.getSignature().getName();
        System.out.println("Before>>>>"+name);
    }

    @After(value = "pc1()")
    public void after(JoinPoint joinPoint){
        String name = joinPoint.getSignature().getName();
        System.out.println("After>>>>"+name);
    }

    @AfterReturning(value = "pc1()",returning = "result")
    public void afterReturn(JoinPoint joinPoint,Object result){

        String name = joinPoint.getSignature().getName();
        System.out.println("afterReturn>>>>"+name+",>>>>"+result);

    }

    /**
     * 这是一个异常通知，该方法在方法执行抛出异常时执行
     *
     * 如果目标方法没有异常，则通知不会被触发
     */
    @AfterThrowing(value = "pc1()",throwing = "e")
    public void throwing(JoinPoint point,Exception e){
        System.out.println(">>>>>>>"+e.getMessage());
    }


    /**
     *
     * 环绕通知是上面四种通知的集大成者，因为这个通知包含了上面四种通知
     * @param pjp 这个类似于Method对象
     * @return
     *
     */
    @Around("pc1()")
    public Object around(ProceedingJoinPoint pjp){
        //pjp.proceed() 类似于method.invoke()
        try {
            //写在这个位置的，就是前置通知
            //return pjp.proceed(new Object[]{1,2});
            System.out.println(">>>>>>>aroundBefore");
            Object proceed = pjp.proceed();
            System.out.println(">>>>>>>aroundAfter");
            //写在这个位置的，就是后置通知
            return proceed;
        } catch (Throwable throwable) {
            //写在这个位置的，就是异常通知
            System.out.println(">>>>>>>"+throwable.getMessage());
            throwable.printStackTrace();
        }
        return null;
    }





}
