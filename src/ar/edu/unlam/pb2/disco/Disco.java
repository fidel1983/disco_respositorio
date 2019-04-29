package ar.edu.unlam.pb2.disco;
/* Clase disco para calacular radio interior y exterior
*
*/
public class Disco {

	private Double radioInterior;
	private Double radioExterior;

	public Disco(Double radioInterior, Double radioExterior) {

		this.radioInterior = radioInterior;
		this.radioExterior = radioExterior;

	}

	public Double getRadioInterior() {
		return radioInterior;
	}

	public void setRadioInterior(Double radioInterior) {
		this.radioInterior = radioInterior;
	}

	public Double getRadioExterior() {
		return radioExterior;
	}

	public void setRadioExterior(Double radioExterior) {
		this.radioExterior = radioExterior;
	}

	public Double calcularPerimetroInterior() {

		return 2 * Math.PI * this.getRadioInterior();

	}

	public Double calcularPerimetroExterior() {

		return 2 * Math.PI * this.getRadioExterior();

	}

	public Double calcularAreaRadioInterior() {
		return Math.PI * Math.pow(this.getRadioInterior(), 2);
	}

	public Double calcularAreaRadioExterior() {
		return Math.PI * Math.pow(this.getRadioExterior(), 2);
	}

	public Double calcularAreaTotalDisco() {
		return this.calcularAreaRadioExterior() - this.calcularAreaRadioInterior();
	}
}
