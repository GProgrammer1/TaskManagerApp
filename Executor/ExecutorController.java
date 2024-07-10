package com.TaskManager.TaskManager.Executor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Executors")
public class ExecutorController {
    @Autowired
    private ExecutorService executorService ;



    @GetMapping
    public List<Executor> getExecutors () {
        return executorService.getExecutors() ;
    }

    @GetMapping("/exec")
    public Executor findExecutor(@RequestParam(name="ID") Long ID) {
        return executorService.findExecutor(ID) ;
    }

    @PostMapping("/exec")
    public Executor addExecutor(@RequestBody Executor e) {
        return executorService.addExecutor(e) ;
    }

    @DeleteMapping("/exec")
    public void deleteExecutor(@RequestParam(name = "ID") Long ID) {
        executorService.deleteExecutor(ID) ;
    }

}
