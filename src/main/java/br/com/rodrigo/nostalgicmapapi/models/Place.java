package br.com.rodrigo.nostalgicmapapi.models;

import br.com.rodrigo.nostalgicmapapi.models.commons.BaseEntity;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import java.io.Serializable;

@Entity
public class Place extends BaseEntity implements Serializable {

    private static final long serialVersionUID = 3076237273779565428L;

    private String title;

    private String description;

    private String userHistory;

    @JoinColumn
    @OneToOne
    private Location location;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUserHistory() {
        return userHistory;
    }

    public void setUserHistory(String userHistory) {
        this.userHistory = userHistory;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
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
        return "Place{" +
                "title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", userHistory='" + userHistory + '\'' +
                ", location=" + location +
                '}';
    }
}
