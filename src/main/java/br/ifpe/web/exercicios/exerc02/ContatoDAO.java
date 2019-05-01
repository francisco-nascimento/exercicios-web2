package br.ifpe.web.exercicios.exerc02;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContatoDAO extends JpaRepository<Contato, String> {

}
