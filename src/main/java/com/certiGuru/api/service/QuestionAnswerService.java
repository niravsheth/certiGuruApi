package com.certiGuru.api.service;

import com.certiGuru.api.model.QuestionAnswerList;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

import static com.certiGuru.api.Constants.SELECT_QUERY_FOR_GETTING_ALL_QUESTIONS;

public interface QuestionAnswerService {

    public List<QuestionAnswerList> getAllQuestions();
    public List<QuestionAnswerList> getAllQuestionAnswerListWithOptions();
}
