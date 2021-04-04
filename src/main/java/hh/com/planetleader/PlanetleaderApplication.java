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

        SessionFactory sessionFactory = null;

        final StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
                .configure()
                .build();
        try {
            sessionFactory = new MetadataSources(registry).addAnnotatedClass(Leader.class).buildMetadata().buildSessionFactory();
        } catch (Exception e) {
            // The registry would be destroyed by the SessionFactory, but we had trouble building the SessionFactory
            // so destroy it manually.
            StandardServiceRegistryBuilder.destroy(registry);
        }

        Session session = sessionFactory.openSession();
        session.beginTransaction();

        session.save(new Leader("Our planet is add", new Leader()));
        session.getTransaction().commit();
        session.close();

        session = sessionFactory.openSession();
        session.beginTransaction();
        List result = session.createQuery("from Leader").list();
        for (Planet planet : (List<Planet>) result) {
            System.out.println("Event (" + planet.getPlanetName() + ") : " + planet.getCommandLeaderName());
        }
        session.getTransaction().commit();
        session.close();

        if (sessionFactory != null) {
            sessionFactory.close();
        }
    }
    }

}
