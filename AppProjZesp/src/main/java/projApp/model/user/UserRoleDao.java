package projApp.model.user;

import javax.transaction.Transactional;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * @authors Pawe� Miszkiel & Rafa� Teodorowski
 * 
 * 		PW, Wydzia� Elektryczny - Informatyka - semestr VI
 *
 * 2017-06-13
 */

@Transactional
@Repository
public interface UserRoleDao extends CrudRepository<UserRole, Integer> {

  public UserRole findByUser(User user);
  
}