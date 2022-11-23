package devoir4;

import tp07.Calendrier;
import util.Keyboard;

public class testCalendrier {

	public static void main(String[] args) {
		Calendrier c = new Calendrier();
		c.creation();
		Keyboard.getInt("attente");
		c.creation();
		c.afficher();
		c.duree();
		
	}

}