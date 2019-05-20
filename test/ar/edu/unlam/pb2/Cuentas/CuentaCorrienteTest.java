package ar.edu.unlam.pb2.Cuentas;

import org.junit.Assert;
import org.junit.Test;

public class CuentaCorrienteTest {

	@Test
	public void testExtraer() {
		CuentaCorriente miCorriente = new CuentaCorriente(200d);
		miCorriente.depositar(200d);
		miCorriente.extraer(400d);
		//miCorriente.depositar(100d);
		Double esperado = -210d;
		Assert.assertEquals(esperado, miCorriente.getSaldo(),0.1);
	}

	@Test
	public void testTipoDeExtraccion() {
		CuentaCorriente miCorriente = new CuentaCorriente(200d);
		miCorriente.depositar(500d);
		//miCorriente.extraer(900d);
		Boolean esperado = false;
		Assert.assertEquals(esperado, miCorriente.tipoDeExtraccion(900d));
	}

	@Test
	public void testCuentaCorriente() {
		CuentaCorriente miCorriente = new CuentaCorriente(200d);
		miCorriente.depositar(100d);
		miCorriente.extraer(100d);
		Double esperado = 0d;
		Assert.assertEquals(esperado, miCorriente.getSaldo(),0.1);
	}

}
