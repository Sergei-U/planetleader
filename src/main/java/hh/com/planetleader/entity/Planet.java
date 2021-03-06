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

    @Column(name = "PLANET_NAME")
    private String planetName;

    @Column(name = "LEADER_ID")
    @JoinColumn(name = "LEADER_ID")
    @OneToOne(targetEntity = Leader.class)
    private Leader leader;
}
