package gg.model;

import jakarta.persistence.*;

import java.util.*;

@Entity
@Table(name = "states")
public class State {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private String capital;
    @OneToMany(mappedBy = "state")
    private Set<Municipality> municipalities = new LinkedHashSet<>();
    public State(){

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public Set<Municipality> getMunicipalities() {
        return municipalities;
    }

    public void setMunicipalities(Set<Municipality> municipalities) {
        this.municipalities = municipalities;
    }
}