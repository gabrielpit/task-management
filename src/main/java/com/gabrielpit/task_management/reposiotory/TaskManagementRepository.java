package com.gabrielpit.task_management.reposiotory;


import org.springframework.data.jpa.repository.JpaRepository;
import com.gabrielpit.task_management.model.Task;
public interface TaskManagementRepository extends JpaRepository<Task, Long> {
    
}
