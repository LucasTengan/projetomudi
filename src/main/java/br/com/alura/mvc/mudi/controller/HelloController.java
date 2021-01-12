package br.com.alura.mvc.mudi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

	// Actions -> métodos de classes controllers que atendem a uma requisição http
	@GetMapping("/hello")
	public String hello(Model model) {
		model.addAttribute("nome", "World");
		return "hello";
	}
}
