package hello;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {
    
    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }

    @ResquestMapping(value = "DevOps", method = RequestMethod.GET)
    @ResponseBody
    public String getDevOpsGreetings() {
        return "Hola Ingeniero DevOps";
    }
}
