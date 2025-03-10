package org.example.patientapp;
import org.example.patientapp.Entities.Patient;
import org.example.patientapp.Repositories.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;
import java.util.List;

@SpringBootApplication

public class PatientAppApplication implements CommandLineRunner {
    @Autowired
    private PatientRepository patientRepository;

    public static void main(String[] args) {
        SpringApplication.run(PatientAppApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        patientRepository.save(new Patient(null, "Ali", LocalDate.now() ,false,33));
        patientRepository.save(new Patient(null, "Ahmed",LocalDate.now() ,false,33));
        patientRepository.save(new Patient(null, "Sami",LocalDate.now() ,true,100));
        List<Patient> patients = patientRepository.findAll();
        patients.forEach(p -> {
            System.out.println(p.getId());
            System.out.println(p.getName());
            System.out.println(p.getDateNaissance());
            System.out.println(p.isMalade());
            System.out.println(p.getScore());
            System.out.println("***********************");
        });
        System.out.println("-----------------------");
        patients.forEach(pr -> {
            System.out.println(pr.toString());
            System.out.println("***********************");
        });
        System.out.println("oooooooooooooooooooooooooo");
    }
}
