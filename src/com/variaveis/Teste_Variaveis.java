package com.variaveis;

public class Teste_Variaveis {
	
	public static void main(String [] args) {
		
		/**
		 * Na	 empresa	 em	 que	trabalhamos,	 h�	tabelas	 com	 o	 gasto	 de	 cada	 m�s.	 Para	 fechar	 o	 balan�o	 do
		 * primeiro	trimestre,	 precisamos	 somar	 o	 gasto	total.	Sabendo	 que,	em	janeiro,	 foram	 gastos	 15	mil
		 * reais,	em	fevereiro,	23	mil	reais	e,	em	mar�o,	17	mil	reais,	fa�a	um	programa	que	calcule	e	imprima
		 * a	despesa	total	no	trimestre	e	a	m�dia	mensal	de	gastos
		 */
		
		double Janeiro;
		double Fevereiro;
		double Marco;
		double Calculo_trimestre;
		double media_gastos;
		
		
		Janeiro = 15.000;
		Fevereiro = 23.000;
		Marco = 17.000;
		Calculo_trimestre = Janeiro+Fevereiro+Marco;
		media_gastos = Calculo_trimestre/3;
		
		System.out.println("Gastos Trimestrais: "+Calculo_trimestre);
		System.out.println("M�dia de gastos Mensais: "+media_gastos);
			
	}

}
