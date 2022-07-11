package com.club.fotbal.model;
import lombok.*;

import javax.persistence.*;

@ToString
@Setter
@Getter
@Builder
@Entity
@Table(name = "t_player")
@AllArgsConstructor
@NoArgsConstructor

public class Player {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "namep")
    private String namep;

    @Column(name = "salary")
    private int salary;

    @Column(name = "pozition")
    private String pozition;

    @ManyToOne
    @JoinColumn(name = "id_club")
   private Club club;

}