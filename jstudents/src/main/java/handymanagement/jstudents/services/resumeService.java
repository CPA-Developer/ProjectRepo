package handymanagement.jstudents.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import handymanagement.jstudents.entities.Resume;

import handymanagement.jstudents.repositories.resumeRepo;

@Service
public class resumeService {
    @Autowired
    resumeRepo resumeRepo;
    @Autowired
    workerService workerService;

    public resumeService(resumeRepo resumeRepo, workerService workerService) {
        super();
        this.resumeRepo = resumeRepo;
        this.workerService = workerService;
    }
}
