package Objects;

import jakarta.persistence.*;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
@Entity
@Table(name = "states")
public class State {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "name")
    private String name;
    @Column(name = "capital")
    private String capital;
    @OneToMany(mappedBy = "state")
    @MapKey(name = "name")
    private Map<String, Municipality> municipalities = new HashMap<>();
    public State(){
    }
    public long getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getCapital(){
        return capital;
    }

    public void setCapital(String capital){
        this.capital = capital;
    }

    public Collection<Municipality> getMunicipalities(){
        return Collections.unmodifiableCollection(municipalities.values());
    }

    public void addMunicipality(Municipality municipality){
        municipalities.put(municipality.getName(), municipality);
    }
}