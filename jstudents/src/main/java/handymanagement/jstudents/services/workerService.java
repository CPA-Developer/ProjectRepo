package handymanagement.jstudents.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import handymanagement.jstudents.entities.Worker;
import handymanagement.jstudents.repositories.workerRepo;

@Service
public class workerService {

    workerRepo workerRepo;

    @Autowired
    public workerService(workerRepo workerRepo) {
        super();
        this.workerRepo = workerRepo;
    }

    public List<Worker> findWorkers() {
        return workerRepo.findAll();
    }
    public Iterable<Worker> findWorkerByFirstName(String firstName)
    {
        return workerRepo.findByFirstNameIgnoreCaseStartingWith(firstName);
    }

}
