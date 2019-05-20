package ar.edu.unlam.pb2.Cuentas;

import org.junit.Assert;
import org.junit.Test;

public class CajaDeAhorroTest {


	@Test
	public void testExtraer5Veces() {
		CajaDeAhorro miCaja = new CajaDeAhorro();
		CajaDeAhorro miCajita = new CajaDeAhorro();
		miCaja.depositar(1000d);
		miCaja.extraer(100d);
		miCaja.extraer(100d);
		miCaja.extraer(100d);
		miCaja.extraer(100d);
		//miCaja.extraer(100d);
		//A partir de la 5ta extraccion, me cobra 6+ por cada una
		miCajita.depositar(100d);
		miCajita.extraer(50d);
		Double saldoEsperado = miCaja.getSaldo();
		Assert.assertEquals(saldoEsperado, 600d, 0.1);
	}

	

	@Test
	public void testCajaDeAhorro() {
		CajaDeAhorro miCaja = new CajaDeAhorro();
		miCaja.depositar(500d);
		miCaja.extraer(200d);
		//miCaja.extraer(500d);
		Double saldoObtenido = miCaja.getSaldo();
		Double saldoEsperado = 300d;
		
		Assert.assertEquals(saldoEsperado, saldoObtenido,0.1);
	}

	
	@Test
	public void testTipoDeExtraccion() {
		CajaDeAhorro miCaja = new CajaDeAhorro();
		miCaja.depositar(400d);
		Boolean esperado = false;
		Boolean obtenido = miCaja.tipoDeExtraccion(500d);
		Assert.assertEquals(esperado,obtenido);
	}
}
