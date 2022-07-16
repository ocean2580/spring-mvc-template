package config;

import dao.impl.ADaoImpl;
import dao.impl.BDaoImpl;
import entity.A;
import entity.B;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import service.AService;
import service.BService;

@Configuration
public class BeanConfigA {
    @Bean
    public A a() {
        return new A();
    }

    @Bean
    public B b() {
        return new B();
    }

    @Bean
    public ADaoImpl aDao() {
        return new ADaoImpl();
    }

    @Bean
    public BDaoImpl bDao() {
        return new BDaoImpl();
    }

    @Bean
    public AService aService() {
        return new AService();
    }

    @Bean
    public BService bService() {
        return new BService();
    }
}
