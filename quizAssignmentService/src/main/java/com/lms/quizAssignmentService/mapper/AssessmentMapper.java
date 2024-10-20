package com.lms.quizAssignmentService.mapper;

import com.lms.quizAssignmentService.dto.AssessmentDto;
import com.lms.quizAssignmentService.model.Assessment;
import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface AssessmentMapper {
    Assessment toEntity(AssessmentDto assessmentDto);

    AssessmentDto toDto(Assessment assessment);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Assessment partialUpdate(AssessmentDto assessmentDto, @MappingTarget Assessment assessment);
}