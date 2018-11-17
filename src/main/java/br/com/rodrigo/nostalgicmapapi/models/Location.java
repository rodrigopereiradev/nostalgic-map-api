package br.com.rodrigo.nostalgicmapapi.models;

import br.com.rodrigo.nostalgicmapapi.models.commons.BaseEntity;

import javax.persistence.Entity;
import java.io.Serializable;

@Entity
public class Location extends BaseEntity implements Serializable {

    private static final long serialVersionUID = 492128616636119096L;

    private Double lat;

    private Double lng;

    public Double getLat() {
        return lat;
    }

    public void setLat(Double lat) {
        this.lat = lat;
    }

    public Double getLng() {
        return lng;
    }

    public void setLng(Double lng) {
        this.lng = lng;
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString() {
        return "Location{" +
                "lat=" + lat +
                ", lng=" + lng +
                '}';
    }
}
