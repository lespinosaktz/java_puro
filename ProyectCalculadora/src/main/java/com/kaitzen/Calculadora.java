package com.kaitzen;

public class Calculadora {

	public int sumar(int num, int num2){
		int res = num + num2;
		System.out.println("el resultado de la suma es: " + res);
		return res;
	}
	
	public int restar(int num, int num2){
		int res = num - num2;
		System.out.println("el resultado de la resta es: " + res);
		return res;
	}
	
	public int multiplicar(int num, int num2){
		int res = 0;
		for (int i = 0; i < num2; i++){
			res+= num;
		}
		System.out.println("el resultado de la resta es: " + res);
		return res;
	}
	
	public int dividir(int num, int num2){
		int res = 0;
		int resto = 0;
		while ( num >= 0){
			num-= num2;
			if (num >= 0) {
			 res++;
			 resto = num;
			}
		}
		System.out.println( "el resultado de la divisi�n es: " + res + ", y el resto de la misma es: " + resto);
		return  res;
	}
}
