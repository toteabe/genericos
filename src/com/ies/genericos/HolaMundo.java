package com.ies.genericos;

import java.lang.annotation.*;  
import java.lang.reflect.*;  

public class HolaMundo {
	
	//Usando la anotación
	@MiAnotacion(valor=100)  
	public void holaMundo(int valor){
		System.out.println("Hola Mundo! " + valor);
		}
	
	public static void main(String[] args) throws NoSuchMethodException, SecurityException {
		
		HolaMundo h = new HolaMundo();
		
		procesarContextoHolaMundo(h);
		
	}
	
	public static void procesarContextoHolaMundo(HolaMundo h) throws NoSuchMethodException, SecurityException {
		
		Method m=h.getClass().getMethod("holaMundo", int.class);  

		MiAnotacion miAnotacion= m.getAnnotation(MiAnotacion.class);  
		System.out.println("valor es: "+miAnotacion.valor());
		
		h.holaMundo(miAnotacion.valor());
		
	}

}
