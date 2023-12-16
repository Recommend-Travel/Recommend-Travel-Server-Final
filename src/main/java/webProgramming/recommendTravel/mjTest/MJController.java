package webProgramming.recommendTravel.mjTest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MJController {
    @GetMapping("/mjGet/{valval}")
    public String mjGet(@PathVariable String valval) {
        return "윰재 테스트 : " + valval;
    }
}
