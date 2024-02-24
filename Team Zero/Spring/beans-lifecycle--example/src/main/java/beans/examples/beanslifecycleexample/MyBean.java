package beans.examples.beanslifecycleexample;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class MyBean implements InitializingBean, DisposableBean {

    public MyBean() {
        System.out.println("Constructor called");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("InitializingBean's afterPropertiesSet method called");
    }

    public void init() {
        System.out.println("Custom init method called");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("DisposableBean's destroy method called");
    }

    public void customDestroy() {
        System.out.println("Custom destroy method called");
    }
}

