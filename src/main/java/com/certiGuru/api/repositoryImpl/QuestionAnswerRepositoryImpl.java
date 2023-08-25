package com.certiGuru.api.repositoryImpl;

import com.certiGuru.api.OptionService;
import com.certiGuru.api.QuestionAnswerService;
import com.certiGuru.api.model.Options;
import com.certiGuru.api.model.QuestionAnswerList;
import com.certiGuru.api.repository.OptionsRepository;
import com.certiGuru.api.repository.QuestionAnswerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class QuestionAnswerRepositoryImpl implements QuestionAnswerService, OptionService {

    private QuestionAnswerRepository questionAnswerRepository;

    public QuestionAnswerRepositoryImpl (QuestionAnswerRepository questionAnswerRepository) {
        this.questionAnswerRepository = questionAnswerRepository;
    }

    @Autowired
    private OptionsRepository optionsRepository;

    public List<QuestionAnswerList> getAllQuestions(){
        List<QuestionAnswerList> questionAnswerList= questionAnswerRepository.getAllQuestions();
        if(questionAnswerList.size()>0){
            return questionAnswerList;
        }
        else {
            return new ArrayList<>();
        }
    }



    public List<QuestionAnswerList> getAllQuestionAnswerListWithOptions() {
        List<QuestionAnswerList> result = getAllQuestions();
        List<Options> optionsListForEachQuestionAnswerId;
        result.forEach(QuestionAnswerList->{
            QuestionAnswerList obj = new QuestionAnswerList();
            obj.setOptions(optionsRepository.getAllOptionsForGivenQuestionId(QuestionAnswerList.getQuestionAnswerListId()));
        });
        return result;
    }

    @Override
    public List<Options> getAllOptionsForGivenQuestionId(Long questionAnswerListId) {
        return null;
    }
}
