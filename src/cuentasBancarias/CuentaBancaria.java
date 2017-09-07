package cuentasBancarias;

public class CuentaBancaria {

	private double cant;

	public double mostrar() {
		return this.cant;
	}

	public void depositar(double monto) {
		this.cant += monto;
	}

	public void transferirMontohacia(double monto, CuentaBancaria dest) {

		if (this.cant >= monto) {
			dest.cant += monto;
			this.cant -= monto;
		}
	}

}
