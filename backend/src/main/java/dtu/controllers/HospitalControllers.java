package dtu.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import dtu.model.Hospital;
import dtu.repositories.HospitalsRepository;

@Controller
@CrossOrigin
public class HospitalControllers {

	@Autowired
	private HospitalsRepository repository;
	
	@GetMapping("/api/v1/hospitals")
	public ResponseEntity<List<Hospital>> getAll() {
		return ResponseEntity.ok(repository.findAll());
	}
	
	@PostMapping("/api/v1/hospitals")
	public ResponseEntity<Hospital> create(@RequestBody Hospital hospital) {
		return ResponseEntity.ok(repository.save(hospital));
	}
	
	@DeleteMapping("/api/v1/hospitals/{id}")
	public ResponseEntity<?> delete(@PathVariable Long id) {
		repository.deleteById(id);
		return ResponseEntity.noContent().build();
	}
}
