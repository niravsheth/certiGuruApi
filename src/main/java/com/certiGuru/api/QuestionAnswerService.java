package com.certiGuru.api;

import com.certiGuru.api.model.QuestionAnswerList;

import java.util.List;

public interface QuestionAnswerService {
    public List<QuestionAnswerList> getAllQuestions();
    public List<QuestionAnswerList> getAllQuestionAnswerListWithOptions();
}
