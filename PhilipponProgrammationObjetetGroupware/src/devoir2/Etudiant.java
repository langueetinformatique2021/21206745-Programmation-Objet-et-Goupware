package devoir2;

/** @author Romane Philippon */

// importation de la classe Saisie du package util

import util.Saisie;

public class Etudiant {
		
		// déclaration des attributs
		
		private String Nom; 
		private String DateNaissance;
		private String niveau_étude;
		private int année_étude;
		private String diplôme;
		private int NuméroEtudiant;
		
		// Méthode Constructeur
		
		public Etudiant()
		{
			Nom = Saisie.lire_String("Comment s'appelle l'étudiant ?");
			DateNaissance = Saisie.lire_String("Quand est né l'étudiant ?");
			niveau_étude = Saisie.lire_String("Quel niveau d'étude a l'étudiant ?");
			année_étude = Saisie.lire_int("Quelle année sommes-nous ?");
			diplôme = Saisie.lire_String("Qu'étudie l'étudiant ?");
			NuméroEtudiant = Saisie.lire_int("Quel est le numéro identifiant l'étudiant ?");
			
		}
		// Surcharger le constructeur
		
		public Etudiant (String NomPrénom, String DateNaiss,String niveau, int année, String titre, int identifiant )
		{
		  
		   Nom = NomPrénom;
		   DateNaissance = DateNaiss;
		   niveau_étude = niveau;
		   année_étude = année;
		   diplôme = titre;
		   NuméroEtudiant = identifiant;
		}
		
		
		// Méthodes accesseurs
		
		public String getNom() {
			return Nom;
		}
		public void setNom(String nom) {
			Nom = nom;
		}
		public String getDateNaissance() {
			return DateNaissance;
		}
		public void setDateNaissance(String dateNaissance) {
			DateNaissance = dateNaissance;
		}
		public String getniveau_étude() {
			return niveau_étude;
		}
		public void setniveau_étude(String niveauEtude) {
			niveau_étude = niveauEtude;
		}
		public String getdiplôme() {
			return diplôme;
		}
		public void setdiplôme(String études) {
			diplôme = études;
		}
		public int année_étude() {
			return année_étude;
		}
		public void setannée_étude(int annéeEnCours) {
			année_étude = annéeEnCours;
		}
		public int NuméroEtudiant() {
			return NuméroEtudiant;
		}
		public void setNuméroEtudiant(int numéro) {
			NuméroEtudiant = numéro;
		}
		
		public void Afficher() {
			System.out.println("L'étudiant " + Nom + " qui est né le " + DateNaissance + " et a le numéro d'étudiant " + NuméroEtudiant + ", étudie en" + niveau_étude + diplôme + "en" + année_étude );
		}
		
	}

