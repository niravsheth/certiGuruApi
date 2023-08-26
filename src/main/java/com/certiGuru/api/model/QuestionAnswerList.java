package com.certiGuru.api.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.Getter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="questionAnswerTable")
public class QuestionAnswerList {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long questionAnswerId;

    @Column(name="question")
    private String question;

    @Column(name="type")
    private  String type;

    @Column(name="tag")
    private String tag;

    @Column(name="description")
    private String description;

    @Column(name="references")
    private String references;

    @OneToMany(targetEntity = Options.class,cascade=CascadeType.ALL)
    @JoinColumn(name="questionOptions_fk",referencedColumnName = "questionAnswerId")
    private List<Options> options;

}
