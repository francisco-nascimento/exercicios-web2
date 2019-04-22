package br.ifpe.web.exercicios.exerc01;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/exerc01")
public class IndexController {

	@GetMapping("ind")
	public String index(Model model) {
		model.addAttribute("mensagem", "Olá mundo!");
		return "exerc01/hello";
	}
	
	@GetMapping("ind2")
	public String index2(Model model) {
		model.addAttribute("mensagem", "Hello World!");
		return "exerc01/hello";
	}
	
	@GetMapping("ind3")
	public String index3(@RequestParam("idioma") int idioma, Model model) {
		String mensagem = "";
		switch (idioma) {
		case 1:
			mensagem = "Olá Mundo!";
			break;
		case 2:
			mensagem = "Hello World!";
			break;
		case 3:// Alemao
			mensagem = "Hallo Welt!";
			break;
		case 4: // Bulgaro
			mensagem = "Здравей свят!";
			break;
		case 5: // Espanhol
			mensagem = "Hola Mundo!";
			break;
		case 6: // Italiano
			mensagem = "Ciao mondo!";
			break;
		// ... outros idiomas			
		default:
			break;
		}
		model.addAttribute("mensagem", mensagem);
		return "exerc01/hello";
	}

	@GetMapping("menu")
	public String menu() {
		return "/exerc01/menu";
	}
		
}


