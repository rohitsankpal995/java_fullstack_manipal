package com.ani.aop.xl;

import java.time.LocalDate;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class XLReaderAspect {

    @Before("execution(* com.ani.aop.xl.XLReader.*(..))")
    public void printBeforeExecution(JoinPoint jp) {
        System.out.println("Method Executed At : "+LocalDate.now().toString());
    }
}
