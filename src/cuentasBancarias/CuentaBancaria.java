package cuentasBancarias;

public class CuentaBancaria {

	private double cant;

	public double mostrar() {
		return this.cant;
	}

	public void depositar(double monto) {
		this.cant += monto;
	}

	public boolean transferirMontohacia(double monto, CuentaBancaria dest) {

		if (this.cant >= monto) {
			dest.cant += monto;
			this.cant -= monto;
			return true;
		}
		return false;
	}

	public boolean extraer(double monto) {
		if (this.cant >= monto) {
			this.cant -= monto;
			return true;
		}
		return false;

	}

}
