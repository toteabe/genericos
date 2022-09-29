package com.ies.genericos;

public interface IPila<T> {
	
	public boolean estaVacia();

	/**
	 * Devuelve y elimina el primer elemento de la colección.
	 * 
	 * @return primer elemento
	 */
	public T extraer();

	/**
	 * Devuelve el primer elemento de la colección
	 * 
	 * @return
	 */
	public T primero();

	/**
	 * Añade un objeto por el extremo que corresponda.
	 * 
	 * @param t
	 */
	public void aniadir(T t);


}
