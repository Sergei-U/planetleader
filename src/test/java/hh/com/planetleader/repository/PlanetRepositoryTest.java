package hh.com.planetleader.repository;

import hh.com.planetleader.entity.Planet;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

/**
 *
 */
@DataJpaTest
class PlanetRepositoryTest {

    @Autowired
    public PlanetRepository planetRepository;

    @Test
    public void testPlanetReposFound() {
        final Planet planet = new Planet();
        planet.setId(123L);
        planetRepository.save(planet);
        Optional<Planet> planetByID =planetRepository.findById(123L);
        assertTrue(planetByID.isPresent());
        assertEquals(123L, planetByID.get().getId());
    }

    @Test
    public void testPlanetReposNOTFound() {
        final Planet planet = new Planet();
        planet.setId(123L);
        planetRepository.save(planet);
        Optional<Planet> planetByID =planetRepository.findById(1234L);
        assertFalse(planetByID.isPresent());
    }

}