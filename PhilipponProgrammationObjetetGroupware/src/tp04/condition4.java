package tp04;

import java.util.ArrayList;
import java.util.Collections;

public class condition4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int p1 = 10, p2 = 9, p3 = -1, p4 = 4, p5 = 8;
		int p6;
		ArrayList<Integer> list = new ArrayList<>();
		list.add(p1);
		list.add(p2);
		list.add(p3);
		list.add(p4);
		list.add(p5);
		
		Collections.sort(list);
		
		int n = list.size();
		
		if (n % 2 == 1) {
			System.out.println("p6 =" + list.get((n+1)/2 - 1));
		} else {
			System.out.println("p6 =" + (list.get(n/2 -1) + list.get(n/2))/2);
		}
	}
}

		
		