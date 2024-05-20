package fr.voxi.admin;

public class AudioBook {
	private int numero ; 
	private String langue ; 
	private Oeuvre oeuvre ; 
	
	public AudioBook(int numero, String langue, Oeuvre oeuvre) {
		this.numero = numero ;
		this.langue = langue ; 
		this.oeuvre = oeuvre ; 
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getLangue() {
		return langue;
	}

	public void setLangue(String langue) {
		this.langue = langue;
	}

	public Oeuvre getOeuvre() {
		return oeuvre;
	}

	public void setOeuvre(Oeuvre oeuvre) {
		this.oeuvre = oeuvre;
	}

	public String toString() {
		return "AudioBook [numero = " + numero + ", langue = " + langue + ", oeuvre = " + oeuvre + "]";
	}
	
	
	
	

}
