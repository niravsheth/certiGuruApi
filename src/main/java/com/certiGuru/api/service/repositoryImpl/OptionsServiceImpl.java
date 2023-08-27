package com.certiGuru.api.service.repositoryImpl;

import com.certiGuru.api.model.QuestionAnswerTable;
import com.certiGuru.api.repository.OptionsRepository;
import com.certiGuru.api.service.OptionService;
import com.certiGuru.api.model.Options;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class OptionsServiceImpl implements OptionService {

    private OptionsRepository optionsRepository;
    public OptionsServiceImpl(OptionsRepository optionsRepository) {
        super();
        this.optionsRepository = optionsRepository;
    }


    public List<Options> getAllOptionsForGivenQuestionId(Long questionId) {
        List<Options> optionsByQuestionAnswerId = optionsRepository.getAllOptionsForGivenQuestionId(questionId);
        return optionsByQuestionAnswerId;
    }
    @Override
    public List<Options> getAllOptions(){
        List<Options> questionAnswerTable = optionsRepository.getAllOptions();
        if(questionAnswerTable.size()>0){
            return questionAnswerTable;
        }
        else {
            return new ArrayList<>();
        }
    }


}
