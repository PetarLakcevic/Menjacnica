package interfacemenjacnica;

import java.util.GregorianCalendar;

public interface MenjacnicaInterface {
	public void dodajKurs(int sifra, double[] kursevi, GregorianCalendar dan); //proslednjujemo sifru date valute, niz double-ova koji sadrzi prodajni, srednji i kupovni kurs kao i datum
	public void obrisiKurs(int sifra, GregorianCalendar dan);
	public double[] vratiKurs(int sifra, GregorianCalendar dan); //vraca sva 3 kursa u niz double-ova
}
