package br.ifpe.web.exercicios.exerc02;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ContatoController {

	@Autowired
	private ContatoDAO contatoRep;
	
	@GetMapping("/contato")
	public ModelAndView exibirAddContato( ) {
		ModelAndView mv = new ModelAndView("exerc02/contatos-add");
		mv.addObject("contato", new Contato());
		return mv;
	}
	
	@PostMapping("/addContato")
	public String addContato(@ModelAttribute Contato contato) {
		System.out.println(contato);
		contatoRep.save(contato);
		return "redirect:/contato";
	}
	
}
