package com.certiGuru.api.repositoryImpl;

import com.certiGuru.api.model.Options;
import com.certiGuru.api.model.QuestionAnswerList;
import com.certiGuru.api.repository.QuestionAnswerRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionAnswerRepositoryImpl implements QuestionAnswerRepository{
    private QuestionAnswerRepository questionAnswerRepository;

    public QuestionAnswerRepositoryImpl(QuestionAnswerRepository questionAnswerRepository) {
        this.questionAnswerRepository = questionAnswerRepository;
    }

    private OptionsRepositoryImpl optionsRepositoryImpl;

    public List<QuestionAnswerList> getAllQuestions(){
        List<QuestionAnswerList> questionAnswerListList = questionAnswerRepository.getAllQuestions();
        return questionAnswerListList;
    }


    @Override
    public List<QuestionAnswerList> getAllQuestionAnswerListWithOptions() {
        List<QuestionAnswerList> result = getAllQuestions();
        List<Options> optionsListForEachQuestionAnswerId;
        result.forEach(QuestionAnswerList->{
            QuestionAnswerList obj = new QuestionAnswerList();
            obj.setOptions(optionsRepositoryImpl.getAllOptionsForGivenQuestionId(QuestionAnswerList.getQuestionAnswerListId()));
        });
        return result;
    }
}
