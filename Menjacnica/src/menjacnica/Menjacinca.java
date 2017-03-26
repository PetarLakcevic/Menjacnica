package menjacnica;

import java.util.GregorianCalendar;
import java.util.LinkedList;

import interfacemenjacnica.MenjacnicaInterface;

public class Menjacinca implements MenjacnicaInterface {
	LinkedList<Valuta> kurseviLista = new LinkedList<Valuta>();

	@Override
	public void dodajKurs(int sifra, String ime, String skracenica, double[] kursevi, GregorianCalendar dan) {
		if (sifra==0||ime==null||skracenica==null||kursevi.length!=2||dan==null) {
			throw new RuntimeException("Greska!");
		}
		Valuta v = new Valuta();
		v.setDan(dan);
		v.setKupovni(kursevi[0]);
		v.setSrednji(kursevi[1]);
		v.setProdajni(kursevi[2]);
		v.setNaziv(ime);
		v.setSkracenica(skracenica);
		v.setSifra(sifra);
		kurseviLista.add(v);
	}
	@Override
	public void obrisiKurs(int sifra, GregorianCalendar dan) {

		if (kurseviLista.isEmpty()) {
			System.out.println("LISTA JE PRAZNA!");
			return;
		}
		for (int i = 0; i < kurseviLista.size(); i++) {
			if (kurseviLista.get(i).getDan() == dan && kurseviLista.get(i).getSifra() == sifra) {
				kurseviLista.remove(i);
			}
		}
	}
	@Override
	public double[] vratiKurs(String skracenica, GregorianCalendar dan) {
		double niz[] = new double[2];
		if (kurseviLista.isEmpty()) {
			throw new RuntimeException("Lista je prazna!");
		}
		for (int i = 0; i < kurseviLista.size(); i++) {
			if (kurseviLista.get(i).getSkracenica().equals(skracenica) && kurseviLista.get(i).getDan().equals(dan)) {
				niz[0] = kurseviLista.get(i).getKupovni();
				niz[1] = kurseviLista.get(i).getSrednji();
				niz[2] = kurseviLista.get(i).getProdajni();
				break;
			}
		}
		return niz;
	}
}
