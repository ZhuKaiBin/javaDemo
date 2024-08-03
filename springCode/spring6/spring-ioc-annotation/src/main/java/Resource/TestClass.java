package Resource;

import Config.SpringConfig;
import Resource.Controller.UserController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestClass {
    public static void main(String[] args) {

//        ApplicationContext cxt = new ClassPathXmlApplicationContext("bean.xml");
//        UserController userController = cxt.getBean(UserController.class);
//        userController.Add();


        ApplicationContext cxt = new AnnotationConfigApplicationContext(SpringConfig.class);
        UserController userController = cxt.getBean(UserController.class);
        userController.Add();
    }
}
