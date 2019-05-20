package ar.edu.unlam.pb2.Cuentas;
/*Tipos de cuentas
Vamos a establecer, para el contexto de este ejercicio, tres tipos de cuentas: la Cuenta
Sueldo, la Caja de Ahorros y la Cuenta Corriente. Cada una cumple con ciertas reglas de
negocio, las cuales se detallan a continuación.

Se pide implementar una solución que permita utilizar los tres tipos de cuentas. Para ello
deberás emplear los conceptos de herencia y encapsulamiento. Aquí un ejemplo de cómo
debería funcionar:
CuentaSueldo cuenta = new CuentaSueldo();
cuenta.depositar(4000.0);
Double saldo = cuenta.getSaldo();
// saldo debe valer 4000.0
cuenta.extraer(500.0);
saldo = cuenta.getSaldo();
// saldo debe valer 3500.0
cuenta.extraer(4000.0);
// la operación no debe poder realizarse
// y debe lanzar una excepción (RuntimeException) – tema a desarrollar 12Jun17
Y así con cada tipo de cuenta. Considerar los recargos establecidos por la consigna.
*/

public abstract class CuentaBancaria {
	
	private Double saldo;
	
	// CONSTRUCTOR
	public CuentaBancaria() {
		this.saldo=0d; //**hay que inicializar la variable siempre;
	}

	// METODOS 
	public Double getSaldo() {
		return this.saldo;
	}
	
	public void depositar(Double monto) {
		if(validarMonto(monto))	
		saldo+=monto;
	}
	
	public void extraer(Double monto) {
		if(validarMonto(monto))
		saldo-= monto;
	}
	
	public abstract Boolean tipoDeExtraccion(Double monto);
	
	public boolean validarMonto(Double monto) {
		if(monto>0) 
			return true;
		else return false;
	}
}
