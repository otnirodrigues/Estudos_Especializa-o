package com.condicionais_lacos;

public class Exercicio5 {
	
	public static void main(String [] args) {
		
		/*
		 *  (Opcional)	 Imprima	 os	 primeiros	 n�meros	 da	 s�rie	 de	 Fibonacci	 at�	 passar	 de	 100.	 A	 s�rie	 de
		 *  Fibonacci	�	a	seguinte:	0,	1,	1,	2,	3,	5,	8,	13,	21,	etc.	Para	calcul�-la,	o	primeiro	elemento	vale	0,	o
		 *  segundo	vale 1,	e	da�	por	diante.	O	n-�simo	elemento	vale	o	(n-1)-�simo	elemento	somado	ao	(n-2)-
		 *  �simo	elemento	(ex:	8	=	5	+	3).

		 */
		
		int cont = 0;
		long n1 = 0;
		long n2 = 1;
		long n3 = 0;
		
		while (cont <= 100) {
			if (cont == 0){
				System.out.println(n1);
				cont ++;
				System.out.println(n2);
				cont ++;
			}else{
				n3 = n1;
				System.out.println(n2+n1);
				cont ++;
				n1 = n2;
				n2 = (n3+n1);
			}
			
		}
		
	}

}
