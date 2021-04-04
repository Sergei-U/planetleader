package hh.com.planetleader.service;

import hh.com.planetleader.entity.Leader;
import hh.com.planetleader.entity.Planet;
import hh.com.planetleader.repository.LeaderRepository;
import hh.com.planetleader.repository.PlanetRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 *
 */
@Service
@RequiredArgsConstructor
public class PlanetService {


    private final PlanetRepository planetRepository;

    public void addPlanet(Planet planet) {
        this.planetRepository.save(planet);
    }

    public void deletePlanet(Planet planet) {
        this.planetRepository.delete(planet);
    }

    public void editPlanet(Planet planet) {
        this.planetRepository.save(planet);
    }
}
