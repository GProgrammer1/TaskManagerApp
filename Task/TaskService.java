package com.TaskManager.TaskManager.Task;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class TaskService {
    @Autowired
    private TaskRep taskRepository;



    public List<Task> getTasks() {
        return taskRepository.findAll();
    }

    public void addTask(Task t) {
        taskRepository.save(t);
    } //INSERT INTO tasks () Values()

    public void deleteTask(Long ID) {
        taskRepository.deleteById(ID);
    } //DELETE FROM tasks WHERE ID = ID

    public Task findTask(Long ID) { //SELECT *  FROM tasks WHERE ID = ID
        return taskRepository.findById(ID).get();

    }



    public List<Task> getTasksByExecutor(Long ExecID) { //SELECT * FROM Tasks WHERE execID =
        List<Task> tasks = this.getTasks();

        return tasks.stream()
                .filter(task -> task.getExecutorID().equals(ExecID))
                .collect(Collectors.toList());


    }

    public Task updateTaskDesc( Long ID,
                               String desc) {
    Task t = taskRepository.findById(ID).get();
    t.setDescription(desc) ;
    taskRepository.save(t) ;
    return t ;

    }
    public Task updateTaskDeadline( Long ID,
                              String date) {
        Task t = taskRepository.findById(ID).get();
        t.setDeadline(LocalDateTime.parse(date));
        taskRepository.save(t) ;
        return t ;

    }
    public Task markTaskAsCompleted(Long ID) {
        Task t = taskRepository.findById(ID).get();
        t.setCompleted(true);
        taskRepository.save(t) ;
        return t ;

    }
    public Task updateTaskExecutor(Long ID, Long execID) {
        Task t = taskRepository.findById(ID).get() ;
        t.setExecutorID(execID);
        taskRepository.save(t) ;
        return t ;
    }

}

