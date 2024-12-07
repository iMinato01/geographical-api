package gg.Services;

import gg.Models.State;
import gg.Repositories.StateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Collection;
import java.util.List;

@Service
public class StateService {
    @Autowired
    private StateRepository stateRepository;

    public List<State> getStates(){
        return stateRepository.findAll();
    }

    public ResponseEntity<State> addState(@RequestBody State state){
        State savedState = stateRepository.save(state);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedState);
    }

    public ResponseEntity<State> getState(@RequestParam long id){
        State state = stateRepository.findById(id).orElse(null);
        return ResponseEntity.status(HttpStatus.ACCEPTED).body(state);
    }
}
