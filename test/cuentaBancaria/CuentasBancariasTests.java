package cuentaBancaria;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import cuentasBancarias.CuentaBancaria;

public class CuentasBancariasTests {
	
	CuentaBancaria cuenta1;
	
	@Before
	public void setUp(){
		cuenta1=new CuentaBancaria(123,"pesos");
	}
	
	@Test
	public void queInicializa() {
		Assert.assertEquals(0, cuenta1.mostrarsaldo(), 0);
	}

	@Test
	public void queSeLePuedeAgregarDinero() {
		Assert.assertEquals(true, cuenta1.depositar(1000,"pesos"));
		Assert.assertEquals(false, cuenta1.depositar(-100,"pesos"));
		Assert.assertEquals(false, cuenta1.depositar(50,"dolares"));
	}
	
	@Test
	public void queSePuedeTransferirAOtraCuenta() {
		CuentaBancaria dest = new CuentaBancaria(456,"pesos");
		cuenta1.depositar(1000,"pesos");
		Assert.assertEquals(true,cuenta1.transferirMontohacia(100, dest) );
		Assert.assertEquals(false, cuenta1.transferirMontohacia(1000, dest));
		Assert.assertEquals(true, cuenta1.transferirMontohacia(145.3546, dest));
		Assert.assertEquals(false, cuenta1.transferirMontohacia(-100, dest));
		Assert.assertEquals(true, cuenta1.transferirMontohacia(900-145.3546, dest));
		cuenta1.depositar(1000,"pesos");
		Assert.assertEquals(false, cuenta1.transferirMontohacia(500, cuenta1));
		CuentaBancaria cuentaDolares=new CuentaBancaria(789,"dolares");
		Assert.assertEquals(false, cuenta1.transferirMontohacia(100, cuentaDolares));
		
	}
	
	@Test
	public void queSePuedeRetirar(){
		cuenta1.depositar(500,"pesos");
		Assert.assertEquals(true,cuenta1.extraer(100));
		Assert.assertEquals(false, cuenta1.extraer(1000));
		Assert.assertEquals(true, cuenta1.extraer(400));
		Assert.assertEquals(false,cuenta1.extraer(-100));
	}
}
