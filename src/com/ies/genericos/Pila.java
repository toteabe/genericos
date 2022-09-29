package com.ies.genericos;

import java.util.LinkedList;

/**
 * Pila parametrizada sobre LinkedList wrap
 * 
 * @author user
 *
 * @param <T>
 */

public class Pila<T> {

	private LinkedList<T> lista;

	public Pila() {
		this.lista = new LinkedList<>();
	}

	/**
	 * Devuelve si la pila está vacía
	 * 
	 * @return true si pila vacía, falso si pila con algún valor
	 */
	public boolean estaVacia() {
		return lista.isEmpty();
	}

	/**
	 * Devuelve y elimina el primer elemento de la colección.
	 * 
	 * @return primer elemento
	 */
	public T extraer() {
		return lista.poll();
	}

	/**
	 * Devuelve el primer elemento de la colección
	 * 
	 * @return
	 */
	public T primero() {
		return lista.getFirst();
	}

	/**
	 * Añade un objeto por el extremo que corresponda.
	 * 
	 * @param t
	 */
	public void aniadir(T t) {
		lista.push(t);
	}

	public String toString() {
		StringBuffer strBuf = new StringBuffer("Respresentación de Pila");
		
		strBuf.append("<")
			 	.append((lista.size() > 0 ? lista.getFirst().getClass().getSimpleName(): "pila vacía, no puedo decidir T"))
				.append(">\n");
		
		strBuf.append("Resumen: pila con ").append( lista.size()).append(" elementos:\n");
		for (T t : lista) {
			strBuf.append(t).append("\n");
		}
		
		return strBuf.toString();
	}

	public static void main(String[] args) {

		Pila<String> pilaStr = new Pila<>();

		pilaStr.aniadir("UNO");
		pilaStr.aniadir("DOS");
		pilaStr.aniadir("TRES");
		System.out.println(pilaStr);

		System.out.println("Extraigo: " + pilaStr.extraer());
		
		pilaStr.aniadir("CUATRO");
		System.out.println(pilaStr);
	}

}
