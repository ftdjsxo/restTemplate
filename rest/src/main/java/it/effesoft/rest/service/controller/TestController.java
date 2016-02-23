package it.effesoft.rest.service.controller;

import it.effesoft.rest.service.helper.RestHelper;
import it.effesoft.rest.service.model.BaseObject;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	
	@RequestMapping("/test")
	public int testZero(){
		return 18-18;
	}
	
	@RequestMapping("/test/string")
	public String testString(){
		return "ciao amomma️";
	}
	
	@RequestMapping("/test/obj")
	public BaseObject testObj(){
		return RestHelper.getObject();
	}
	
	@RequestMapping("/test/add")
	public boolean addMessage(@RequestParam(name = "message") String message){
		BaseObject object = RestHelper.getObject();
		object.addMessage(message);
		return true;
	}
	
	@RequestMapping(method = RequestMethod.POST, value="/post/add")
	public boolean addPost(@RequestParam(name = "message", required=true) String message){
		BaseObject object = RestHelper.getObject();
		object.addMessage(message);
		return true;
	}
	
	
	

}
