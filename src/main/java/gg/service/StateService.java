package gg.service;

import gg.model.State;
import gg.repository.StateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Optional;

@Service
public class StateService {
    @Autowired
    private StateRepository stateRepository;

    public List<State> getAllStates(){
        return stateRepository.findAll();
    }

    public State addState(@RequestParam State state){
        return stateRepository.save(state);
    }

    public Optional<State> getStateById(@RequestParam long id){
        return stateRepository.findById(id);
    }

    public Optional<State> getStateByName(@RequestParam String name) {
        return stateRepository.findOneByName(name);
    }
}
