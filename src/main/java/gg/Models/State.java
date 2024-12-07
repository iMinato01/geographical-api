package gg.Models;

import jakarta.persistence.*;

import java.util.*;

@Entity
@Table(name = "state")
public class State {
    @Id
    @Column(name = "state_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "state_name")
    private String name;
    @Column(name = "state_capital")
    private String capital;
    @OneToMany(mappedBy = "state", cascade = CascadeType.ALL, orphanRemoval = true)
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