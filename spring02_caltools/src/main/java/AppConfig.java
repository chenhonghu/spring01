import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Random;

/**
 * @program: spring01
 * @description:
 * @author: hgdd
 * @create: 2021-04-05 10:09
 */
@Configuration
@ComponentScan(basePackages = {"huwei","mini"})
public class AppConfig {
    @Bean
    public Random r(){
        return new Random();
    }

}
