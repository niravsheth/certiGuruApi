package com.certiGuru.api.controller;

import com.certiGuru.api.model.Options;
import com.certiGuru.api.service.OptionService;
import com.certiGuru.api.service.QuestionAnswerService;
import com.certiGuru.api.model.QuestionAnswerTable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class QuestionAnswersController {

    @Autowired
    private QuestionAnswerService questionAnswerService;

    @Autowired
    private OptionService optionService;


    @GetMapping("/allQuestionsAnswerListWithOptions")
    public List<QuestionAnswerTable> getAllQuestionAnswerListWithOptions(){
      return questionAnswerService.getAllQuestionAnswerListWithOptions();
      //return optionService.getAllOptions();
    }

}
