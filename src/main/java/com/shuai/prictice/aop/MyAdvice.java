package com.shuai.prictice.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.lang.reflect.Array;

@Component
@Aspect
public class MyAdvice {
//    @Pointcut("execution(* com.shuai.prictice.dao.*.*(..))")
//    private void pt(){};
    @Pointcut("execution(* com.shuai.prictice.dao.*.save*(..))")
    private void pt2(){};

//    @Before("pt()")
//    public void method(){
//        System.out.println(System.currentTimeMillis());
//    }

//    @Around("pt()")
//    public Object around(ProceedingJoinPoint pjp) throws Throwable {
//        System.out.println("befor advice");
//        Object proceed = pjp.proceed();
//        System.out.println("after divice");
//        return proceed;
//    }

    //出异常也会运行
    @AfterReturning(value = "pt2()",returning = "ref")
    public Object after(Object ref){//如果参数中有 JoinPoint jp 则必须放在第一位 否则会报错
        System.out.println("after advice"+ref);
        return ref ;
    }

    //@AfterThrowing
    //异常后才会运行
    //@AfterReturning
    //有异常不会运行

//    @Around("pt2()")
//    public Object aroundSelect(ProceedingJoinPoint pjp) throws Throwable {
//        System.out.println("befor 2 advice");
//        Integer proceed = (Integer) pjp.proceed();
//        System.out.println("after 2 divice");
//        return proceed;
//    }

//    @Around("pt2()")
//    public void aroundSelect(ProceedingJoinPoint pjp) throws Throwable {
//        Signature signature = pjp.getSignature();
//        System.out.println(signature.getDeclaringType());
//        System.out.println(signature.getName());
//        Object[] args = pjp.getArgs();
//        args[0] = 1000;
//        System.out.println("befor 2 advice");
//        pjp.proceed(args);
//        System.out.println("after 2 divice");
//
//    }

}
