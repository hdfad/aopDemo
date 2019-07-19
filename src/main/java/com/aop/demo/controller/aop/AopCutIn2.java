package com.aop.demo.controller.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AopCutIn2 {

    /**
     * 在连接点joint point前后执行一段代码
     * @param proceedingJoinPoint
     * @param calibrationOfParameters
     * @throws Throwable
     */
    @Around(value = "@annotation(calibrationOfParameters)")
    public void valueCheck(ProceedingJoinPoint proceedingJoinPoint, CalibrationOfParameters calibrationOfParameters) throws Throwable {
        Object[] args = proceedingJoinPoint.getArgs();
        System.out.println(args);
        String[] s= new String[1];
        s[0]="1";
        proceedingJoinPoint.proceed(s);
    }
}
