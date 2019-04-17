package com.jazwa.sprindata.Ksiazki;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Ksiazka {
    @Id
    @GeneratedValue
    private Long id;
    private String tytul;
    @ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    private Autor autor;
    @ManyToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    /*@JoinTable(name = "ksiazki_recenzenci",
                joinColumns = {@JoinColumn(name = "ksiazka")},
                inverseJoinColumns = {@JoinColumn(name = "recenzent")})*/
    private Set<Recenzent> recenzenci;

    public Ksiazka(String tytul, Autor autor) {
        this.tytul = tytul;
        this.autor = autor;
    }

    public Ksiazka() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTytul() {
        return tytul;
    }

    public void setTytul(String tytul) {
        this.tytul = tytul;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public Set<Recenzent> getRecenzenci() {
        return recenzenci;
    }

    public void setRecenzenci(Set<Recenzent> recenzenci) {
        this.recenzenci = recenzenci;
    }
}
