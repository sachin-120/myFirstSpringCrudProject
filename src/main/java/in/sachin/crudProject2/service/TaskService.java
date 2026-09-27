package in.sachin.crudProject2.service;
import java.util.*;
import in.sachin.crudProject2.entity.Task;
import in.sachin.crudProject2.repository.TaskRepository;
import org.springframework.stereotype.Service;

@Service
public class TaskService{

    private final TaskRepository taskRepository;

    TaskService(TaskRepository taskRepository){
        this.taskRepository=taskRepository;
    }

    //-------------------------------

    public Task createTask(Task task){
        Task taskCreated=taskRepository.save(task);

        return taskCreated;
    }

    //-------------------------------


    public List<Task> getAllTasks(){
        List<Task> getTask=taskRepository.findAll();

        return getTask;
    }

    //-------------------------------


    public Optional<Task> getTaskById(Long id){

        Optional<Task> taskOptional=taskRepository.findById(id);

        if(taskOptional.isEmpty()){
            return Optional.empty();
        }

        return taskOptional;

    }

    //-------------------------------


    public Task updateTask(Long id,Task task){

        Optional<Task> taskOptional=taskRepository.findById(id);

        if(taskOptional.isPresent()){
            Task exiting=taskOptional.get();

            exiting.setName(task.getName());
            exiting.setDescription(task.getDescription());
            exiting.setStatus(task.getStatus());
            exiting.setPriority(task.getPriority());
            exiting.setDueDate(task.getDueDate());

            Task updatedTask=taskRepository.save(exiting);

            return updatedTask;
        }

        return null;
    }

    //-------------------------------


    public void deleteTask(Long id){
         taskRepository.deleteById(id);
        
    }


}
