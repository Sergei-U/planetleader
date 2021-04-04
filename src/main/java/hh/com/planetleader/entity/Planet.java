package hh.com.planetleader.entity;


import lombok.Data;

import javax.persistence.*;
/**
 *
 */
@Entity
@Table(name = "PLANET")
@Data
public class Planet {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private long id;

    @Column(name = "PLANETNAME")
    private String planetName;

    @Column(name = "COMMANDLEADERNAME")
    private String commandLeaderName;
}
