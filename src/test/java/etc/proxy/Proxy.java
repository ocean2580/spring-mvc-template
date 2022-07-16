package etc.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

//  中间商
public class Proxy {
    public static void main(String[] args) {
        Class[] interfaces = {Dao.class};
        DaoImpl daoImpl = new DaoImpl();
        Dao dao =
                (Dao) java.lang.reflect.Proxy.newProxyInstance(Proxy.class.getClassLoader(), interfaces, new DaoProxy(daoImpl));
        dao.login();
    }
}

class DaoProxy implements InvocationHandler {

    private Object object;

    public DaoProxy(Object object) {
        this.object = object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
//        增强
        method.invoke(object,args);
        Thread.sleep(1000 * 2);
        System.out.println("success!");
        return null;
    }
}