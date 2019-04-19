package Konverter;

public class Konverter {

	double kilogram;
	double funta;
	double centimetar;
	double inc;
	double celzijus;
	double farenhajt;

	public double getKilogram() {
		return kilogram;
	}

	public void setKilogram(double kilogram) {
		this.kilogram = kilogram;
	}

	public double getFunta() {
		return funta;
	}

	public void setFunta(double funta) {
		this.funta = funta;
	}

	public double getCentimetar() {
		return centimetar;
	}

	public void setCentimetar(double centimetar) {
		this.centimetar = centimetar;
	}

	public double getInc() {
		return inc;
	}

	public void setInc(double inc) {
		this.inc = inc;
	}

	public double getCelzijus() {
		return celzijus;
	}

	public void setCelzijus(double celzijus) {
		this.celzijus = celzijus;
	}

	public double getFarenhajt() {
		return farenhajt;
	}

	public void setFarenhajt(double farenhajt) {
		this.farenhajt = farenhajt;
	}

	Konverter() {

	}

	public void izKilogramaUFunte() {

		funta = kilogram * 2.2046;
		System.out.println(funta + " funti.");

	}

	public void izFunteUKilogram() {

		kilogram = funta / 2.2046;
		System.out.println(kilogram + " kilograma.");

	}

	public void izCentimetaraUInce() {

		inc = centimetar * 0.39370;
		System.out.println(inc + " inci.");

	}

	public void izIncaUCentimetre() {

		centimetar = inc / 0.39370;
		System.out.println(centimetar + " centimetara.");

	}

	public void izCelzijusaUFarenhajte() {

		farenhajt = (celzijus * 1.8000) + 32;
		System.out.println(farenhajt + " farenhajti.");

	}

	public void izFarenhajtiUCelzijuse() {

		celzijus = (farenhajt - 32) / 1.8000;
		System.out.println(celzijus + " celzijusa.");

	}

}
