package autowired.Controller;

import autowired.service.Userservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class UserController {

    @Autowired
    private Userservice userService;

    public void Add()
    {
        System.out.println("UserController。。。。。");
        userService.Add();
    }
}
