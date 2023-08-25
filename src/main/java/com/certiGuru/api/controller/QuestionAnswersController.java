package com.certiGuru.api.controller;

import com.certiGuru.api.QuestionAnswerService;
import com.certiGuru.api.model.QuestionAnswerList;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class QuestionAnswersController {


    private QuestionAnswerService questionAnswerService;
    public QuestionAnswersController(QuestionAnswerService questionAnswerService){
        this.questionAnswerService = questionAnswerService;
    }

    @GetMapping("/allQuestionsAnswerListWithOptions")
    public List<QuestionAnswerList> getAllQuestionAnswersListWithOptions(){
      return questionAnswerService.getAllQuestionAnswerListWithOptions();
    }

}
