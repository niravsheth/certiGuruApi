package com.certiGuru.api.service;

import com.certiGuru.api.model.Options;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface OptionService {
    public List<Options> getAllOptionsForGivenQuestionId(Long questionAnswerListId);
    public List<Options> getAllOptions();

}
