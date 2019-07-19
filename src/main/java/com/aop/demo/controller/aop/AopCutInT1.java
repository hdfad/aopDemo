package com.aop.demo.controller.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * aop切面
 * 一个aspect即为一个切面，一个切面包含pointcut和advice
 */
//@Aspect
@Component
public class AopCutInT1 {

    /**
     * 配置切入点
     * pointcut:表示一组joint point（连接点），定义了Advice（增强）将要发生的地方
     * execution：切入点表达式
     */
    //@Pointcut("execution(* com.aop.demo.controller..*(..))")
    public void joinPointInAllController(){

    }

    /**
     * Advice：增强，定义了在pointcut（切入点）切入后将要执行的逻辑操作
     * 有before、after、around，在joint point之前或之后或是代替执行一段逻辑
     * before:在执行代码之前执行执行，不能阻止joint point的执行，除非异常
     * after：在joint point执行之后才会执行此advice，返回执行的advice
     * around：在joint point 执行之前或之后都会执行的advice
     * 配置增强
     * 后置通知
     */
    //@AfterReturning(value = "joinPointInAllController()",returning = "keys")
    public void tz(JoinPoint joinPoint,Object keys){
        System.out.println("第一个后置返回通知的返回值：" + keys);
        List list = (ArrayList)keys;
        for(int i=0;i<list.size();i++){
            if(list.get(i).equals("abc")){
                list.clear();
                list.add("yyy");
            }
        }

    }
}
