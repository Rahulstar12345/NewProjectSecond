package com.BikkadIT.UIToController.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.BikkadIT.UIToController.model.User;

@Controller
public class UserController {
	@GetMapping("/loadform")
	public String loadform() {
		return "RegForm";

	}

	@GetMapping("/saveuser")
	public String saveuser(User user, Model model) {
		System.out.println(user);
		String msg = " Hiii " + user.getfName() + " Your Registered Succeful ";
		model.addAttribute("MSG", msg);
		return "Register";

	}

}
