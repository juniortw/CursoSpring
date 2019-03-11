package br.com.estudos.estudospring.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.estudos.estudospring.bean.Pedido;
import br.com.estudos.estudospring.repositories.PedidoRepository;
import br.com.estudos.estudospring.services.exceptions.ObjectNotFoundException;

@Service
public class PedidoService {

	@Autowired
	private PedidoRepository repo;

	public Pedido buscar(Integer id) {
		Optional<Pedido> obj = repo.findById(id);

		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado com id: " + id + ", tipo: " + Pedido.class.getName()));
	}

}
