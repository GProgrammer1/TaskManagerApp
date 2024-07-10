package com.TaskManager.TaskManager.Executor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExecutorService {
    @Autowired
    private ExecutorRep executorRep ;

    public List<Executor> getExecutors() {
        return executorRep.findAll();
    }

    public Executor findExecutor(Long ID) {
        return executorRep.findById(ID).get() ;
    }

    public Executor addExecutor(Executor e) {
        executorRep.save(e) ;
        return e ;
    }

    public void deleteExecutor(Long ID) {
        executorRep.deleteById(ID);

    }
}
