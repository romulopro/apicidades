package one.dio.states.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import one.dio.states.entities.State;

public interface StateRepository extends JpaRepository<State, Long> {
    
}
