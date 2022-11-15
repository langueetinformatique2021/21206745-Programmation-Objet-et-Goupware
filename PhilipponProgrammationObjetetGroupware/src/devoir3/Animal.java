package devoir3;

/** Création et gestion d'animaux */
public abstract class Animal {
	private String espèce;
	private String squelette;
	private String aspect;

	/**
	 * création d'une nouvelle instance de la classe Animal
	 * 
	 * @param type   nom de l'espèce
	 */
	public Animal(String type, String vertèbre, String peau) {
		espèce = type;
		squelette = vertèbre;
		aspect = peau;
	}

	/** présentation des caractéristiques de l'animal */
	public void présente() {
		System.out.println("je suis un représentant de l'espèce des " + espèce + "." + " Je suis un animal " + squelette + " qui a des " 
				+ aspect + ".");
	}

	/** cri de l'animal */
	public abstract void crie();
}