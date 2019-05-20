package ar.edu.unlam.pb2.Cuentas;

import org.junit.Assert;
import org.junit.Test;

public class TestCuentaSueldo {

	@Test
	
	public void testMetodosDeCSueldo () {
		
		CuentaSueldo miCuentaSueldo = new CuentaSueldo();
		miCuentaSueldo.depositar(500.0);
		miCuentaSueldo.depositar(-100.0);
		miCuentaSueldo.extraer(400d);
		//miCuentaSueldo.extraer(200d);
		// superando con la extracion el saldo tira la RuntimeException
		Double miSaldo = miCuentaSueldo.getSaldo();
		Double esperado = 100d;
		Assert.assertEquals(miSaldo,esperado, 0.1);
		
	}
	
	@Test
	
	public void testExtraccion () {
		
		CuentaSueldo miCuentaSueldo1 = new CuentaSueldo();
		miCuentaSueldo1.depositar(200d);
		Boolean esperado = false;
		Boolean obtenido = miCuentaSueldo1.tipoDeExtraccion(300d);
		
		Assert.assertEquals(esperado, obtenido );
	}
}
