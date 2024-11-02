package com.cibertec.web_demo.controlador;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoController {

	@GetMapping({"/index", "/", ""})
	public String index(Model model) {
		model.addAttribute("curso", "LP2");
		model.addAttribute("sede", "Trujillo");
		return "index";
	}
}
