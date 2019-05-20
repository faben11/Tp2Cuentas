package ar.edu.unlam.pb2.Cuentas;
/*
 Cuenta Corriente
La más compleja de las cuentas, ésta permite establecer una cantidad de dinero a
girar en descubierto. Es por ello que cada vez que se desee extraer dinero, no sólo
se considera el que se posee, sino el límite adicional que el banco estará brindando.
Por supuesto esto no es gratis, ya que el banco nos cobrará un 5% como comisión
sobre todo el monto en descubierto consumido en la operación.
Por ejemplo, si tuviéramos $ 100 en la cuenta, y quisiéramos retirar $ 200 (con un
descubierto de $ 150), podremos hacerlo. Pasaremos a deberle al banco $ 105 en
total: los $ 100 que nos cubrió, más el 5% adicional sobre el descubierto otorgado.
 */
public class CuentaCorriente extends CuentaBancaria {

	public double giroDescubierto = 0;
	// esta variable le pertenece a cada instancia de CuentaCorriente no a la clase
	
	static final double porcentajeComision = 0.05;
	

	public CuentaCorriente(double giro) {
		super();
		setGiroDescubierto(giro);
		
	}

	public void setGiroDescubierto(double giro) {
		giroDescubierto = giro;
	}
	
	
	@Override
	public void extraer(Double monto) {
		
		Double elSaldo = this.getSaldo();
		
		if (tipoDeExtraccion(monto)) {
			if (!(monto > elSaldo)) {
				super.extraer(monto);
			}	
			else {
				double comision =(monto - elSaldo) * porcentajeComision;
				//double comision = saldoDescubierto * porcentajeComision;
				super.extraer(monto+comision);
			}
		}
	}


	@Override
	public Boolean tipoDeExtraccion(Double monto) {
		if (monto <= this.getSaldo() || monto <= (this.getSaldo()+giroDescubierto))
			return true;
		return false;
	}
	
	

}
