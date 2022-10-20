package com.ies.genericos;

public interface Operable<E> {
	
	public E suma(E e);
	public E resta(E e);
	public E multiplicar(E e);
	public E division(E e);
	
	//
	public Operable<E> setParam(E e);
}
