package com.club.fotbal.model;
import lombok.*;

@ToString
@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor

public class Club {

    private String name;
    private int players;
    private int league;

}
