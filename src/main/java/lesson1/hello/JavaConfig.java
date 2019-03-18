package lesson1.hello;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("lesson1.hello")

public class JavaConfig {

    @Bean(name = "helloMan")
    public HelloMan helloMan(@Value("Yuri") String name) {
        HelloMan helloMan = new HelloManOnceSay(name);
        return helloMan;
    }
}
