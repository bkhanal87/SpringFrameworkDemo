package IOC;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mobile {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");

        // Get the bean
        Sim sim = applicationContext.getBean(Tmobile.class);

        // calling the methods
        sim.data();
        sim.calling();
    }
}
