package br.ifpe.web.exercicios.exerc03.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import br.ifpe.web.exercicios.exerc03.Categoria;


public interface CategoriaDAO extends JpaRepository<Categoria, Integer> {

}
