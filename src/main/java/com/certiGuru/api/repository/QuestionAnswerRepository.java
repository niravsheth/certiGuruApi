package com.certiGuru.api.repository;

import com.certiGuru.api.model.Options;
import com.certiGuru.api.model.QuestionAnswerList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

import static com.certiGuru.api.Constants.SELECT_QUERY_FOR_GETTING_ALL_QUESTIONS;

@Repository
public interface QuestionAnswerRepository extends JpaRepository<QuestionAnswerList,Long> {

    @Query(SELECT_QUERY_FOR_GETTING_ALL_QUESTIONS)
    public List<QuestionAnswerList> getAllQuestions();
    public List<QuestionAnswerList> getAllQuestionAnswerListWithOptions();
}
