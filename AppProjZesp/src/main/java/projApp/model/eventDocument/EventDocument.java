package projApp.model.eventDocument;

import static javax.persistence.GenerationType.IDENTITY;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import projApp.model.event.Event;

/**
 * @authors Pawe� Miszkiel & Rafa� Teodorowski
 * 
 * 		PW, Wydzia� Elektryczny - Informatyka - semestr VI
 *
 * 2017-06-13
 */

@Entity
@Table(name = "event_documents")
public class EventDocument {

	private Integer eventDocumentId;
	private String name;
	private String type;
	private String path;
	private String description;
	private Event event;
	
	public EventDocument() {}
	
	public EventDocument(String name, String type, String path, String description, Event event) {
		this.name = name;
		this.type = type;
		this.path = path;
		this.description = description;
		this.event = event;
	}
	
	public EventDocument(Integer eventDocumentId, String name, String type, String path, String description, Event event) {
		this.eventDocumentId= eventDocumentId;
		this.name = name;
		this.type = type;
		this.path = path;
		this.description = description;
		this.event = event;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "event_document_id", unique = true, nullable = false)
	public Integer getEventDocumentId() {
		return this.eventDocumentId;
	}
	
	public void setEventDocumentId(Integer eventDocumentId) {
		this.eventDocumentId = eventDocumentId;
	}
	
	@Column(name = "name", nullable = false, length = 90)
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "type", nullable = false, length = 45)
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Column(name = "path", nullable = false, length = 120)
	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	@Column(name = "description", nullable = false, length = 90)
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn (name="event_id", nullable=false)
	public Event getEvent() {
		return event;
	}

	public void setEvent(Event event) {
		this.event = event;
	}
	
}

