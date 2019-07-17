package com.aop.demo.controller.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * aop切面
 */
@Aspect
@Component
public class section {

    /**
     * 配置切入点
     */
    @Pointcut("execution(* com.aop.demo.controller..*(..))")
    public void joinPointInAllController(){

    }


    /**
     * 配置增强
     * 后置通知
     */
    @AfterReturning(value = "joinPointInAllController()",returning = "keys")
    //@ResponseBody
    public void tz(JoinPoint joinPoint,Object keys){
        System.out.println("第一个后置返回通知的返回值：" + keys);
        //在增强中把值进行修改
//        if(keys.toString().equals("a")){
//            System.out.println("125222");
//            keys="改了值bbb";
//        }
        List list = (ArrayList)keys;
        for(int i=0;i<list.size();i++){
            if(list.get(i).equals("abc")){
                list.clear();
                list.add("yyy");
            }
        }

    }
}
