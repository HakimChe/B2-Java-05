package fr.voxi.admin;

import java.time.LocalDate ;
import java.util.ArrayList ;

public class AppAdmin {
	public static void main(String[] args) {
		
		Auteur aut115 = new Auteur(115, "SAND", "Georges") ; 
		System.out.println("2 - "+aut115.toString()) ;
		System.out.println("3 - "+ aut115.getNom()) ;
		
		Oeuvre oeuv35 = new Oeuvre(35, "Indiana", aut115) ; 
		System.out.println("5 - " +oeuv35.toString()) ;
		System.out.println("6 - " +oeuv35.getTitre()) ;
		System.out.println("7- " +oeuv35.getAuteur()) ;
		System.out.println("8 - " +oeuv35.getAuteur().getNom()) ;
		
		AudioBook audio235 = new AudioBook(235, "Français", oeuv35) ; 
		System.out.println("10 - " +audio235.toString()) ;
		System.out.println("11 - " +audio235.getOeuvre()) ;
		System.out.println("12 - " +audio235.getOeuvre().getTitre()) ;
		System.out.println("13 - " +audio235.getOeuvre().getAuteur()) ;
		System.out.println("14 - " +audio235.getOeuvre().getAuteur().getNom()) ;
		
		ArrayList<Auteur> auteurs = new ArrayList<Auteur>() ; 
		auteurs.add(new Auteur(111, "DUMAS", "Alexandre")) ;
		auteurs.add(new Auteur(112, "CAMUS", "Albert")) ;
		auteurs.add(new Auteur(113, "BARJAVEL", "René")) ;
		auteurs.add(new Auteur(114, "MAUPASSANT", "Guy")) ;
		auteurs.add(aut115) ;
		
		System.out.println("----------- 16 ------------ ") ;
		for(int i = 0 ; i < auteurs.size(); i = i + 1) {
			System.out.println(auteurs.get( i ).getNom()) ;
		}
		
		System.out.println("17 - Nom : " + auteurs.get(3).getNom() + " Prenom : " + auteurs.get(3).getPrenom());
				
		ArrayList<Oeuvre> oeuvres = new ArrayList<Oeuvre>() ;
		oeuvres.add(new Oeuvre(28, "La Reine Margot", auteurs.get(0) )  ) ; 
		oeuvres.add(new Oeuvre(31, "Bel Ami", auteurs.get(4))) ;
		oeuvres.add(new Oeuvre(32, "Chanson de Roland")) ;
		oeuvres.add(new Oeuvre(33, "Pauline", auteurs.get(0))) ;
		oeuvres.add(oeuv35) ;
		
		int cpt = 0 ; 
		for(int i = 0 ; i < oeuvres.size() ; i = i + 1 ) {
			if (oeuvres.get(i).getAuteur() == null) {
				cpt += 1 ;  
			} 
		}
		System.out.println("19 - Le nombre d'oeuvres dont l'auteur est inconnu est de " + cpt + "." );
		
		System.out.println("----------- 20 ------------ ") ;
		for(int i = 0 ; i < oeuvres.size() ; i = i + 1 ) {
			if (oeuvres.get(i).getAuteur() == null) {
				System.out.println(oeuvres.get(i).getTitre() + ", le nom de l'auteur est inconnu.");  
			}
			else {
				System.out.println(oeuvres.get( i ).getTitre() + ", " + oeuvres.get(i).getAuteur().getNom() + " "+ oeuvres.get(i).getAuteur().getPrenom() ) ;
			}
		}
		
		System.out.println("----------- 21 ------------ ") ;
		int nb_oeuvre = 0 ; 
		for(int i = 0 ; i < oeuvres.size() ; i = i + 1 ) {
			if (oeuvres.get(i).getAuteur() == auteurs.get(0)) {
				nb_oeuvre += 1 ;  
			} 
		}
		System.out.println("Le nombre d'oeuvres d'Alexandre DUMAS est " + nb_oeuvre + ".") ;
		
		ArrayList<AudioBook> audios = new ArrayList<AudioBook>() ;
		audios.add( new AudioBook(223, "Français", oeuvres.get(2)));
		audios.add( new AudioBook(224, "Anglais", oeuvres.get(0)));
		audios.add( new AudioBook(225, "Français", oeuvres.get(0)));
		audios.add( new AudioBook(228, "Anglais", oeuvres.get(3)));
		audios.add( new AudioBook(229, "Français", oeuvres.get(1)));
		audios.add(audio235);
		
		System.out.println("----------- 23 ------------ ") ;
		for(int i = 0 ; i < audios.size() ; i += 1){
			System.out.println(audios.get(i).getOeuvre().getAuteur());
		}
		
		System.out.println("----------- 24 ------------ ") ;
		int nb_audio = 0 ;
		for(int i = 0 ; i < audios.size() ; i += 1){
			if ( audios.get(i).getOeuvre().getAuteur() == auteurs.get(2)){
				nb_audio += 1 ; 
			}
		}
		System.out.println("Le nombre d'audio-books dont font l'objet les oeuvres de René Barjavel est de " + nb_audio + ".");
		
		ArrayList<Ecoute> ecoutes = new ArrayList<Ecoute>() ;
		ecoutes.add( new Ecoute(503, LocalDate.of(2021, 02, 28), audios.get(1))) ; 
		ecoutes.add( new Ecoute(504, LocalDate.of(2021, 02, 27), audios.get(2))) ;
		ecoutes.add( new Ecoute(505, LocalDate.of(2021, 02, 27), audios.get(1))) ;
		ecoutes.add( new Ecoute(510, LocalDate.of(2021, 02, 27), audios.get(4))) ;
		ecoutes.add( new Ecoute(511, LocalDate.of(2021, 03, 01), audios.get(3))) ;
		
		System.out.println("----------- 26 ------------ ") ;
		System.out.println("Le numero de la dernière écoute est " + ecoutes.get(4).getNumero() + ".") ;
		
		System.out.println("----------- 27 ------------ ") ;
		for(int i = 0 ; i < ecoutes.size() ; i += 1){
			if(ecoutes.get(i).getAudioBook().getOeuvre().getAuteur() == null) {
				System.out.println("L'oeuvre ne possède pas d'auteur.");
			}
			else {
				System.out.println("Nom : " + ecoutes.get(i).getAudioBook().getOeuvre().getAuteur().getNom() + " Prenom : " + ecoutes.get(i).getAudioBook().getOeuvre().getAuteur().getPrenom());
			}
		}
		
		System.out.println("----------- 28 ------------ ") ;
		int nb_ecoute_v_anglaise = 0 ; 
		for( int i = 0 ; i < ecoutes.size() ; i += 1){
			if(ecoutes.get(i).getAudioBook().getLangue() == "Anglais" && ecoutes.get(i).getAudioBook().getOeuvre().getAuteur().getNom() == "MAUPASSANT") {
				nb_ecoute_v_anglaise += 1 ; 
			}
		}
		System.out.println("Le nombre d'écoutes des oeuvres de Guy de Maupassant en verson anglaise est de " + nb_ecoute_v_anglaise + ".");
		
	}

}
