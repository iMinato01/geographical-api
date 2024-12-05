package gg.Models;

import jakarta.persistence.*;

import java.util.*;

@Entity
@Table(name = "municipality")
public class Municipality {
    @Id
    @Column(name = "municipality_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "municipality_name")
    private String name;

    @OneToMany(mappedBy = "municipality", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<Locality> localities = new LinkedHashSet<>();

    @ManyToOne
    @JoinColumn(name = "state_id", nullable = false)
    private State state;

    public Municipality() {

    }
}
