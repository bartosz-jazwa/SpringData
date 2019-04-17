package com.jazwa.sprindata.Ksiazki;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Autor {
    @Id
    @GeneratedValue
    private Long id;
    private String imie;
    private String nazwisko;
    @OneToMany(mappedBy = "autor",fetch = FetchType.EAGER,cascade = CascadeType.ALL)
    private Set<Ksiazka> ksiazki;

    public Autor(String imie, String nazwisko, Set<Ksiazka> ksiazki) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.ksiazki = ksiazki;
    }

    public Autor() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public Set<Ksiazka> getKsiazki() {
        return ksiazki;
    }

    public void setKsiazki(Set<Ksiazka> ksiazki) {
        this.ksiazki = ksiazki;
    }
}
