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
}