package devoir6;

import java.io.IOException;

public class testLireTexte {

	public static void main(String[] args) throws IOException {
		LireTexte lt = new LireTexte("Vide.txt");
		lt.Ouvrir();	
		lt.readWord();
		lt.Fermer();
	}

}