package com.AprendendoSpring.course.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.AprendendoSpring.course.model.entities.Task;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {
}
