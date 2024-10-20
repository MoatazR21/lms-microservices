package com.lms.quizAssignmentService.dto;

import lombok.Value;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;


@Value
public class AssessmentDto{
    Long id;
    String title;
    LocalDateTime createdAt;
    List<Long> submissionIds;
    List<QuestionDto> questions;


}