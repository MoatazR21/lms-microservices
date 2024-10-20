package com.lms.quizAssignmentService.dto;

import lombok.Value;

import java.io.Serializable;
import java.util.List;

/**
 * DTO for {@link com.lms.quizAssignmentService.model.Option}
 */
@Value
public class OptionDto implements Serializable {
    Long id;
    String optionText;
    List<Long> questionIds;
}