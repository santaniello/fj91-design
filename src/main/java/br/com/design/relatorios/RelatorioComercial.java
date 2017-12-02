package br.com.design.relatorios;

public class RelatorioComercial {
		
	public void gera(PedidoComercial pedido){
		// simula a geração de um relatório........
		System.out.println("Data de Emissão = " + pedido.getDataEmissao() + "Valor = " + pedido.getValor());
	}

}
