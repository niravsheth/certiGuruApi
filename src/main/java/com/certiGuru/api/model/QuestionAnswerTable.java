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
@Table(name="question_answer_table")
public class QuestionAnswerTable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long question_answer_Id;

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
    @JoinColumn(name="questionOptions_fk",referencedColumnName = "question_answer_Id")
    private List<Options> options;

}
