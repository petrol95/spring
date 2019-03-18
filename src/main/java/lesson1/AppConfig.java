package lesson1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("lesson1")

public class AppConfig {

    @Bean(name = "cameraRoll")
    public CameraRoll cameraRoll() {
        return new ColorCameraRoll();
    }

    @Bean (name = "camera")
    public Camera camera(CameraRoll cameraRoll) {
        Camera camera = new CameraImpl();
        ((CameraImpl)camera).setCameraRoll(cameraRoll);
        return camera;
    }
}