package com.lms.quizAssignmentService.mapper;

import com.lms.quizAssignmentService.dto.OptionDto;
import com.lms.quizAssignmentService.model.Option;
import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface OptionMapper {
    Option toEntity(OptionDto optionDto);

    OptionDto toDto(Option option);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Option partialUpdate(OptionDto optionDto, @MappingTarget Option option);
}