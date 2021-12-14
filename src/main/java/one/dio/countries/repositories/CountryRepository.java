package one.dio.countries.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import one.dio.countries.entities.Country;

public interface CountryRepository extends JpaRepository<Country, Long> {
    
}
