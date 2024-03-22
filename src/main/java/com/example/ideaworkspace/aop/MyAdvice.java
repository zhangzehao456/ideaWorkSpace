package com.example.ideaworkspace.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyAdvice {
    @Pointcut("execution(void com.example.ideaworkspace.dao.impl.testDaoImpl.save())")
    private void pt(){}
    @Before("pt()")
    public void test()
    {System.out.println("AOP TEST");}
}
