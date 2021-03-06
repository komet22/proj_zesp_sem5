package projApp.formDTO;

import java.util.ArrayList;
import java.util.List;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import projApp.model.eventDocument.EventDocument;

/**
 * @authors Pawe� Miszkiel & Rafa� Teodorowski
 * 
 * 		PW, Wydzia� Elektryczny - Informatyka - semestr VI
 *
 * 2017-06-13
 */

public class EventDTO {

	private Integer eventId;
	private Integer cooperationId;
    @NotNull
    @Size(min=3, max=45)
	private String subject;
    @NotNull
    @Size(min=3, max=45)
	private String content;
    @NotNull
    @Size(min=1, max=45)
    private String eventType;
	private List <EventDocument> documents = new ArrayList<EventDocument>();
	public Integer getEventId() {
		return eventId;
	}
	public void setEventId(Integer eventId) {
		this.eventId = eventId;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public List<EventDocument> getDocuments() {
		return documents;
	}
	public void setDocuments(List<EventDocument> documents) {
		this.documents = documents;
	}
	public Integer getCooperationId() {
		return cooperationId;
	}
	public void setCooperationId(Integer cooperationId) {
		this.cooperationId = cooperationId;
	}
	public String getEventType() {
		return eventType;
	}
	public void setEventType(String eventType) {
		this.eventType = eventType;
	}
	   
}