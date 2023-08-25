package com.certiGuru.api.repositoryImpl;

import com.certiGuru.api.OptionService;
import com.certiGuru.api.model.Options;
import com.certiGuru.api.repository.OptionsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

@Service
public class OptionsRepositoryImpl implements OptionService {
    @Autowired
    private OptionService optionService;



    public List<Options> getAllOptionsForGivenQuestionId(Long questionId) {
        List<Options> optionsByQuestionAnswerId = optionService.getAllOptionsForGivenQuestionId(questionId);
        return optionsByQuestionAnswerId;
    }


}
