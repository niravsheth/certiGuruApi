package com.certiGuru.api.controller;

import com.certiGuru.api.repository.OptionsRepository;
import com.certiGuru.api.repository.QuestionAnswerRepository;
import com.certiGuru.api.model.QuestionAnswerList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class QuestionAnswersController {
    @Autowired
    private OptionsRepository optionsRepository;
    @Autowired
    private QuestionAnswerRepository questionAnswerRepository;

    @GetMapping("/allQuestionsAnswerListWithOptions")
    public List<QuestionAnswerList> getAllQuestionAnswersListWithOptions(){
      return questionAnswerRepository.getAllQuestionAnswerListWithOptions();
    }

}
