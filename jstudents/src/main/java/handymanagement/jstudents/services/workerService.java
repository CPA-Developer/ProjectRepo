package handymanagement.jstudents.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import handymanagement.jstudents.entities.Worker;
import handymanagement.jstudents.repositories.workerRepo;

@Service
public class workerService {

    static workerRepo workerRepo;

    @Autowired
    public workerService(workerRepo workerRepo) {
        super();
        this.workerRepo = workerRepo;
    }

    public static List<Worker> findWorkers() {
        List<Worker> workers = workerRepo.findAll();
        return workers;
    }

}
