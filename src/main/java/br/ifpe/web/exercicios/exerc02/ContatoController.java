package br.ifpe.web.exercicios.exerc02;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/exerc02")
public class ContatoController {

	@GetMapping("/")
	public ModelAndView exibirAddContato( ) {
		ModelAndView mv = new ModelAndView("exerc02/contatos-add");
	//	mv.addObject("contato", new Contato());
		return mv;
	}
	
	@PostMapping("/add")
	public String addContato(@ModelAttribute Contato contato) {
		System.out.println(contato);
	//	contato = new Contato();
		return "redirect:/exerc02/";
	}
	
}
