package com.certiGuru.api;

import com.certiGuru.api.model.Options;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface OptionService {
    public List<Options> getAllOptionsForGivenQuestionId(Long questionAnswerListId);

}
