package com.ies.genericos;

import java.util.Arrays;

public class PilaArray<T> implements IPila<T> {
	
	private T[] arr; 
	private int n;

	public PilaArray() {
		this.arr = (T[])new Object[0];
	}
	
	@Override
	public boolean estaVacia() {
		return n == 0;
	}

	@Override
	public T extraer() {
		if (n > 0) {
			T t = arr[n-1];
			arr = Arrays.copyOf(arr, --n); // n = n -1
			return t;
		} 
		return null;
	}

	@Override
	public T primero() {
		if ( n > 0) {
			return arr[n-1];
		}
		return null;
	}

	@Override
	public void aniadir(T t) {
		arr = Arrays.copyOf(arr, n+1);
		arr[n++] = t;
	}

}
