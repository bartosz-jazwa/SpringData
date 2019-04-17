package com.jazwa.sprindata;

import javax.persistence.Id;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

@Entity
public class Product {
    @Id
    @GeneratedValue
    private Long id;

    private String nazwa;
    private String opis;

    public Product(String nazwa, String opis) {
        this.nazwa = nazwa;
        this.opis = opis;
    }

    public Product() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public String getOpis() {
        return opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }
}
