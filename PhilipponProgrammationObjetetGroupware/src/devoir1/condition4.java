package devoir1;

/** @author Romane Philippon */

/**
 * importation des outils java pour créer des listes et les trier
 */
import java.util.ArrayList;
import java.util.Collections;

public class condition4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/**
 * initialisation de 5 variables avec des valeurs différentes
 */
		int p1 = 10, p2 = 9, p3 = -1, p4 = 4, p5 = 8;

/**
 * ajout des 5 variables dans une liste préalablement créée
 */
		ArrayList<Integer> list = new ArrayList<>();
		list.add(p1);
		list.add(p2);
		list.add(p3);
		list.add(p4);
		list.add(p5);

/**
 * trier la liste par ordre ascendant
 */
		Collections.sort(list);
		
		int n = list.size();

/**
 * utilisation d'une structure conditionnelle pour trouver la valeur médianne des 5 variables 
 */
		if (n % 2 == 1) {
			System.out.println("p6 =" + list.get((n+1)/2 - 1));
		} else {
			System.out.println("p6 =" + (list.get(n/2 -1) + list.get(n/2))/2);
		}
	}
}
