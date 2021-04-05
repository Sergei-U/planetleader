package hh.com.planetleader.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

/**
 *
 */
@Entity
@Data
@Table(name = "LEADER")
public class Leader {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private long id;

    @Column(name = "NAME")
    private String name;

    @Column(name = "LAST_NAME")
    private String lastName;

    @Column(name = "AGE")
    private int leaderAge;


    @OneToMany(mappedBy = "id")
    private List<Planet> planetList;


}
