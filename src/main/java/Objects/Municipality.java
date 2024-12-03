package Objects;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Municipality {
    private long id;
    private String name;
    private Map<String, Locality> localities = new HashMap<>();
    public Municipality(){

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

    public Collection<Locality> getLocalities(){
        return Collections.unmodifiableCollection(localities.values());
    }

    public void addLocality(Locality locality){
        localities.put(locality.getName(), locality);
    }
}
