package com.certiGuru.api.repository;

import com.certiGuru.api.model.Options;
import com.certiGuru.api.model.QuestionAnswerTable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

import static com.certiGuru.api.Constants.SELECT_QUERY_FOR_GETTING_ALL_QUESTIONS;

public interface QuestionAnswerRepository extends JpaRepository<QuestionAnswerTable, Long>{

    @Query(value = SELECT_QUERY_FOR_GETTING_ALL_QUESTIONS,nativeQuery = true)
    public List<QuestionAnswerTable> getAllQuestions();
}
