package lesson1.hello;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Hello {

    public static void main (String [] args) {

        // Configuring using xml
//        ApplicationContext context = new ClassPathXmlApplicationContext("hello_config.xml");

        // Configuring using JavaConfig
        ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);

        HelloMan helloMan = context.getBean("helloMan", HelloMan.class);
        helloMan.helloSay();
    }

}

