package Controllers;

import Objects.State;
import Services.StateService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
public class StateController {
    @GetMapping("/states")
    public Collection<State> getAllStates(){
        return new StateService().getStates();
    }
}
