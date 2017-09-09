package cuentasBancarias;

public class CuentaBancaria {

	private double cant;

	public double mostrar() {
		return this.cant;
	}

	public void depositar(double monto) {
		if(monto>0)
		this.cant += monto;
	}

	public boolean transferirMontohacia(double monto, CuentaBancaria dest) {

		if (this.cant >= monto && monto>0) {
			dest.cant += monto;
			this.cant -= monto;
			return true;
		}
		return false;
	}

	public boolean extraer(double monto) {
		if (this.cant >= monto && monto > 0) {
			this.cant -= monto;
			return true;
		}
		return false;

	}

}
