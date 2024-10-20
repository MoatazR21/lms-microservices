package com.lms.quizAssignmentService.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Option extends BaseEntity {

    @Column(name = "option_text")
    private String optionText;

    @ManyToMany(mappedBy = "options")
    private List<Question> questions;
}
