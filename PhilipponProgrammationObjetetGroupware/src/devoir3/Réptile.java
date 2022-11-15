package devoir3;

/** Création et gestion de réptiles */
public class Réptile extends Animal {
// ajout d'attributs propres à la sous-classe
	protected boolean domestique = false;

	/**
	 * le constructeur de réptile fait appel au constructeur de la sur-classe Animal
	 */
	public Réptile(String type) { 
		super(type, "vertébré", "écailles" );
	}

	/** présentation des caractéristiques du réptile */
	public void présente() {
		// appel de la méthode de la sur-classe
		
		super.présente();
		String etat = (domestique) ? "domestique" : "sauvage";
		System.out.println("je suis vraiment un animal " + etat);
	}

	/** cri du réptile */

	public void crie() {
		System.out.println("je lamente, vagis");
		
	}
}