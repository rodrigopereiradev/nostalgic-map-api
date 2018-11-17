package br.com.rodrigo.nostalgicmapapi.models;

import br.com.rodrigo.nostalgicmapapi.models.commons.BaseEntity;

import javax.persistence.Entity;
import java.io.Serializable;

@Entity
public class Email extends BaseEntity implements Serializable {

    private static final long serialVersionUID = 5961955723401414430L;

    private String address;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
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
        return "Email{" +
                "address='" + address + '\'' +
                '}';
    }
}
