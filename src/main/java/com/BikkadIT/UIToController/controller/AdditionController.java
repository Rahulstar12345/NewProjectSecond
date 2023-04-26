//Using Path Parameters
package com.BikkadIT.UIToController.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class AdditionController {
	@GetMapping("/add/{a}/and/{b}")
	public String add(@PathVariable int a, @PathVariable int b, Model model) {

		int c = a + b;
		String msg = "Additon of a and b=" + c;
		model.addAttribute("ADD", msg);
		return "add";

	}

}
