package tutor;

public class LogicalOperators {

	public static void main(String args[]) {
		boolean[] p = {true, true, false, false};
		boolean[] q = {true, false, true, false};

		printTruthTable(p, q);
	
		int[] P = {1, 1, 0, 0};
		int[] Q = {1, 0, 1, 0};
		
		printTruthTable(P, Q);
	
	}
		
	public static void printTruthTable( boolean[] p, boolean[] q) {
		System.out.println("\nP\tQ\tAND\tOR\tXOR\tNOT(p)\tNOT(q)");
		for(int i = 0; i < p.length; i++ ) {
				System.out.println(p[i] + "\t" + q[i] + "\t" + (p[i] & q[i]) + "\t" +
						(p[i] | q[i] ) + "\t" + (p[i] ^ q[i]) + "\t" + !p[i] + "\t" + !q[i] );
		}
	}
	
	private static void printTruthTable(int[] p, int[] q) {
		System.out.println("\nP\tQ\tAND\tOR\tXOR\tNOT(p)\tNOT(q)");
		for(int i = 0; i < p.length; i++ ) {
				System.out.println(p[i] + "\t" + q[i] + "\t" + (p[i] & q[i]) + "\t" +
						(p[i] | q[i] ) + "\t" + (p[i] ^ q[i]) + "\t" + (p[i] ^= 1) + "\t" + (q[i] ^= 1) );
		}
	}

}
