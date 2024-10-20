package com.lms.quizAssignmentService.model;

import com.lms.quizAssignmentService.model.enums.QuestionType;
import jakarta.persistence.*;
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
public class Question extends BaseEntity {

    @Column(name = "question_type")
    private String questionText;

    @Column(name = "question_type")
    private QuestionType questionType;
    private String solution;

    @ManyToMany(mappedBy = "questions")
    private List<Assessment> assessments;

    @ManyToMany
    @JoinTable(
            name = "question_option",
            joinColumns = @JoinColumn(name ="question_id"),
            inverseJoinColumns = @JoinColumn(name = "option_id")
    )
    private List<Option> options;


}
