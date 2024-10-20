package com.lms.quizAssignmentService.mapper;

import com.lms.quizAssignmentService.dto.SubmissionDto;
import com.lms.quizAssignmentService.model.Submission;
import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface SubmissionMapper {
    Submission toEntity(SubmissionDto submissionDto);

    SubmissionDto toDto(Submission submission);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Submission partialUpdate(SubmissionDto submissionDto, @MappingTarget Submission submission);
}