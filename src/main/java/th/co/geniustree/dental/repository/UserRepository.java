package th.co.geniustree.dental.repository;

import javax.persistence.Id;
import org.springframework.data.jpa.repository.JpaRepository;
import th.co.geniustree.dental.domain.User;

/**
 * @author pramoth
 */
public interface UserRepository extends JpaRepository<User, String> {

}
