
public class Tableaux {

	//--------------------------------------------------------
	public static void main(String[] args) {
		int tab [] = {1, 2, 3, 4}; 
		int nb = 4 ; 
		
		// Afficher avant incr�mentation
		for (int val : tab)
			System.out.print (val + "\t");

		// Incr�menter les cases du tableau
		incremente (tab, nb, 2);

		// Afficher apr�s incr�mentation
		System.out.println();
		for (int val : tab)
			System.out.print (val + "\t");
	}

	//--------------------------------------------------------
	public static void incremente (int t [], int n, int inc) {
		for (int i = 0; i < n; i++)
			t[i] += inc ; 
	}
}
