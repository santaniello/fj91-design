package br.com.design.relatorios;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public interface PedidoFinanceiro {	
	public LocalDateTime getDataPagamento();
	public BigDecimal getValor();
}
