package gg.controller;

import gg.model.State;
import gg.service.StateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StateController {
    @Autowired
    private StateService stateService;

    @GetMapping("/api/states")
    public List<State> getAllStates(){
        return stateService.getStates();
    }

    @PostMapping("/api/state")
    public ResponseEntity<State> addState(@RequestBody State state){
        return stateService.addState(state);
    }

    @GetMapping("/api/state/{id}")
    public ResponseEntity<State> getState(@PathVariable long id){
        return stateService.getState(id);
    }
}
