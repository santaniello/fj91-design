/**
 * @author Felipe Santaniello
 * O Objetivo desse exemplo é gerar dois relatórios com a mesma entidade usando um principio
 * do SOLID que é o ISP (Interface Segregation Principle).
 * 
 * O relatorio comercial é composto pelas seguintes informações do pedido: Data Emissão e Valor
 * O relatorio financeiro é composto pelas seguintes informações do pedido: Data Pagamento e Valor
 * 
 * O objetivo é não deixar um relatorio ter acesso as informações do outro em tempo de compilação.
 * 
 * Exemplo: O relatorio financeiro não pode ter acesso a data de emissão que estará presente
 * apenas no relatorio comercial.
 *
 */
package br.com.design.relatorios;