package com.mashibing.aop.service;

import org.springframework.stereotype.Service;

// @Service
public class MyCalculator/* implements Calculator*/{

    public Integer add(int i, int j) {
        Integer result = i + j;
        return result;

    }

    public Integer sub(int i, int j) {
        Integer result = i - j;
        return result;
    }

    public Integer div(int i, int j) {
        Integer result = i / j;
        return result;
    }

    public Integer mul(int i, int j) {
        Integer result = i * j;
        return result;
    }

    public Integer show(Integer i) {
        System.out.println("show ......");
        return i;
    }
}
