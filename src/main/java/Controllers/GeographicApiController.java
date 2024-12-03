package Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
public class GeographicApiController {
    @GetMapping()
    public String status(){
        return "OK";
    }
}
