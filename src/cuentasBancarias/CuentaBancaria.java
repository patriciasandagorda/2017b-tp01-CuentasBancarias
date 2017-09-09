package cuentasBancarias;

public class CuentaBancaria {

	private double saldo;
	public int nroCuenta;
	public String moneda;

	public CuentaBancaria(int nroCuenta, String moneda) {
		this.nroCuenta = nroCuenta;
		this.saldo = 0;
		this.moneda = moneda;
	}

	public double mostrarsaldo() {
		return this.saldo;
	}

	public boolean depositar(double monto) {
		if (monto > 0) {
			this.saldo += monto;
			return true;
		}
		return false;
	}

	public boolean transferirMontohacia(double monto, CuentaBancaria dest) {

		if (this.saldo >= monto && monto > 0 && this.nroCuenta != dest.nroCuenta && this.moneda==dest.moneda) {
			dest.saldo += monto;
			this.saldo -= monto;
			return true;
		}
		return false;
	}

	public boolean extraer(double monto) {
		if (this.saldo >= monto && monto > 0) {
			this.saldo -= monto;
			return true;
		}
		return false;

	}

}
