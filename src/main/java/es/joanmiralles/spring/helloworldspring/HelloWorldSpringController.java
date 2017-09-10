package es.joanmiralles.spring.helloworldspring;

import es.joanmiralles.spring.helloworldspring.bean.Greeting;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloWorldSpringController {

    @RequestMapping("/")
    public String welcome() {
        return "Welcome to RestTemplate Example.";
    }

    @RequestMapping("/hello/{name}")
    public Greeting message(@PathVariable String name) {
        Greeting msg = new Greeting(name, "Hello " + name);
        return msg;
    }
}
