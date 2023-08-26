package com.certiGuru.api.service.repositoryImpl;

import com.certiGuru.api.service.OptionService;
import com.certiGuru.api.service.QuestionAnswerService;
import com.certiGuru.api.model.Options;
import com.certiGuru.api.model.QuestionAnswerList;
import com.certiGuru.api.repository.OptionsRepository;
import com.certiGuru.api.repository.QuestionAnswerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class QuestionAnswerServiceImpl implements QuestionAnswerService, OptionService {

    private QuestionAnswerRepository questionAnswerRepository;

    private OptionsRepository optionsRepository;

    public QuestionAnswerServiceImpl (QuestionAnswerRepository questionAnswerRepository,OptionsRepository optionsRepository) {
        super();
        this.questionAnswerRepository = questionAnswerRepository;
        this.optionsRepository = optionsRepository;
    }

    @Override
    public List<QuestionAnswerList> getAllQuestions(){
        List<QuestionAnswerList> questionAnswerList = questionAnswerRepository.getAllQuestions();
        if(questionAnswerList.size()>0){
            return questionAnswerList;
        }
        else {
            return new ArrayList<>();
        }
    }


    @Override
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
