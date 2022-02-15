package dtu.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import dtu.model.Patient;

@Repository
public interface PatientsRepository extends CrudRepository<Patient, Long> { }
