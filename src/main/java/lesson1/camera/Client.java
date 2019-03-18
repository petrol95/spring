package lesson1.camera;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

    public static void main (String [] args) {

        // Configuring using xml
//        ApplicationContext context = new ClassPathXmlApplicationContext("cam_config.xml");

        // Configuring using annotations
//        ApplicationContext context = new ClassPathXmlApplicationContext("cam_config_annot.xml");

        // Configuring using JavaConfig
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        Camera camera = context.getBean("camera", Camera.class);
        camera.doPhotograph();
    }

}
