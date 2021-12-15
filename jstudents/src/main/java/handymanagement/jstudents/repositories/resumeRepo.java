package handymanagement.jstudents.repositories;

import org.springframework.stereotype.Repository;

import handymanagement.jstudents.entities.Resume;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

@Repository
public interface resumeRepo extends CrudRepository<Resume, Integer> {
    List<Resume> findAll();
}
