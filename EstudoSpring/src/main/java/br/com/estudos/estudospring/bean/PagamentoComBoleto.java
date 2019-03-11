package br.com.estudos.estudospring.bean;

import java.util.Date;

import javax.persistence.Entity;

import br.com.estudos.estudospring.enums.EstadoPagamento;
import lombok.Data;

@Data
@Entity
public class PagamentoComBoleto extends Pagamento {
	private static final long serialVersionUID = 1L;

	private Date dataVencimento;
	private Date dataPagamento;
	
	public PagamentoComBoleto() {}

	public PagamentoComBoleto(Integer id, EstadoPagamento estado, Pedido pedido, Date dataVencimento, Date dataPagamento) {
		super(id, estado, pedido);
		this.dataVencimento = dataVencimento; 
		this.dataPagamento = dataPagamento;
	}
	
	
}
