package fr.voxi.admin;

public class Auteur {
	
	private int numero ; 
	private String nom ; 
	private String prenom ;
	
	public Auteur(int numero, String nom, String prenom) {
		this.numero = numero ;
		this.nom = nom ; 
		this.prenom = prenom ;
	}
	
	public int getNumero() {
		return numero;
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public String getNom() {
		return nom;
	}
	
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public String getPrenom() {
		return prenom;
	}
	
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String toString() {
		return "Auteur [numero = " + numero + ", nom = " + nom + ", prenom = " + prenom + "]";
	}
	
	
	
}
