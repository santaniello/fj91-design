package br.com.design.relatorios;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * Relatorio financeiro valor + data de pagamento
 * Relatorio Comercial valor + comercial
 * 
 * *
 * @author arq7144
 *
 */

public class Pedido implements PedidoComercial, PedidoFinanceiro{
	
	private BigDecimal valor;
	private LocalDateTime dataEmissao;
	private LocalDateTime dataPagamento;
	
	public BigDecimal getValor() {
		return valor;
	}
	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}
	
	public LocalDateTime getDataEmissao() {
		return dataEmissao;
	}
	public void setDataEmissao(LocalDateTime dataEmissao) {
		this.dataEmissao = dataEmissao;
	}
	public LocalDateTime getDataPagamento() {
		return dataPagamento;
	}
	public void setDataPagamento(LocalDateTime dataPagamento) {
		this.dataPagamento = dataPagamento;
	}
	

}
