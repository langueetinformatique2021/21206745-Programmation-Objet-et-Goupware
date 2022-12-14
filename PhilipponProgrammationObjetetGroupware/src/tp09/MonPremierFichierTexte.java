package tp09;

import java.io.File; 
import java.io.PrintWriter;
import java.io.IOException;

public class MonPremierFichierTexte {

	public static void main(String[] args) {

		try {
			PrintWriter pr = new PrintWriter(new File("PhilipponProgrammationObjetetGoupware/src/tp09/Nom.txt"));
			pr.println("Romane Philippon");
			pr.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
