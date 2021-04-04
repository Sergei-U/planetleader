package hh.com.planetleader;

import hh.com.planetleader.entity.Leader;
import hh.com.planetleader.entity.Planet;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import java.util.Date;
import java.util.List;

@SpringBootApplication
public class PlanetleaderApplication {

    public static void main(String[] args) {

        SpringApplication.run(PlanetleaderApplication.class, args);


    }
}
