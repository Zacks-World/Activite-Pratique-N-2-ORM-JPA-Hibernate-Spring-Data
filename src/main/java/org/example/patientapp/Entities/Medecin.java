package org.example.patientapp.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Collection;
import java.util.List;


public class Medecin {
    private Long id;
    private String name;
    private String specialite;
    private Collection<RendezVous> rendezVous;
}
