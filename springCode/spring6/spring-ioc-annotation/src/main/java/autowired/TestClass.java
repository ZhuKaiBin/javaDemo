package autowired;

import autowired.Controller.UserController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.net.URL;
import java.net.URLClassLoader;

public class TestClass {
    public static void main(String[] args) {

        ApplicationContext cxt = new ClassPathXmlApplicationContext("bean.xml");
        UserController userController = cxt.getBean(UserController.class);
        userController.Add();
    }
}
