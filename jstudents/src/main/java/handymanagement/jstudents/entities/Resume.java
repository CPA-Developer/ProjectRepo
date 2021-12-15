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
@Table(name = "RESUME")
public class Resume {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "RESUMETABLE_ID")
    Integer resumeId;

    @Column(name = "PHONE")
    String phone;

    @Column(name = "EMAILADDRESS")
    String emailAddress;

    @ManyToOne
    @JoinColumn(name = "WORKER_ID", nullable = false)
    Worker workerId;

}
