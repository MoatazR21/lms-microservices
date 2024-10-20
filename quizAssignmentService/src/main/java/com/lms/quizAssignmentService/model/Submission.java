package com.lms.quizAssignmentService.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Submission extends BaseEntity {

    @Column(name = "submitted_at")
    private LocalDateTime submittedAt;
    private int score;

    @ManyToOne
    @JoinColumn(name = "assessment_id")
    private Assessment assessment;

}
