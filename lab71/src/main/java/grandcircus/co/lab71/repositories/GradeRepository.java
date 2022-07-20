package grandcircus.co.lab71.repositories;

import java.util.List;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import grandcircus.co.lab71.model.Grades;

public interface GradeRepository extends MongoRepository<Grades, String>{

		List<Grades> findAll();
		
		Optional<Grades> findById(String id);
}
