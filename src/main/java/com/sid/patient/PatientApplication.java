package com.sid.patient;

import com.sid.patient.dao.PatientRepository;
import com.sid.patient.entities.Patient;
import lombok.AllArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
@AllArgsConstructor
public class PatientApplication  {
	private PatientRepository patientRepository;
	public static void main(String[] args) {
		SpringApplication.run(PatientApplication.class, args);
	}

	/**@Override
	public void run(String... args) throws Exception {
	patientRepository.save(new Patient(null,"Mamadou",new Date(),false,9,"Via Giacome Meddici"));
		patientRepository.save(new Patient(null,"Aissatou",new Date(),false,9,"Via Bra"));
		patientRepository.save(new Patient(null,"Bintou",new Date(),false,9,"Via Francesco"));
		patientRepository.save(new Patient(null,"Salima",new Date(),false,9,"Piazza Grande"));
		patientRepository.save(new Patient(null,"Ousmane",new Date(),false,9,"Via Novara "));
		patientRepository.save(new Patient(null,"Oumar",new Date(),false,9,"Corso Emilia"));
		patientRepository.save(new Patient(null,"AMidou",new Date(),false,9,"Via pastore"));
		patientRepository.save(new Patient(null,"Mamadou",new Date(),false,9,"Via Svizzera"));
		patientRepository.save(new Patient(null,"Thierno",new Date(),false,9,"Via Giacome "));
		patientRepository.save(new Patient(null,"Mamadou",new Date(),false,9,"Via Giacome Meddici"));
		patientRepository.save(new Patient(null,"Aissatou",new Date(),false,9,"Via Bra"));
		patientRepository.save(new Patient(null,"Bintou",new Date(),false,9,"Via Francesco"));
		patientRepository.save(new Patient(null,"Salima",new Date(),false,9,"Piazza Grande"));
		patientRepository.save(new Patient(null,"Ousmane",new Date(),false,9,"Via Novara "));
		patientRepository.save(new Patient(null,"Oumar",new Date(),false,9,"Corso Emilia"));
		patientRepository.save(new Patient(null,"AMidou",new Date(),false,9,"Via pastore"));
		patientRepository.save(new Patient(null,"Mamadou",new Date(),false,9,"Via Svizzera"));
		patientRepository.save(new Patient(null,"Thierno",new Date(),false,9,"Via Giacome "));
		patientRepository.save(new Patient(null,"Mamadou",new Date(),false,9,"Via Giacome Meddici"));
		patientRepository.save(new Patient(null,"Aissatou",new Date(),false,9,"Via Bra"));
		patientRepository.save(new Patient(null,"Bintou",new Date(),false,9,"Via Francesco"));
		patientRepository.save(new Patient(null,"Salima",new Date(),false,9,"Piazza Grande"));
		patientRepository.save(new Patient(null,"Ousmane",new Date(),false,9,"Via Novara "));
		patientRepository.save(new Patient(null,"Oumar",new Date(),false,9,"Corso Emilia"));
		patientRepository.save(new Patient(null,"AMidou",new Date(),false,9,"Via pastore"));
		patientRepository.save(new Patient(null,"Mamadou",new Date(),false,9,"Via Svizzera"));
		patientRepository.save(new Patient(null,"Thierno",new Date(),false,9,"Via Giacome "));
		patientRepository.save(new Patient(null,"Mamadou",new Date(),false,9,"Via Giacome Meddici"));
		patientRepository.save(new Patient(null,"Aissatou",new Date(),false,9,"Via Bra"));
		patientRepository.save(new Patient(null,"Bintou",new Date(),false,9,"Via Francesco"));
		patientRepository.save(new Patient(null,"Salima",new Date(),false,9,"Piazza Grande"));
		patientRepository.save(new Patient(null,"Ousmane",new Date(),false,9,"Via Novara "));
		patientRepository.save(new Patient(null,"Oumar",new Date(),false,9,"Corso Emilia"));
		patientRepository.save(new Patient(null,"AMidou",new Date(),false,9,"Via pastore"));
		patientRepository.save(new Patient(null,"Mamadou",new Date(),false,9,"Via Svizzera"));
		patientRepository.save(new Patient(null,"Thierno",new Date(),false,9,"Via Giacome "));


	}*/
}
