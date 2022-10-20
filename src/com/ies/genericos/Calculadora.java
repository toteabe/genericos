package com.ies.genericos;

public class Calculadora {

	@FunctionalInterface
	interface Matematicas {

		public int operacion(double x, double y);
		
	}

	public static void main(String[] args) {

		Matematicas o = Double::compare;
		 o = (x, y) -> Double.compare(x, y);
		System.out.println("Suma: "+ o.operacion(2, 3));
		
		
		//o = (x, y) ->  x * y;
		
		System.out.println("Producto: "+ o.operacion(2, 3));
		

	}

}