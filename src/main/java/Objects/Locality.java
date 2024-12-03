package Objects;

public class Locality {
    private long id;
    private String name;
    private String populationType;
    private String settlementype;
    private String postalCode;
    public Locality(){

    }

    public long getId() {
        return id;
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

    public String getSettlementype() {
        return settlementype;
    }

    public void setSettlementype(String settlementype) {
        this.settlementype = settlementype;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }
}
