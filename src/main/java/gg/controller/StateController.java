package gg.controller;

import gg.model.State;
import gg.service.StateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/state")
public class StateController {
    @Autowired
    private StateService stateService;

    @GetMapping("/all")
    public ResponseEntity<List<State>> getAllStates(){
        List<State> states = stateService.getAllStates();
        if(!states.isEmpty()){
            return ResponseEntity.ok().body(states);
        } else {
            return ResponseEntity.noContent().build();
        }
    }

    @PostMapping("/add")
    public ResponseEntity<State> addState(@RequestBody State state){
        State savedState = stateService.addState(state);
        if(savedState != null && savedState.getId() > 0){
            return ResponseEntity.ok().body(savedState);
        } else {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(savedState);
        }
    }

    @GetMapping("/id/{id}")
    public ResponseEntity<State> getState(@PathVariable long id){
        return stateService.getStateById(id).map(state -> ResponseEntity.ok().body(state))
                .orElseGet(() -> ResponseEntity.status(HttpStatus.NOT_FOUND).build());
    }

    @GetMapping("/name/{name}")
    public ResponseEntity<State> getState(@PathVariable String name){
        return stateService.getStateByName(name).map(state -> ResponseEntity.ok().body(state))
                .orElseGet(() -> ResponseEntity.status(HttpStatus.NOT_FOUND).build());
    }
}
