package com.cakefresh.dev.viewController;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/view")
public class ViewController {
	
	@GetMapping("/index")
	public String indexPage(Model model) {
		return "index";
	}
	
	@GetMapping("/home")
	public String homepage() {
		return "home";
	}
}


