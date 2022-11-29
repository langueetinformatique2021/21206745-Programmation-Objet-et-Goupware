package tp08;

import java.util.ArrayList;
import tp08.LancerDes;

public class TestDes {

	public static void main(String[] args) {
		String nom = "TEST";
		LancerDes ld = new LancerDes(nom, 6);
		
		do {
			ArrayList<Integer> al = ld.lancerDes();
			print(al);
		} while (true);
	}
		
	public static void print(Object o) {System.out.println(o);}
}