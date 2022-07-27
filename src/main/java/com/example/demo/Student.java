package com.example.demo;

import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Student {
    @Id
    @Column(name = "id", nullable = false)
    private String id;
    private String name;
    private String er;
    private String userstory_1;
    private String userstory_2;
    private String userstory_3;
    private int score;
    private String team_id;
}
