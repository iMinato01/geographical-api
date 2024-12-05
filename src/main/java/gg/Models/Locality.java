package gg.Models;

import jakarta.persistence.*;

@Entity
@Table(name = "Locality")
public class Locality {
    @Id
    @Column (name = "locality_id")
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private long id;
    @Column (name = "locality_name")
    private String name;
    @Column (name = "population_type")
    private String populationType;
    @Column (name = "settlement_type")
    private String settlementype;
    @Column (name = "postal_code")
    private String postalCode;
    @ManyToOne
    @JoinColumn(name = "municipality_id", nullable = false)
    private Municipality municipality;
    public Locality(){

    }
}
