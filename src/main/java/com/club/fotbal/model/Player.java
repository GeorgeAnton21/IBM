package com.club.fotbal.model;
import lombok.*;

@ToString
@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor

public class Player {

    private String namep;
    private int salary;
    private String team;
    private String pozition;

}