package in.sachin.crudProject2.controller;

import in.sachin.crudProject2.entity.Task;
import java.util.*;
import in.sachin.crudProject2.service.TaskService;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.HttpStatus;


@RestController
public class TaskController {

    private final TaskService taskService;

    public TaskController(TaskService taskService){
        this.taskService=taskService;
    }

    @PostMapping("/CRUD/create/tasks")
    public ResponseEntity<Task> createTask(@RequestBody Task task){

        Task createdTask=taskService.createTask(task);

        return ResponseEntity.status(HttpStatus.CREATED).body(createdTask);
    }

    @GetMapping("/CRUD/getAllTasks")
    public ResponseEntity<List<Task>> getAllTask(){

        List<Task> tasks=taskService.getAllTasks();

        return ResponseEntity.ok(tasks);
    }

    @GetMapping("/CRUD/getBy/tasks/{id}")
    public ResponseEntity<Task> getById(@PathVariable Long id){
        Optional<Task> getbyTask=taskService.getTaskById(id);

        if(getbyTask.isPresent()){
            return ResponseEntity.ok(getbyTask.get());
        }

        return ResponseEntity.notFound().build();
    }

    @PutMapping("/CRUD/updateTask/task/{id}")
    public ResponseEntity<Task> updateTask(@PathVariable Long id,@RequestBody Task task){

        Task updatedTasks=taskService.updateTask(id,task);

        return ResponseEntity.ok(updatedTasks);
    }

    @DeleteMapping("/CRUD/deleteTask/task/{id}")
    public void deleteTask(@PathVariable Long id){

        taskService.deleteTask(id);
    }

}
