package hh.com.planetleader.repository;

import hh.com.planetleader.entity.Planet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 *
 */
@Repository
public interface PlanetRepository extends JpaRepository<Planet, Long> {

    @Override
    Optional<Planet> findById(Long aLong);
}
