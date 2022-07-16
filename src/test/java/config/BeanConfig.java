package config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScans(
        {@ComponentScan("entity"),
        @ComponentScan("service"),
        @ComponentScan("dao.impl")}
)
public class BeanConfig {

}
