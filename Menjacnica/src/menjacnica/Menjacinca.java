package menjacnica;

import java.util.GregorianCalendar;
import java.util.LinkedList;

import interfacemenjacnica.MenjacnicaInterface;

public class Menjacinca implements MenjacnicaInterface {
	LinkedList<Valuta> kurseviLista = new LinkedList<Valuta>();

	@Override
	public void dodajKurs(int sifra, String ime, String skracenica, double[] kursevi, GregorianCalendar dan) {
		if (sifra == 0 || kursevi.length != 2 || dan == null) {
			throw new RuntimeException("Greska pri unosu!");
		}
		Valuta v = new Valuta();
		v.setNaziv(ime);
		v.setSifra(sifra);
		v.setSkracenica(skracenica);
		v.setKupovni(kursevi[0]);
		v.setSrednji(kursevi[1]);
		v.setProdajni(kursevi[2]);
		v.setDan(dan);
		kurseviLista.add(v);
	}

	@Override
	public void obrisiKurs(int sifra, GregorianCalendar dan) {
		for (int i = 0; i < kurseviLista.size(); i++) {
			if (kurseviLista.get(i).getDan() == dan && kurseviLista.get(i).getSifra() == sifra) {
				kurseviLista.remove(i);
			}
		}

	}
	@Override
	public double[] vratiKurs(String skracenica, GregorianCalendar dan) {
		double niz[] = new double[2];
	
		for (int i = 0; i < kurseviLista.size(); i++) {
			if (kurseviLista.get(i).getDan() == dan && kurseviLista.get(i).getSkracenica().equals(skracenica)) {
				niz[0] = kurseviLista.get(i).getProdajni();
				niz[1] = kurseviLista.get(i).getSrednji();
				niz[2] = kurseviLista.get(i).getKupovni();
				break;
			}
		
		}
		return niz;
	}
}
