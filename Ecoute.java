package fr.voxi.admin;

import java.time.LocalDate;

public class Ecoute {
	private int numero ;
	private LocalDate date ;
	private AudioBook audioBook ; 
	
	public Ecoute(int numero, LocalDate date, AudioBook audioBook) {
		this.numero = numero ; 
		this.date = date ;
		this.audioBook = audioBook ;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public AudioBook getAudioBook() {
		return audioBook;
	}

	public void setAudioBook(AudioBook audioBook) {
		this.audioBook = audioBook;
	}

	public String toString() {
		return "Ecoute [numero = " + numero + ", date = " + date + ", audioBook = " + audioBook + "]";
	}
	
	
	
	
}
