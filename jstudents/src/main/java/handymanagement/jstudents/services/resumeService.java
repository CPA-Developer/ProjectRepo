package handymanagement.jstudents.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import handymanagement.jstudents.entities.Resume;

import handymanagement.jstudents.repositories.resumeRepo;

@Service
public class resumeService {
    @Autowired
    static resumeRepo resumeRepo;
    @Autowired
    workerService workerService;

    public resumeService(resumeRepo resumeRepo, workerService workerService) {
        super();
        this.resumeRepo = resumeRepo;
        this.workerService = workerService;
    }

    public static List<Resume> findResumes() {
        List<Resume> resumes = resumeRepo.findAll();
        return resumes;
    }

    public static Iterable<Resume> findWorkerContactByFirstName(Integer keyword) {
        return resumeRepo.findEmailAddressByResumeId(keyword);
    }
}
