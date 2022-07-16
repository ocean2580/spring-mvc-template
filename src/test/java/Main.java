import config.BeanConfig;
import config.BeanConfigA;
import entity.A;
import entity.B;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import service.AService;
import service.BService;

public class Main {

    public static void main(String[] args) {
        type();
        id();
    }

    public static void type() {
        ApplicationContext context =
                new AnnotationConfigApplicationContext(BeanConfig.class);

        AService aService = context.getBean(AService.class);
        BService bService = context.getBean(BService.class);

        aService.aService();
        bService.bService();
    }

    public static void id() {
        ApplicationContext context =
                new AnnotationConfigApplicationContext(BeanConfigA.class);

        System.out.println(context.getBean("a"));
        System.out.println(context.getBean("b"));

        AService aService = (AService) context.getBean("aService");
        BService bService = (BService) context.getBean("bService");

        aService.aService();
        bService.bService();
    }

}
