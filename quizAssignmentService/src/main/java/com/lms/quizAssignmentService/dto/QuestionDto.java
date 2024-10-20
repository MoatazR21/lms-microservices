package com.lms.quizAssignmentService.dto;

import com.lms.quizAssignmentService.model.enums.QuestionType;
import lombok.Value;

import java.io.Serializable;
import java.util.List;


@Value
public class QuestionDto implements Serializable {
    Long id;
    String questionText;
    QuestionType questionType;
    String solution;
    List<Long> assessmentIds;
    List<Long> optionIds;
}