package interfacemenjacnica;

import java.util.GregorianCalendar;

public interface MenjacnicaInterface {
	public void dodajKurs(int sifra, double[] kursevi, GregorianCalendar dan);
	public void obrisiKurs(int sifra, GregorianCalendar dan);
	public double[] vratiKurs(int sifra, GregorianCalendar dan);
}
