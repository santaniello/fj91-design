package br.com.design.relatorios;

public class RelatorioFinanceiro {
	
	public void gera(PedidoFinanceiro pedido){	
		// simula a geração de um relatório........
		System.out.println("Data de Pagamento = " + pedido.getDataPagamento() + "Valor = " + pedido.getValor());
	}
}
