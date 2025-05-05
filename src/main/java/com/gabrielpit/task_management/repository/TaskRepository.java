package com.gabrielpit.task_management.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import com.gabrielpit.task_management.model.Task;
public interface TaskRepository extends JpaRepository<Task, Long> {
    
}
