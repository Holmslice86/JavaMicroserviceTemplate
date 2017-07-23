package microservice.membership;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private ApplicationContext applicationContext;


    @RequestMapping(method = RequestMethod.GET)
    public List<User> Get() {

        List<User> users = userRepository.getAll();
        return users;
    }

}



