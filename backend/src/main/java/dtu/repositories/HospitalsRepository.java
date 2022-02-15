package dtu.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import dtu.model.Hospital;

@Repository
public interface HospitalsRepository extends CrudRepository<Hospital, Long> {

	List<Hospital> findAll();
	
}
