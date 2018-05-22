package com.project.test.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.test.Model.Hello;

@RestController
public class HelloController {

	
	
	@RequestMapping("/hello")
	public Hello pozdrav () {
		
		return new Hello(1,"pozdrav!!!!");
		
	}
	
	@RequestMapping("/bok")
	public Hello bok () {
		
		return new Hello(2,"bok!!!!");
		
	}
}
