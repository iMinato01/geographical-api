package gg.Services;

import gg.Models.State;
import gg.Repositories.StateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class StateService {
    @Autowired
    private StateRepository stateRepository;

    public Collection<State> getStates(){
        return stateRepository.findAll();
    }
}
