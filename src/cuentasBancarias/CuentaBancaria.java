package cuentasBancarias;

public class CuentaBancaria {

	private double cant;

	public double mostrar() {
		return this.cant;
	}

	public void depositar(double i) {
		this.cant+=i;
	}

	public void transferirMontohacia(double i, CuentaBancaria dest) {
		dest.cant+=i;
	}

}
