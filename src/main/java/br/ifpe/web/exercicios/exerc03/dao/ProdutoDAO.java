package br.ifpe.web.exercicios.exerc03.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import br.ifpe.web.exercicios.exerc03.Produto;

public interface ProdutoDAO extends JpaRepository<Produto, Integer> {

}
