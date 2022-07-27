package com.example.demo;

import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Team {
    @Id
    @Column(name = "id", nullable = false)
    private String id;
    private int score;
}
