package com.jazwa.sprindata.Ksiazki;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface KsiazkaRepository extends JpaRepository<Ksiazka,Long> {
    Optional<Ksiazka> findByTytul(String tytul);
    Optional<Ksiazka> findByAutor_ImieAndAutor_Nazwisko (String imie, String nazwisko);

}
