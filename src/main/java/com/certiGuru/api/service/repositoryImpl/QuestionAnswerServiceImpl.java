package com.certiGuru.api.service.repositoryImpl;

import com.certiGuru.api.service.OptionService;
import com.certiGuru.api.service.QuestionAnswerService;
import com.certiGuru.api.model.Options;
import com.certiGuru.api.model.QuestionAnswerTable;
import com.certiGuru.api.repository.OptionsRepository;
import com.certiGuru.api.repository.QuestionAnswerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class QuestionAnswerServiceImpl implements QuestionAnswerService {

    private QuestionAnswerRepository questionAnswerRepository;

    private OptionsRepository optionsRepository;

    public QuestionAnswerServiceImpl (QuestionAnswerRepository questionAnswerRepository,OptionsRepository optionsRepository) {
        super();
        this.questionAnswerRepository = questionAnswerRepository;
        this.optionsRepository = optionsRepository;

    }

    @Override
    public List<QuestionAnswerTable> getAllQuestions(){
        List<QuestionAnswerTable> questionAnswerTable = questionAnswerRepository.getAllQuestions();
        if(questionAnswerTable.size()>0){
            return questionAnswerTable;
        }
        else {
            return new ArrayList<>();
        }
    }


    @Override
    public List<QuestionAnswerTable> getAllQuestionAnswerListWithOptions() {
        List<QuestionAnswerTable> result = getAllQuestions();

        //List<Options> optionsListForEachQuestionAnswerId;
        result.forEach(QuestionAnswerList->{
            QuestionAnswerTable obj = new QuestionAnswerTable();
            obj.setOptions(optionsRepository.getAllOptionsForGivenQuestionId(QuestionAnswerList.getQuestion_answer_Id()));
        });
        return result;
        //return null;
    }

}
