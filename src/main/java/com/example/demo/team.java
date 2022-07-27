package com.example.demo;

import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class team {
    @Id
    @Column(name = "id", nullable = false)
    private String id;
    private int score;
}
