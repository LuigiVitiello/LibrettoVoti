package it.polito.tdp.librettivoti.model;

import java.util.ArrayList;
import java.util.List;

public class Libretto {
	
	private List<Voto>voti;
	
	public Libretto(){
		this.voti = new ArrayList<Voto>();
	}
	
	public void add(Voto v) {
		this.voti.add(v);
	}
	/*
	public void stampaVotiUguali(int punteggio) {
		//libretto stampa da solo i voti
	}
	
	//o 
	
	public String votiUguali(int punteggio) {
		//calcola una str che contiene i voti
		// sarà poi il chiamante a stamparli
		
	}
	*/
	public List<Voto> listaVotiUguali(int punteggio){
		//restituisce solo i voti uguali al criterio
		List<Voto> risultato = new ArrayList<>();
		for(Voto v:this.voti)
		{
			if(v.getVoto()==punteggio){
				risultato.add(v);
			}
		}
		return risultato;
		
	}
	//Migliore di tutti:
	
	public Libretto votiUguali(int punteggio) {
		Libretto risultato = new Libretto();
		for(Voto v : this.voti)
		{
			if(v.getVoto()==punteggio)
			{
				risultato.add(v);
			}
		}
		return risultato;
		
	}
	/**
	 * Ricerca un voto del corso di cui è specificato il nome
	 * se il corso non esiste,restituisce null
	 * @param nomeCorso
	 * @return
	 */
	public Voto ricercaCorso(String nomeCorso) {
		Voto risultato = null;
		for(Voto v: this.voti) {
			if(v.getNome().equals(nomeCorso)) {
				risultato = v;	
				break;
			}
		}
		return risultato;
	}
	public String toString() {
		String s ="";
		for(Voto v:this.voti) {
			s = s + v.toString()+ "\n";
		}
		return s;
		
	}

}
