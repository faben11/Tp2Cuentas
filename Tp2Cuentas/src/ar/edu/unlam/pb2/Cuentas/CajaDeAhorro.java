package ar.edu.unlam.pb2.Cuentas;
/*Caja de Ahorros
Similar a la anterior, pero se pide que luego de la quinta extracción de dinero se
cobre un costo adicional por extracción de $ 6*/

public class CajaDeAhorro extends CuentaBancaria{

	private final double costoAdicional = 6d;
	private static int contadorExtracciones = 0;
	
	public CajaDeAhorro() {
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
			if(contadorExtracciones<5) {
				super.extraer(monto);
				contadorExtracciones++;
			}
			else {
				super.extraer(monto + costoAdicional);
				contadorExtracciones++;
			}
		}
	}

	
}
