package menjacnica;

public class Valuta {

	private int sifra;
	private String naziv;
	private String skracenica;
	private double kupovni, srednji, prodajni;

	public int getSifra() {
		return sifra;
	}

	public void setSifra(int sifra) {
		this.sifra = sifra;
	}

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	public String getSkracenica() {
		return skracenica;
	}

	public void setSkracenica(String skracenica) {
		this.skracenica = skracenica;
	}

	public double getKupovni() {
		return kupovni;
	}

	public void setKupovni(double kupovni) {
		this.kupovni = kupovni;
	}

	public double getSrednji() {
		return srednji;
	}

	public void setSrednji(double srednji) {
		this.srednji = srednji;
	}

	public double getProdajni() {
		return prodajni;
	}

	public void setProdajni(double prodajni) {
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
		if (getSifra() == nov.getSifra() && getSkracenica() == nov.getSkracenica()) {
			return true;
		}
		return false;
	}

}