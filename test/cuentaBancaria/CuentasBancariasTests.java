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

}
