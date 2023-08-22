package com.certiGuru.api.repository;

import com.certiGuru.api.model.Options;
import com.certiGuru.api.model.QuestionAnswerList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

import static com.certiGuru.api.Constants.SELECT_QUERY_FOR_GETTING_ALL_QUESTIONS;

public interface QuestionAnswerRepository{

    @Query(SELECT_QUERY_FOR_GETTING_ALL_QUESTIONS)
    public List<QuestionAnswerList> getAllQuestions();
    public List<QuestionAnswerList> getAllQuestionAnswerListWithOptions();
}
