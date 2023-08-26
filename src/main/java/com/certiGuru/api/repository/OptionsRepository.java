package com.certiGuru.api.repository;

import com.certiGuru.api.model.Options;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import javax.swing.text.html.Option;

import java.util.List;

import static com.certiGuru.api.Constants.SELECT_QUERY_FOR_GETTING_ALL_OPTIONS_FOR_GIVEN_QUESTION_ID;

public interface OptionsRepository extends JpaRepository<Options, Long> {


    @Query(value = "SELECT_QUERY_FOR_GETTING_ALL_OPTIONS_FOR_GIVEN_QUESTION_ID",nativeQuery = true)
    public List<Options> getAllOptionsForGivenQuestionId(@Param("q")Long questionAnswerListId);


}
