package gg.model;

import jakarta.persistence.*;

@Entity
@Table(name = "localities")
public class Locality {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private String populationType;
    private String settlemenType;
    private String postalCode;
    @ManyToOne
    @JoinColumn(name = "municipalities_id", nullable = false)
    private Municipality municipalities;
    public Locality(){

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

    public String getPopulationType() {
        return populationType;
    }

    public void setPopulationType(String populationType) {
        this.populationType = populationType;
    }

    public String getSettlemenType() {
        return settlemenType;
    }

    public void setSettlemenType(String settlemenType) {
        this.settlemenType = settlemenType;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public Municipality getMunicipality() {
        return municipalities;
    }

    public void setMunicipality(Municipality municipalities) {
        this.municipalities = municipalities;
    }
}
