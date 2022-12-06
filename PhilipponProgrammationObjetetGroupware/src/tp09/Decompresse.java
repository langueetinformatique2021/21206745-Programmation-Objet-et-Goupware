package tp09;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.InflaterInputStream;

import util.Keyboard;

import java.io.FileInputStream;

public class Decompresse {

	public static void main(String[] args) {

		try {
			FileInputStream fin = new FileInputStream(
					new File("21206745-Programmation-Objet-et-Goupware/src/tp09/Nom.txt.zip"));
			DataInputStream fsource = new DataInputStream(new InflaterInputStream(fin));
			FileOutputStream fcible = new FileOutputStream(
					new File("21206745-Programmation-Objet-et-Goupware/src/tp09/NomD.txt"));

			int tmp;
			while ((tmp = fsource.read()) != -1) {
				fcible.write(tmp);

			}
			
			fsource.close();
			fcible.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
