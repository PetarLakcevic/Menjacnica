package menjacnica;

import java.util.GregorianCalendar;

public class Valuta {

	private GregorianCalendar dan;
	private int sifra;
	private String naziv;
	private String skracenica;
	private double kupovni, srednji, prodajni;

	public GregorianCalendar getDan() {
		return dan;
	}

	public void setDan(GregorianCalendar dan) {
		if (dan == null)
			throw new RuntimeException("Null dan.");
		this.dan = dan;
	}

	public int getSifra() {
		return sifra;
	}

	public void setSifra(int sifra) {
		if (sifra == 0)
			throw new RuntimeException("Sifra ne moze biti 0");
		this.sifra = sifra;
	}

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		if (naziv.equals(null))
			throw new RuntimeException("Naziv ne sme biti null");
		this.naziv = naziv;
	}

	public String getSkracenica() {
		return skracenica;
	}

	public void setSkracenica(String skracenica) {
		if (skracenica.equals(null))
			throw new RuntimeException("Skracenica ne sme biti null");
		this.skracenica = skracenica;
	}

	public double getKupovni() {
		return kupovni;
	}

	public void setKupovni(double kupovni) {
		if (kupovni <= 0) {
			throw new RuntimeException("Kurs mora biti pozitivan!");
		}
		this.kupovni = kupovni;
	}

	public double getSrednji() {
		return srednji;
	}

	public void setSrednji(double srednji) {
		if (srednji <= 0) {
			throw new RuntimeException("Kurs mora biti pozitivan!");
		}
		this.srednji = srednji;
	}

	public double getProdajni() {
		return prodajni;
	}

	public void setProdajni(double prodajni) {
		if (prodajni <= 0) {
			throw new RuntimeException("Kurs mora biti pozitivan!");
		}
		this.prodajni = prodajni;
	}

	@Override
	public String toString() {
		return "Sifra: " + getSifra() + "\n + Skraceno: " + getSkracenica() + "\n Kupovni kurs: " + getKupovni()
				+ "\n Srednji kurs: " + getSrednji() + "\n Prodajni kurs: " + getProdajni();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(kupovni);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((naziv == null) ? 0 : naziv.hashCode());
		temp = Double.doubleToLongBits(prodajni);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + sifra;
		result = prime * result + ((skracenica == null) ? 0 : skracenica.hashCode());
		temp = Double.doubleToLongBits(srednji);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof Valuta)) {
			return false;
		}
		Valuta nov = (Valuta) obj;
		if (getSifra() == nov.getSifra() && getSkracenica() == nov.getSkracenica() && getDan() == nov.getDan()) {
			return true;
		}
		return false;
	}

}