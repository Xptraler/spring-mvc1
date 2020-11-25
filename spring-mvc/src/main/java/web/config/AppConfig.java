package web.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import service.CarService;

@Configuration
@ComponentScan("java")
public class AppConfig {
    @Bean
    public CarService carService() {
        return new CarService();
    }
}
