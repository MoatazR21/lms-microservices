package com.lms.courseManagementService.repository;

import com.lms.courseManagementService.model.Module;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ModulesRepository extends JpaRepository<Module, Long> {

    List<Module> findByCourseTitle(String courseTitle);


}