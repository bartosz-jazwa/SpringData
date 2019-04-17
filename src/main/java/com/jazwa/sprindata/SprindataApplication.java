package com.jazwa.sprindata;

import com.jazwa.sprindata.Ksiazki.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

@SpringBootApplication
public class SprindataApplication implements CommandLineRunner {

    @Autowired
    ProductRepository productRepository;

    @Autowired
    KsiazkaRepository ksiazkaRepository;

    @Autowired
    RecenzentRepository recenzentRepository;

    public static void main(String[] args) {
        SpringApplication.run(SprindataApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        /*Product product = new Product();
        product.setNazwa("snickers");
        product.setOpis("czekoladowy");

        productRepository.save(product);

        Optional<Product> optionalProduct = productRepository.findByNazwa("snickers");

        List<Product > products = productRepository.fetchAllByName("snickers");*/

        Autor henrykSienkiewicz = new Autor();
        henrykSienkiewicz.setImie("Henryk");
        henrykSienkiewicz.setNazwisko("Sienkiewicz");

        Recenzent recenzent1 = new Recenzent();
        recenzent1.setImie("Jan");
        recenzent1.setNazwisko("Kowalski");

        Recenzent recenzent2 = new Recenzent();
        recenzent2.setImie("Adam");
        recenzent2.setNazwisko("Nowak");

        Recenzent recenzent3 = new Recenzent();
        recenzent3.setImie("Bartek");
        recenzent3.setNazwisko("Jazwa");

        Set<Recenzent> recenzentSet = new HashSet<>();
        recenzentSet.add(recenzent1);
        recenzentSet.add(recenzent2);
        recenzentSet.add(recenzent3);

        Ksiazka potop = new Ksiazka();
        potop.setAutor(henrykSienkiewicz);
        potop.setRecenzenci(recenzentSet);
        potop.setTytul("Potop");

        ksiazkaRepository.save(potop);


        Pageable pageable1 = PageRequest.of(0,2, Sort.by("nazwisko"));
        Pageable pageable2 = PageRequest.of(1,2);
        List<Recenzent> page1 = recenzentRepository.findAllByKsiazki(potop,pageable1.first());
        List<Recenzent> page2 = recenzentRepository.findAllByKsiazki(potop,pageable1.next());

    }
}
