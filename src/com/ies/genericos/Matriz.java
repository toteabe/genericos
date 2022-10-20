package com.ies.genericos;

/**
 * 
 * @author usuario
 *
 * @param <T>
 */

public class Matriz<T> {

	private T[][] matriz;
	Integer.valueOf
	public Matriz(int numFila, int numCol) {
		this.matriz = (T[][])new Object[numFila][numCol];
	
	}
	
	public void set(int fila, int col, T t) {
		matriz[fila][col] = t;
	}
	
	public T get(int fila, int col) {
		return matriz[fila][col];
	}

	
	
	
	
}
