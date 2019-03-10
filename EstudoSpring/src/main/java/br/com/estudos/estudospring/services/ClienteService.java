package br.com.estudos.estudospring.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.estudos.estudospring.bean.Cliente;
import br.com.estudos.estudospring.repositories.ClienteRepository;
import br.com.estudos.estudospring.services.exceptions.ObjectNotFoundException;

@Service
public class ClienteService {

	@Autowired
	private ClienteRepository repo;

	public Cliente buscar(Integer id) {
		Optional<Cliente> obj = repo.findById(id);

		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado com id: " + id + ", tipo: " + Cliente.class.getName()));
	}

}
