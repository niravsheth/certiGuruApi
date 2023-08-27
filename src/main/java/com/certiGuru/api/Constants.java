package com.certiGuru.api;

public class Constants {
    public static final String SELECT_QUERY_FOR_GETTING_ALL_QUESTIONS = "SELECT * FROM question_answer_table";
    public static final String SELECT_QUERY_FOR_GETTING_ALL_OPTIONS = "SELECT * FROM options";
    public static final String SELECT_QUERY_FOR_GETTING_ALL_OPTIONS_FOR_GIVEN_QUESTION_ID = "SELECT * FROM options where question_options_fk =:q";
}
