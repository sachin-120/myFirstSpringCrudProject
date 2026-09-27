package in.sachin.crudProject2.repository;

import in.sachin.crudProject2.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public interface TaskRepository extends JpaRepository<Task,Long>{



}
