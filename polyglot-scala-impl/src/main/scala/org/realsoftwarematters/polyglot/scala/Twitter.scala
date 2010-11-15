package org.realsoftwarematters.polyglot.scala

import java.util.List
import java.util.ArrayList

import org.realsoftwarematters.polyglot.ITwitter
import org.realsoftwarematters.polyglot.Twitt

class Twitter extends ITwitter {

	var twitts : List[Twitt] = new ArrayList()
	
	def addTwitt(t:Twitt) = {twitts.add(t)}

	def getAll : List[Twitt] = twitts
	
	def getImplementation : String = "scala"
	
}
