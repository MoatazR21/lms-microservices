package com.lms.quizAssignmentService.repository;

import com.lms.quizAssignmentService.model.Submission;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SubmissionRepository extends JpaRepository<Submission, Long> {
}