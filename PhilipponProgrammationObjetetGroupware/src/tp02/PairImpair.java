package tp02;

public class PairImpair {

	public static void main(String[] args) {
		// test de pair et impair
		System.out.println(pair(3));
		System.out.println(impair(4));
		

	}
	
	public static boolean pair(int v) {
		return ((v % 2) == 0);
	}
	
	public static boolean impair (int v) {
		return !pair(v);

	}

}
