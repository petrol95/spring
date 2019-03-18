package lesson2.camera;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Client {

    public static void main (String [] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        // Getting camera
        Camera camera = context.getBean("camera", Camera.class);

        // Breaking camera
        camera.breaking();
        // Attempt doing photo
        camera.doPhotograph();

        // Getting camera
        camera = context.getBean("camera", Camera.class);
        // Attempt doing photo
        camera.doPhotograph();
    }

}
