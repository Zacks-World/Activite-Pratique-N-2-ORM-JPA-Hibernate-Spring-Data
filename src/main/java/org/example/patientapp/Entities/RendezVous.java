package org.example.patientapp.Entities;

import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import java.time.LocalDate;

public class RendezVous {
    private Long id;
    private LocalDate date;
    private StatusRDV statusRDV;
    private Patient patient;
    private Medecin medecin;
}
