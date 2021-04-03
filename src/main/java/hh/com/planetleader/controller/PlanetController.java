package hh.com.planetleader.controller;

import hh.com.planetleader.entity.Planet;
import hh.com.planetleader.service.PlanetService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 */
@RestController
@RequestMapping(value = "/planet")
@RequiredArgsConstructor
public class PlanetController {


    private final PlanetService planetService;


    @RequestMapping(value = "/addplanet", method = RequestMethod.POST)
    public void addPlanet(@RequestBody Planet planet) {this.planetService.addPlanet(planet);}
    @RequestMapping(value = "deleteplanet", method = RequestMethod.POST)
    public void deletePlanet(@RequestBody Planet planet) {this.planetService.deletePlanet(planet);}
    @RequestMapping(value = "editlanet", method = RequestMethod.POST)
    public void editPlanet(@RequestBody Planet planet) {this.planetService.editPlanet(planet);}

}
