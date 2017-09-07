package cuentaBancaria;

import org.junit.Assert;
import org.junit.Test;

import cuentasBancarias.CuentaBancaria;

public class CuentasBancariasTests {

	@Test
	public void queInicializa() {
		CuentaBancaria cuenta1 = new CuentaBancaria();
		Assert.assertEquals(0, cuenta1.mostrar(), 0);
	}

	@Test
	public void queSeLePuedeAgregarDinero() {
		CuentaBancaria cuenta1 = new CuentaBancaria();
		cuenta1.depositar(1000);
		Assert.assertEquals(1000, cuenta1.mostrar(), 0);
	}
	
	@Test
	public void queSePuedeTransferirAOtraCuenta() {
		CuentaBancaria cuenta1 = new CuentaBancaria();
		CuentaBancaria dest = new CuentaBancaria();
		cuenta1.depositar(1000);
		cuenta1.transferirMontohacia(100, dest);
		Assert.assertEquals(100, dest.mostrar(), 0);
		cuenta1.transferirMontohacia(1000, dest);
		Assert.assertEquals(100, dest.mostrar(),0);
		cuenta1.transferirMontohacia(145.3546, dest);
		Assert.assertEquals(245.3546, dest.mostrar(),0.00001);
		
	}
	
	@Test
	public void queSePuedeRetirar(){
		CuentaBancaria cuenta1 = new CuentaBancaria();
		cuenta1.depositar(500);
		cuenta1.extraer(100);
		Assert.assertEquals(400,cuenta1.mostrar(),0);
		cuenta1.extraer(1000);
		Assert.assertEquals(400, cuenta1.mostrar(),0);
		cuenta1.extraer(400);
		Assert.assertEquals(0, cuenta1.mostrar(),0);
	}
}
