package org.realsoftwarematters.polyglot.web;

import org.realsoftwarematters.polyglot.ITwitter;
import org.realsoftwarematters.polyglot.Twitt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TwitterController {
	
	@Autowired
	private ITwitter twitter;
	
	@RequestMapping("/index.html")
	public String index(ModelMap model) {
		
		model.addAttribute("list", twitter.getAll());
		model.addAttribute("implementation", twitter.getImplementation());
		
		return "index";
	}
	
	@RequestMapping("/add.html")
	public String add(@RequestParam("twitt") String twitt,@RequestParam("author") String author, ModelMap model) {
		
		System.out.println("twitt : " + twitt);
		System.out.println("author : " + author);
		
		
		twitter.addTwitt(new Twitt(twitt,author));
		model.addAttribute("list", twitter.getAll());
		model.addAttribute("implementation", twitter.getImplementation());
		
		return "index";
	}
			
}