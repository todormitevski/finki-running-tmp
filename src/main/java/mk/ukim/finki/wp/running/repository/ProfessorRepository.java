package mk.ukim.finki.wp.running.repository;


import mk.ukim.finki.wp.running.model.Professor;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfessorRepository extends JpaSpecificationRepository<Professor, String> {

}
