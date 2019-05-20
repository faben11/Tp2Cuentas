package ar.edu.unlam.pb2.Cuentas;
/*Cuenta Sueldo
Es el tipo de cuenta más simple, ya que se rige por la premisa de que en tanto y en
cuanto se tenga tanto o más dinero en cuenta del que se quiere extraer, la operación
se debe efectuar correctamente.
*/
public class CuentaSueldo extends CuentaBancaria {

	// CONSTRUCTORES DE LA SUPERCLASE
	public CuentaSueldo() {
		super();
	}

	@Override
	public Boolean tipoDeExtraccion(Double monto) {
		if(monto <= this.getSaldo())
			return true;
		else return false;
	}

	@Override
	public void extraer(Double monto) {
		if(tipoDeExtraccion(monto)) {
		super.extraer(monto);
		}
		// si el monto a extraer supera el saldo no deberia extraer nada;
	}
	

	
}
