package mk.ukim.finki.wp.running.repository;

import mk.ukim.finki.wp.running.model.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaSpecificationRepository<User, String> {

}
