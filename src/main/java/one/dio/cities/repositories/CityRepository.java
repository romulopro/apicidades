package one.dio.cities.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import one.dio.cities.entities.City;

public interface CityRepository extends JpaRepository<City, Long> {
    
}
