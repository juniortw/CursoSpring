package br.com.estudos.estudospring.bean;

import javax.persistence.Entity;

import br.com.estudos.estudospring.enums.EstadoPagamento;
import lombok.Data;

@Data
@Entity
public class PagamentoComCartao extends Pagamento {
	private static final long serialVersionUID = 1L;
	
	private Integer numParcelas;
	
	public PagamentoComCartao() {}

	public PagamentoComCartao(Integer id, EstadoPagamento estado, Pedido pedido, Integer numParcelas) {
		super(id, estado, pedido);
		this.numParcelas = numParcelas;
	}
	
	
}
