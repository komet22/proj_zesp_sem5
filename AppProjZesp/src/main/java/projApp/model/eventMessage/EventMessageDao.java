package projApp.model.eventMessage;


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
public interface EventMessageDao extends CrudRepository<EventMessage, Integer>{
	
}