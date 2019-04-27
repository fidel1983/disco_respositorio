package ar.edu.unlam.pb2.disco;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class TestDisco {

	@Test
	public void testCalcularPerimetroInterior() {

		Disco d1 = new Disco(3.0, 5.0);
		Double perimetroInterior = d1.calcularPerimetroInterior();
		Double expected = 18.84955592153875943077586029967;
		Assert.assertEquals(expected, perimetroInterior);

	}

	@Test
	public void testCalcularPerimetroExterior() {

		Disco d1 = new Disco(3.0, 5.0);
		Double perimetroExterior = d1.calcularPerimetroExterior();
		Double expected = 31.415926535897932384626433832795;
		Assert.assertEquals(expected, perimetroExterior);

	}

	@Test
	public void testCalcularAreaRadioInterior() {

		Disco d1 = new Disco(3.0, 5.0);
		Double areaRadioInterior = d1.calcularAreaRadioInterior();
		Double expected = 28.274333882308139146163790449516;
		Assert.assertEquals(expected, areaRadioInterior);

	}
	
	@Test
	public void testCalcularAreaRadioExterior() {

		Disco d1 = new Disco(3.0, 5.0);
		Double areaRadioExterior = d1.calcularAreaRadioExterior();
		Double expected = 78.539816339744830961566084581988;
		Assert.assertEquals(expected, areaRadioExterior);

	}
	
	@Test
	public void testCalcularAreaTotalDisco() {
		
		Disco d1 = new Disco(3.0,5.0);
		Double areaTotal = d1.calcularAreaRadioExterior()-d1.calcularAreaRadioInterior();
		Double expected = 50.265482457436691815402294132472;
		Assert.assertEquals(expected, areaTotal);
	}

}
