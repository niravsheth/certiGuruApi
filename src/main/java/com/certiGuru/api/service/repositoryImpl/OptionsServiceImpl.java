package com.certiGuru.api.service.repositoryImpl;

import com.certiGuru.api.service.OptionService;
import com.certiGuru.api.model.Options;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OptionsServiceImpl implements OptionService {

    private OptionService optionService;
    public OptionsServiceImpl(OptionService optionService) {
        super();
        this.optionService = optionService;
    }


    public List<Options> getAllOptionsForGivenQuestionId(Long questionId) {
        List<Options> optionsByQuestionAnswerId = optionService.getAllOptionsForGivenQuestionId(questionId);
        return optionsByQuestionAnswerId;
    }


}
