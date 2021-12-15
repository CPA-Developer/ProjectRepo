package handymanagement.jstudents.repositories;

import org.springframework.stereotype.Repository;

import handymanagement.jstudents.entities.Worker;

  
import java.util.List;

import org.springframework.data.repository.CrudRepository;

@Repository
public interface workerRepo extends CrudRepository<Worker,Integer>{

    List<Worker> findAll();
    List<Worker> findByFirstNameIgnoreCaseStartingWith(String letters);
}
