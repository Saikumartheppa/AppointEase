package com.saikumar.DoctorApp.model;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@JsonIdentityInfo(generator= ObjectIdGenerators.PropertyGenerator.class,scope=Appointment.class,property="appointmentId")
public class Appointment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long appointmentId;
    private String apppointmentDescription;
    private LocalDateTime appointmentScheduleTime;
    private LocalDateTime appointmentCreationTime;

    @OneToOne
    @JoinColumn(name = "fk_patient_Id")
    Patient patient;

    @ManyToOne
    @JoinColumn(name = "fk_doctor_Id")
    Doctor doctor;
}
