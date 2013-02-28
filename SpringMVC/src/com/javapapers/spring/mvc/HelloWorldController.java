package com.javapapers.spring.mvc;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.javapapers.spring.domain.Usuario;
import com.javapapers.spring.service.UsuarioService;

@Controller
public class HelloWorldController {

	protected final Log logger = LogFactory.getLog(getClass());
	
	@Autowired
    private UsuarioService usuarioService;
	
	@RequestMapping("/")
	public String index() {
		return "index";
	}
	

	@RequestMapping(value = "/hi", method = RequestMethod.GET)
	public String hi(@RequestParam("name") String name, Model model) {
		String message = "Hi " + name + "!";
		model.addAttribute("message", message);
		return "hi";
	}
	
	@RequestMapping(value = "/doAlta", method = RequestMethod.GET)
	public String doAlta(@RequestParam("name") String name, 
			@RequestParam("password") String password, 
			@RequestParam("mail") String mail, 
			Model model) {
		String message = "Hi " + name + "!";
		model.addAttribute("message", message);
		usuarioService.saveUsuario(new Usuario(name,password,mail));
		return "hi";
	}
	
	@RequestMapping("toAlta")
	public String alta(Model model) {
		return "alta";
	}
}
