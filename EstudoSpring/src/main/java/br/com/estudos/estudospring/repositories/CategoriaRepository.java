package br.com.estudos.estudospring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.estudos.estudospring.bean.Categoria;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Integer> {}
