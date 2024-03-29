package handymanagement.jstudents.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import handymanagement.jstudents.entities.Appointment;
import handymanagement.jstudents.repositories.appointmentRepo;

@Service
public class appointmentService {
    @Autowired
    static appointmentRepo appointmentRepo;
    @Autowired
    workerService workerService;

    public appointmentService(appointmentRepo appointmentRepo, workerService workerService) {
        super();
        this.appointmentRepo = appointmentRepo;
        this.workerService = workerService;
    }

    public static List<Appointment> findAppointments() {
        List<Appointment> appointments = appointmentRepo.findAll();
        return appointments;
    }

    public static List<Appointment> findAppointmentByDate() {
        List<Appointment> appointments = appointmentRepo.findByAppointmentDate("10/11/2021");
        return appointments;
    }

    public static Iterable<Appointment> findWorkerContactByAppointment(String keyword) {
        return appointmentRepo.findByAppointmentDate(keyword);
    }

}
