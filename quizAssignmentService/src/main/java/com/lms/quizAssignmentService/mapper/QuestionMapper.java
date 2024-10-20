package com.lms.quizAssignmentService.mapper;

import com.lms.quizAssignmentService.dto.QuestionDto;
import com.lms.quizAssignmentService.model.Question;
import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface QuestionMapper {
    Question toEntity(QuestionDto questionDto);

    QuestionDto toDto(Question question);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Question partialUpdate(QuestionDto questionDto, @MappingTarget Question question);
}