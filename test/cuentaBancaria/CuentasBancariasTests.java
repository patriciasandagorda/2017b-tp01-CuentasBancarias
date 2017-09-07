package cuentaBancaria;

import org.junit.Assert;
import org.junit.Test;

import cuentasBancarias.CuentaBancaria;

public class CuentasBancariasTests {
	
	@Test
	public void queInicializa(){
		CuentaBancaria cuenta1=new CuentaBancaria();
		Assert.assertEquals(0, cuenta1.mostrar(),0);
	}
	
	@Test
	public void queSeLePuedeAgregarDinero(){
	CuentaBancaria cuenta1=new CuentaBancaria();
	cuenta1.depositar(1000);
	Assert.assertEquals(1000, cuenta1.mostrar(),0);

	}
}
