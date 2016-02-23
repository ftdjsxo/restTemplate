package it.effesoft.rest.service.model;

import java.util.List;

public class BaseObject {

	private String id;
	private List<String> messages;
	
	public BaseObject() {
	
	}
	
	public BaseObject(String id, List<String> messages) {
		super();
		this.id = id;
		this.messages = messages;
	}


	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public List<String> getMessages() {
		return messages;
	}
	
	public void setMessages(List<String> messages) {
		this.messages = messages;
	}
	
	public void addMessage(String message){
		messages.add(message);
	}
}
