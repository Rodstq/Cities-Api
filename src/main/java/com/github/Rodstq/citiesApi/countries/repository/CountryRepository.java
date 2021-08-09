package com.github.Rodstq.citiesApi.countries.repository;

import com.github.Rodstq.citiesApi.countries.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}

