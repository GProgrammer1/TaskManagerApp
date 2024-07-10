package com.TaskManager.TaskManager.Executor;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExecutorRep extends JpaRepository<Executor,Long> {
}
