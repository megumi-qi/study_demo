package com.itheima.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class ProjectAdvice {
    @Pointcut("execution(* com.itheima.*.*Service.*(..))")
    private void pt(){}

    @Around("ProjectAdvice.pt()")
    public void runSpeed(ProceedingJoinPoint pjp) throws Throwable {
        Signature signature = pjp.getSignature();
        String className=signature.getDeclaringTypeName();
        String methodName=signature.getName();
        long startTime=System.currentTimeMillis();

        for (int i = 0; i < 10000; i++) {
            pjp.proceed();
        }

        long endTime=System.currentTimeMillis();
        System.out.println("执行万次耗费时间为:"+className+"."+methodName+"---->"+(endTime-startTime)+"ms");
    }
}
