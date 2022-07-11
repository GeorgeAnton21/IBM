package com.club.fotbal.model;
import lombok.*;

import javax.persistence.*;
import java.util.List;

@ToString
@Setter
@Getter
@Builder
@Entity
@Table(name = "t_club")
@AllArgsConstructor
@NoArgsConstructor

public class Club {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;


    @Column(name = "name")
    private String name;

    @Column(name = "players")
    private int players;

    @Column(name = "league")
    private int league;

    @OneToMany(mappedBy = "club", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Player> playerList;

}
