package etc.aspect;

import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Component
public class User {

    public void pointDemo() {
        System.out.println("hello");
    }
}
