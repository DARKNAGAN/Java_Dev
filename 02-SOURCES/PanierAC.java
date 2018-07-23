// Version de la classe Panier avec un constructeur
// avec des paramètres

public class PanierAC {

	int poids ; 
	int taille ; 
	double prix ;
	int nbEmplacements ;
	
	PanierAC (int p, int t, double pr) {
		// Par défaut initialisation 
		// à 2 emplacements dans le panier
		nbEmplacements = 2 ;
		poids = p ; 
		taille = t ; 
		prix = pr ; 
		System.out.println ("Dans le constructeur prix vaut  " + prix);
	}
	
	public static void main (String args []) {
		PanierAC p1 = new PanierAC (2, 100, 12.5);
		PanierAC p2 = new PanierAC (2, 100, 7.8 );
			
	}
}
