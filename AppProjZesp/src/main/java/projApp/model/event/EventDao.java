package projApp.model.event;

import org.springframework.data.repository.CrudRepository;

/**
 * @authors Pawe� Miszkiel & Rafa� Teodorowski
 * 
 * 		PW, Wydzia� Elektryczny - Informatyka - semestr VI
 *
 * 2017-06-13
 */

public interface EventDao extends CrudRepository<Event, Integer> {

	public Event findByEventId(Integer eventId);
	
}
