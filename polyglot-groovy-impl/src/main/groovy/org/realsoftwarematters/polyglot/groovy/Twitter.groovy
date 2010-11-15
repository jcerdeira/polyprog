package org.realsoftwarematters.polyglot.groovy

import java.util.ArrayList;
import java.util.List;

import org.realsoftwarematters.polyglot.Twitt;
import org.realsoftwarematters.polyglot.ITwitter;

class Twitter implements ITwitter
{
	
	def twitts = [];
	
	def void addTwitt(Twitt t) {
		twitts << t;
	}

	def List<Twitt> getAll() {
		return twitts;
	}

	def String getImplementation() {
		return "Groovy";
	}
		
}
