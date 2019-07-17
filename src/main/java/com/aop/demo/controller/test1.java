package com.aop.demo.controller;

//import com.aop.demo.utils.aopinterface;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/ss")
public class test1 {

    @RequestMapping("/a")
    public List getA(String b,Integer i){
        System.out.println(11);
       /* Map map = new HashMap();
        map.put("s","a");*/
       List list = new ArrayList();
       list.add(b);
       list.add(i);
        return list;
    }
}
