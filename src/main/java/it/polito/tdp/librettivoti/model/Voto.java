package it.polito.tdp.librettivoti.model;

import java.time.LocalDate;

/**
 * 
 * Memorizza il risultato di un esame singolo
 * @author Utente
 *
 */
public class Voto {
	@Override
	public String toString() {
		return "Esame " + nome + " superato con " + voto + " il " + data;
	}

	private String nome;
	private int voto;//30L?
	private LocalDate data; //data superamento esame
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getVoto() {
		return voto;
	}

	public void setVoto(int voto) {
		this.voto = voto;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	protected Voto(String nome, int voto, LocalDate data) {
		
		this.nome = nome;
		this.voto = voto;
		this.data = data;
	}

	
}
