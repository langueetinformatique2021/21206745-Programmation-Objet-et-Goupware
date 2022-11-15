package devoir3;

public class Crocodile extends Réptile implements Domesticable {
	
	private String nom;

	public Crocodile() {
		super("crocodiles");
		// TODO Auto-generated constructor stub
	}

	@Override
	public void domestiquer(String nom) {
		// TODO Auto-generated method stub
		domestique = false;
		this.nom = nom;

	}

	@Override
	public String nom() {
		// TODO Auto-generated method stub
		return this.nom;
	}
	
	public void crie() {
		if (domestique == false) super.crie();
		else 
			System.out.println("Je lamente et je m'appelle "  + this.nom());
	}

}
