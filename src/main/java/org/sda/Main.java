package org.sda;

import org.sda.beans.MyBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Kätlin Padesaar-Korela
 *
 */

public class Main {
    public static void main(String[] args) {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        MyBean myBean = (MyBean) applicationContext.getBean("myBean");
        System.out.println(myBean.sayHello());

        myBean.setName("Donald");
        System.out.println(myBean.sayHello());

    }
}