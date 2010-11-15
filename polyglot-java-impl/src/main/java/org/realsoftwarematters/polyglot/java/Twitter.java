package org.realsoftwarematters.polyglot.java;

import java.util.ArrayList;
import java.util.List;

import org.realsoftwarematters.polyglot.ITwitter;
import org.realsoftwarematters.polyglot.Twitt;

public class Twitter implements ITwitter{

	private List<Twitt> twitts;
	
	public Twitter(){
		twitts = new ArrayList<Twitt>();
	}
	
	public void addTwitt(Twitt t) {
		twitts.add(t);
	}

	public List<Twitt> getAll() {
		return twitts;
	}

	public String getImplementation() {
		return "Java";
	}

	
}
