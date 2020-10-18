package hr.bj2020.bendovidemo.model;


import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor

public class Bend {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String naziv;

    public Bend(String naziv) {
        this.naziv = naziv;
    }


    /*
    public Bend (int id, String naziv) {
        this.id = id;
        this.naziv = naziv;
    }

    public Bend() {

    }

    public Bend(String naziv) {
        this.naziv = naziv;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    @Override
    public String toString() {
        return "Bend{" +
                "id=" + id +
                ", naziv='" + naziv + '\'' +
                '}';
    }
     */
}
