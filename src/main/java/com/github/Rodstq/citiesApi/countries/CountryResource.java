package com.github.Rodstq.citiesApi.countries;

import com.github.Rodstq.citiesApi.countries.Country;
import com.github.Rodstq.citiesApi.countries.repository.CountryRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;


@RestController
public class CountryResource {

    private final CountryRepository repository;

    public CountryResource(final CountryRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/countries")
    public Page<Country> cities(Pageable page) {
        return repository.findAll(page);
    }

     @GetMapping("/{id}")
    public Country getOne(@PathVariable Long id){
        Optional<Country> optional = repository.findById(id);
        return optional.get();
     }
}