package com.TaskManager.TaskManager.Task;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Tasks")
public class TaskController {

        @Autowired
        private TaskService taskService ;

        @GetMapping
        public List<Task> getTasks () {
            return taskService.getTasks();
        }

        @PostMapping("/task")
        public void addTask(@RequestBody Task t){ taskService.addTask(t);}

        @DeleteMapping("/task")
        public void deleteTask(@RequestParam(name="ID") Long ID ) {taskService.deleteTask(ID) ;}

        @GetMapping("/task")
        public Task findTask(@RequestParam(name = "ID") Long ID) {return taskService.findTask(ID);}


        @GetMapping("/execID")
        public List<Task> getTasksByExecutor(@RequestParam("ExecID") Long ExecID) {
                return taskService.getTasksByExecutor(ExecID) ;
        }

        @PutMapping("/updateDesc")
        public Task updateTaskDesc(@RequestParam(name = "ID") Long ID,
                                   @RequestParam(name = "desc") String desc) {
                return taskService.updateTaskDesc(ID, desc) ;
        }

        @PutMapping("/updateDeadline")
        public Task updateTaskDeadline( @RequestParam(name="ID") Long ID,
                                        @RequestParam(name = "date") String date) {
                return taskService.updateTaskDeadline(ID,date);

        }

        @PutMapping("/markCompleted/{ID}")
        public Task markTaskAsCompleted(@PathVariable Long ID) {
                return taskService.markTaskAsCompleted(ID);

        }

        @PutMapping("/updateExecutor")
        public Task updateTaskExecutor(@RequestParam(name="ID") Long ID,
                                       @RequestParam(name="execID") Long execID) {
                return taskService.updateTaskExecutor(ID,execID) ;
        }
}
