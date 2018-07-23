
public class Tableaux {

	//--------------------------------------------------------
	public static void main(String[] args) {
		int tab [] = {1, 2, 3, 4}; 
		int nb = 4 ; 
		
		// Afficher avant incrémentation
		for (int val : tab)
			System.out.print (val + "\t");

		// Incrémenter les cases du tableau
		incremente (tab, nb, 2);

		// Afficher après incrémentation
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
