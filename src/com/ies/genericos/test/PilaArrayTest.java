package com.ies.genericos.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.ies.genericos.IPila;
import com.ies.genericos.PilaArray;

class PilaArrayTest {

	@DisplayName("Test estaVacia")
	@Test
	void testEstaVacia() {
		
		IPila<Integer> pilaArr = new PilaArray<Integer>();
		assertEquals(pilaArr.estaVacia(), true); 
		
	}
	
	@DisplayName("Test no estaVacia")
	@Test
	void testNoEstaVacia() {
		
		IPila<Integer> pilaArr = new PilaArray<Integer>();
		pilaArr.aniadir(1);
		assertEquals(pilaArr.estaVacia(), false); 
		
	}
 
	@DisplayName("Test aniadir 1, primero")
	@Test
	void testAniadir() {
		
		IPila<Integer> pilaArr = new PilaArray<Integer>();
		pilaArr.aniadir(1);
		assertEquals(pilaArr.primero(), 1);
		
	}
	
}
