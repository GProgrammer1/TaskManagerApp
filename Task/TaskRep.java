package com.TaskManager.TaskManager.Task;


import com.TaskManager.TaskManager.Task.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRep extends JpaRepository<Task,Long> {
}
