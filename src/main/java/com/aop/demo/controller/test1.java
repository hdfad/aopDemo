package com.aop.demo.controller;

//import com.aop.demo.utils.aopinterface;


import com.aop.demo.controller.aop.CalibrationOfParameters;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/")
public class test1 {

    @RequestMapping("/springAopTest")
    public List springAopTest(String b,Integer i){
        System.out.println(11);
       /* Map map = new HashMap();
        map.put("s","a");*/
       List list = new ArrayList();
       list.add(b);
       list.add(i);
        return list;
    }

    @RequestMapping("/t2")
    @CalibrationOfParameters
    public String springAopTests( String b){
        System.out.println(b);
        return ".......";
    }
}
