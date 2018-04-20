package controller;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import model.Benutzern;

/**
 * In Srping Approach to building RESTful web services,
 * HTTP requests are handled by a controller.
 * these Component are easily identified by the {@RestController}
 * annotation
 * @author he
 *
 */
@RestController
public class WebController {

	
	private final String template="Sello! %s!";
	private final AtomicLong counter = new AtomicLong(); 
	
	@Autowired
	CustomerRepository repository;
	/**
	 * This is for sample mapping for REST  request
	 * If don't specify a value, it's going to map to any HTTP request.
	 * @param value  relative path of accessed file 
	 * @param method GET POST ...
	 * Via @param headers from RequestMapping can request be maooed
	 * 
	 * 
	 */
	@RequestMapping("/save")
	public String process() {
		repository.save(new Benutzern("Jack","Los Angl"));
		repository.saveAll(
				 Arrays.asList(
				new Benutzern("user1","Lepzig"),
				new Benutzern("user2","Hanover"),
				new Benutzern("user3","Madgeburg"),
				new Benutzern("user4","Bielfeld") ));
		return "Done";

	}
}
