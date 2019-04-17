package com.jazwa.sprindata;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ProductRepository extends JpaRepository<Product,Long> {
    Optional<Product> findByNazwa(String nazwa);

    @Query("select p from Product p where p.nazwa = :mojaNazwa")
    List<Product> fetchAllByName(@Param("mojaNazwa") String cokolwiek);
}
