package hello;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {
    
    @RequestMapping("/")
    public String index() {
<<<<<<< HEAD
        return "Hola Mundo - Springboot!";
=======
        return "Greetings from Spring Boot 2!";
>>>>>>> 3e8638b4c1f78207708e91cca514795c88d4ff8f
    }
}
