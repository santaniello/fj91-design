package br.com.design.builders;

import java.time.LocalTime;

/**
 * Padrão de Builder baseado no Spring security aonde 
 * forçamos o usuário a seguir um padrão para 
 * */

public class LocalTimeBuilder {
	
	public static MinPart hora(int hora){
		return new MinPart(hora);
	}
	
	public static class MinPart{
		private final int hora;
		
		public MinPart(int hora){
			this.hora = hora;
		}
		
		public SecPart min(int min){
			return new SecPart(hora,min);
		}		
	}
	
	public static class SecPart{
		private int hora;
		private int min;
		
		public SecPart(int hora,int min){
			this.hora = hora;
			this.min  = min; 
		}
		
		public Builder sec(int sec){
			return new Builder(hora,min,sec);			
		}		
	}
	
	public static class Builder{
		private int sec;
		private int min;
		private int hora;
		
		public Builder(int hora, int min, int sec){
			this.sec = sec;
			this.min = min;
			this.hora = hora;
		}
		
		public LocalTime build(){
			return LocalTime.of(hora, min, sec);
		}
	}
	
	public static void main(String[] args) {
			System.out.println(LocalTimeBuilder.hora(10).min(10).sec(30).build());		
	}

}
