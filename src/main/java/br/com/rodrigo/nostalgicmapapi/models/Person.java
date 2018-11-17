package br.com.rodrigo.nostalgicmapapi.models;

import br.com.rodrigo.nostalgicmapapi.models.commons.BaseEntity;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

@Entity
public class Person extends BaseEntity implements Serializable {

    private static final long serialVersionUID = -1791658283559110391L;

    private String name;

    private LocalDate birth;

    @JoinColumn
    @OneToOne
    private Email email;

    @JoinColumn
    @OneToMany
    private List<Place> places;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirth() {
        return birth;
    }

    public void setBirth(LocalDate birth) {
        this.birth = birth;
    }

    public Email getEmail() {
        return email;
    }

    public void setEmail(Email email) {
        this.email = email;
    }

    public List<Place> getPlaces() {
        return places;
    }

    public void setPlaces(List<Place> places) {
        this.places = places;
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
        return "Person{" +
                "name='" + name + '\'' +
                ", birth=" + birth +
                ", email=" + email +
                ", places=" + places +
                '}';
    }
}
