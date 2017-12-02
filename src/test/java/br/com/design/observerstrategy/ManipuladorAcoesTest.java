package br.com.design.observerstrategy;

import org.junit.Assert;
import org.junit.Test;

import br.com.design.observerstrategy.ManipuladorAcoes;
import br.com.design.observerstrategy.EnviadorEmail;
import br.com.design.observerstrategy.Login;
import br.com.design.observerstrategy.ProvedorEnum;
import br.com.design.observerstrategy.Tracking;

public class ManipuladorAcoesTest {
	
	@Test
	public void testDisparoAcoesComLoginOk(){
		Login l = new Login("Felipe Santaniello", "111", ProvedorEnum.GOOGLE);
		ManipuladorAcoes disparaAcoes = new ManipuladorAcoes();
		if(l.autentica()){
			disparaAcoes.add(new EnviadorEmail());
			disparaAcoes.add(new Tracking());
			disparaAcoes.executaAcoes(l);
		}
		
		Assert.assertTrue("A lista deve ser maior que 0!", disparaAcoes.getQtdAcoes() > 0);		
	}
	
	@Test
	public void testDisparoAcoesComLoginComErro(){
		Login l = new Login("Felipe Santaniello", "111", ProvedorEnum.GOOGLE);
		ManipuladorAcoes disparaAcoes = new ManipuladorAcoes();
		if(!l.autentica()){
			disparaAcoes.add(new EnviadorEmail());
			disparaAcoes.add(new Tracking());
			disparaAcoes.executaAcoes(l);
		}
		
		Assert.assertTrue("A lista deve ser igual a 0!", disparaAcoes.getQtdAcoes()== 0);		
	}
	

}
