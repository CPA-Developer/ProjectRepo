package handymanagement.jstudents.repositories;

import org.springframework.stereotype.Repository;

import handymanagement.jstudents.entities.Appointment;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

@Repository
public interface appointmentRepo extends CrudRepository<Appointment, Integer> {
    List<Appointment> findAll();

    List<Appointment> findByAppointmentDate(String appointmentDate);

}
