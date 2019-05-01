package br.ifpe.web.exercicios.exerc02;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContatoService {

	@Autowired
	private ContatoDAO contatoDAO;

	public Contato save(Contato entity) {
		return contatoDAO.save(entity);
	}
	
}
