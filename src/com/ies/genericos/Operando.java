package com.ies.genericos;

public class Operando {

	public static void main(String[] args) {
		
		//Clase anónima de interfaz con seteo de parámetros
		Operable<Double> op = new Operable<>() {
			
			private Double e;
			
			@Override
			public Double suma(Double e) {
				return this.e + e ;
			}

			@Override
			public Double resta(Double e) {
				return this.e - e;
			}

			@Override
			public Double multiplicar(Double e) {
				return this.e * e;
			}

			@Override
			public Double division(Double e) {
				return this.e / e;
			}

			@Override
			public Operable<Double> setParam(Double e) {
				this.e = e;
				return this;
				
			}
			
		};
		
		System.out.println(op.setParam(1.2d).suma(1.3d));
		System.out.println(op.setParam(1d).suma(3d));
		
		
		Double eExterno = 1.2d;
		Operable<Double> op2 = new Operable<>() {
			
			private Double e = eExterno;
			
			@Override
			public Double suma(Double e) {
				return this.e + e ;
			}

			@Override
			public Double resta(Double e) {
				return this.e - e;
			}

			@Override
			public Double multiplicar(Double e) {
				return this.e * e;
			}

			@Override
			public Double division(Double e) {
				return this.e / e;
			}

			@Override
			public Operable<Double> setParam(Double e) {
				this.e = e;
				return this;
				
			}
			
		};
		
		op2.suma(1.4d);
		
	}
	
	
}
