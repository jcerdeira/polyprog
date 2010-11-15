package org.realsoftwarematters.polyglot;

public class Twitt {

	public String message;
	public String author;
	
	public Twitt(String message, String author){
		this.message=message;
		this.author=author;
	}
	
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
}
