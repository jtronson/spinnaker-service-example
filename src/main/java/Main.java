import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@RestController
@EnableAutoConfiguration
public class Main {

    @RequestMapping("/")
    String home() {
        return "Spinnaker Service Example";
    }

    @RequestMapping("/service/version")
    String version() {
        return "Version 1.0.0";
    }

    @RequestMapping("/service/heartbeat")
    String heartbeat() {
        return "alive";
    }

    @RequestMapping("/service/name")
    String name() {
        return "Spinnaker Service Example";
    }

    @RequestMapping("/service/foo")
    String foo() {
        return "bar";
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(Main.class, args);
    }

}
