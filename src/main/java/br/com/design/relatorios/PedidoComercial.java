package br.com.design.relatorios;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public interface PedidoComercial {
	
	public LocalDateTime getDataEmissao();
	public BigDecimal getValor();

}
