package br.com.alura.forum.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.com.alura.forum.modelo.Curso;

public interface CursoRepository extends JpaRepository<Curso, Long> {

	@Query(value = "select c from Curso c where c.nome = ?1")
	Curso findByName(String nome);
	
}
