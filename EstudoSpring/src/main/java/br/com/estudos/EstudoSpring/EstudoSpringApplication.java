package br.com.estudos.estudospring;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.estudos.estudospring.bean.Categoria;
import br.com.estudos.estudospring.repositories.CategoriaRepository;

@SpringBootApplication
public class EstudoSpringApplication implements CommandLineRunner {

	@Autowired
	CategoriaRepository catRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(EstudoSpringApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Categoria cat1 = new Categoria(null, "Informática");
		Categoria cat2 = new Categoria(null, "Escritório");
		
		catRepository.saveAll(Arrays.asList(cat1, cat2));
	}
	
	

}
 