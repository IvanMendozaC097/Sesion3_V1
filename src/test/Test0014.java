package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import pkg.Cuenta;

class Test0014 {
	static Cuenta cta12345;
	static Cuenta cta67890;


	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		cta12345 = new Cuenta(50, "12345", "Ivan");
		cta67890 = new Cuenta(0, "67890", "Ivan");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testCta12345() {
		cta12345.retirar(200);
		cta12345.ingresar(100);
		cta12345.retirar(200);
		assertEquals(-250, cta12345.saldoFinal()); 
	}
	
	@Test
	void testCta67890() {
		System.out.println("-------------------------------------");
		cta67890.retirar(350);
		cta67890.retirar(200);
		cta67890.ingresar(50);
		assertEquals(-450, cta67890.saldoFinal());
	}

}
