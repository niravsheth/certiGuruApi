package com.certiGuru.api;

public class Constants {
    public static final String SELECT_QUERY_FOR_GETTING_ALL_QUESTIONS = "SELECT * FROM questionAnswerTable";
    public static final String SELECT_QUERY_FOR_GETTING_ALL_OPTIONS_FOR_GIVEN_QUESTION_ID = " SELECT * FROM options where questionAnswerId =: q";
}
