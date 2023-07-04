package IOC;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mobile {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");

        // Get the bean
        Atandt atandt = applicationContext.getBean(Atandt.class);
        Tmobile tmobile = (Tmobile) applicationContext.getBean("tmobile"); //typecasting by using ID and object type

        // calling the methods
        atandt.calling();
        atandt.data();
        tmobile.calling();
        tmobile.data();
    }
}
