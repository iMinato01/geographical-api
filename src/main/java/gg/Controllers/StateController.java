package gg.Controllers;

import gg.Models.State;
import gg.Services.StateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
public class StateController {
    @Autowired
    private StateService stateService;

    @GetMapping("/states")
    public Collection<State> getAllStates(){
        return stateService.getStates();
    }
}
