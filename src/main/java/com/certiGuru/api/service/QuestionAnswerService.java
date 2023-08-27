package com.certiGuru.api.service;

import com.certiGuru.api.model.QuestionAnswerTable;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

import static com.certiGuru.api.Constants.SELECT_QUERY_FOR_GETTING_ALL_QUESTIONS;

public interface QuestionAnswerService {

    public List<QuestionAnswerTable> getAllQuestions();
    public List<QuestionAnswerTable> getAllQuestionAnswerListWithOptions();
}
