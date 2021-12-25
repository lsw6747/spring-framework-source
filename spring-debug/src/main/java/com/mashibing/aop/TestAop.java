package com.mashibing.aop;

import com.mashibing.aop.service.MyCalculator;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.lang.reflect.Field;

public class TestAop {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("aop.xml");
        MyCalculator bean = ac.getBean(MyCalculator.class);
        bean.add(1, 1);
    }

    public static void saveGeneratedCGlibProxyFiles(String dir) throws Exception {
        Field field = System.class.getDeclaredField("props");
    }
}
