package com.lms.quizAssignmentService.dto;

import lombok.Value;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * DTO for {@link com.lms.quizAssignmentService.model.Submission}
 */
@Value
public class SubmissionDto implements Serializable {
    Long id;
    LocalDateTime submittedAt;
    int score;
    Long assessmentId;
}