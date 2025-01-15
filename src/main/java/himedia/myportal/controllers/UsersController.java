package himedia.myportal.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/users")
public class UsersController {
	@GetMapping({"", "/", "/join"})
	public String joinForm() {
		return "users/joinform";
	}
	
	@GetMapping("/joinsuccess")
	public String joinSuccess() {
		return "users/joinsuccess";
	}

}
