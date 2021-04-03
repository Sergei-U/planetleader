package hh.com.planetleader.entity;

import lombok.Data;


import javax.persistence.*;

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
    @Column(name = "LASTNAME")
    private String lastName;

    @Column(name = "LEADERAGE")
    private int leaderAge;

}
