// Using Query Parameters 

package com.BikkadIT.UIToController.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CourseController {
	@GetMapping("/course")
	public String course(@RequestParam String cname, Model model) {
		String msg = "new " + cname + " batch will start from 1 may 2023 ";
		System.out.println(msg);
		model.addAttribute("CNAME", msg);
		return "crc";

	}

	@GetMapping("/courset")
	public String CourseAndTrainer(@RequestParam String cname, @RequestParam String tname, Model model) {
		String msg = "new " + cname + " batch by " + tname + " will start from 1 may 2023 ";
		System.out.println(msg);
		model.addAttribute("CNAME", msg);
		return "crc";

	}
}