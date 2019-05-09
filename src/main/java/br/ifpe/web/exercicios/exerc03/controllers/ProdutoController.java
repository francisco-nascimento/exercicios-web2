package br.ifpe.web.exercicios.exerc03.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import br.ifpe.web.exercicios.exerc03.Produto;
import br.ifpe.web.exercicios.exerc03.dao.CategoriaDAO;
import br.ifpe.web.exercicios.exerc03.dao.ProdutoDAO;

@Controller
public class ProdutoController {

	@Autowired
	private ProdutoDAO produtoRep;
	@Autowired
	private CategoriaDAO categoriaRep;
	
	@PostMapping("/salvarProduto")
	public String salvar(@ModelAttribute Produto produto) {
		this.produtoRep.save(produto);
		return "redirect:/produtos";		
	}

	@GetMapping("/produtos")
	public ModelAndView listar() {
		ModelAndView mv = new ModelAndView("/exerc03/produto-form");
		mv.addObject("produto", new Produto());
		mv.addObject("listaCategorias", categoriaRep.findAll());
		mv.addObject("listaProdutos", produtoRep.findAll());
		return mv;		
	}
	
	@GetMapping("/editarProduto")
	public ModelAndView editar(@RequestParam Integer codigo) {
		ModelAndView mv = new ModelAndView("/exerc03/produto-form");
		mv.addObject("produto", produtoRep.getOne(codigo));
		mv.addObject("listaCategorias", categoriaRep.findAll());		
		return mv;		
	} 

	@GetMapping("/removerProduto")
	public String remover(@RequestParam Integer codigo) {
		this.produtoRep.deleteById(codigo);
		return "redirect:/produtos";		
	} 

}
