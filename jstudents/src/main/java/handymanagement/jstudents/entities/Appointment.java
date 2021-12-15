package handymanagement.jstudents.entities;

//import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
//import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "APPOINTMENT")
public class Appointment {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "APPOINTMENT_ID")
    Integer appointmentId;

    @Column(name = "APPOINTMENT_DATE")
    String appointmentDate;

    @ManyToOne
    @JoinColumn(name = "WORKER_ID", nullable = false)
    Worker workerId;

}
