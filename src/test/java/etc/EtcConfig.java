package etc;

import etc.aspect.Aspect;
import etc.aspect.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("etc")
@EnableAspectJAutoProxy
public class EtcConfig {
}


class test {
    public static void main(String[] args) {
        ApplicationContext context =
                new AnnotationConfigApplicationContext(EtcConfig.class);
        User user = context.getBean(User.class);
        user.pointDemo();
    }
}
