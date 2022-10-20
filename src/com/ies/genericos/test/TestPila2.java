package com.ies.genericos.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.ies.genericos.Pila;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.containsString;
class TestPila2 {

	private Pila pila;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		this.pila = new Pila();
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testPila() {
	
		assertEquals(true, pila instanceof Pila);
	}

	@Test
	void testEstaVacia() {
		assertEquals(true, pila.estaVacia());
		
	}

	@Test
	void testExtraer() {
		fail("Not yet implemented");
	}

	@Test
	void testPrimero() {
		fail("Not yet implemented");
	}

	@Test
	void testAniadir() {
		
		Pila<Integer> pilaInt = new Pila<>();
		pilaInt.aniadir(1);
		assertEquals(false, pilaInt.estaVacia());
		Integer i = pilaInt.primero();
		assertEquals(i, 1);
		pilaInt.aniadir(2);
		System.out.println(pilaInt.toString());
		assertThat(pilaInt.toString(), containsString("2\n1"));
		
	}
	
	@Test
	void testAniadirYExtraer() {
		
		Pila<Integer> pilaInt = new Pila<>();
		pilaInt.aniadir(1);
		assertEquals(false, pilaInt.estaVacia());
		Integer i = pilaInt.primero();
		assertEquals(i, 1);
		pilaInt.aniadir(2);
		pilaInt.extraer();
		System.out.println(pilaInt.toString());
		assertThat(pilaInt.toString(), containsString(":\n1"));
		
	}
	
	@Test
	void testExtraerDePilaVacia() {
		
		Pila<Integer> pilaInt = new Pila<>();
		
		
		assertEquals(null, pilaInt.extraer());
		
	}

	@Test
	void testToString() {
		fail("Not yet implemented");
	}

}
