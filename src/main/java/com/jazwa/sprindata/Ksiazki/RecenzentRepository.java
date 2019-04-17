package com.jazwa.sprindata.Ksiazki;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RecenzentRepository extends JpaRepository<Recenzent,Ksiazka> {
    List<Recenzent> findAllByKsiazki (Ksiazka ksiazka, Pageable pageable);
}
