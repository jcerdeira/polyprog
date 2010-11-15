package org.realsoftwarematters.polyglot.java;

import org.realsoftwarematters.polyglot.Twitt;
import org.testng.annotations.Test;

public class TwitterTest {

	@Test public void testAdd(){
		
		Twitter twitter = new Twitter();
		
		assert (twitter.getAll().size() == 0);
		
		Twitt t = new Twitt();
		t.setAuthor("Ramalho");
		t.setMessage("I'm doing some coding");
		
		twitter.addTwitt(t);
		
		assert (twitter.getAll().size() == 1);
		
	}
	
}
