package interfacemenjacnica;

import java.util.GregorianCalendar;

import menjacnica.Valuta;

public interface MenjacnicaInterface {
	public void dodajKurs(int sifra, String ime, String skracenica, double[] kursevi, GregorianCalendar dan); //proslednjujemo sifru date valute, naziv i skr., niz double-ova koji sadrzi prodajni, srednji i kupovni kurs kao i datum
	public void obrisiKurs(int sifra, GregorianCalendar dan); //mogao sam da stavim i Valuta V kao parametar pa da proveravam sa equals, ali mozda ste ovako zamislili
	public double[] vratiKurs(String skracenica, GregorianCalendar dan); //vraca sva 3 kursa u niz double-ova
}
