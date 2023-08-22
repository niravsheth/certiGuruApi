package com.certiGuru.api.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="options")
public class Options {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name="option1")
    private  String option1;

    @Column(name="option2")
    private  String option2;

    @Column(name="option3")
    private  String option3;

    @Column(name="option4")
    private  String option4;

    @Column(name="option5")
    private  String option5;

    @Column(name="option6")
    private  String option6;

    @Column(name="isCorrect")
    private boolean isCorrect;

}
