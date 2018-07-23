
public class Panier {

	int poids ; 
	int taille ; 
	double prix ;
	int nbEmplacements ;
	
	Panier () {
		// Par défaut initialisation 
		// à 2 emplacements dans le panier
		nbEmplacements = 2 ;
		int i ; 
		i = 10 ; 
	}
	
	public static void main (String args []) {
		Panier p1 = new Panier ();
		System.out.println (p1.nbEmplacements);
		System.out.println (p1.taille);
		p1.nbEmplacements = 3 ; 
		System.out.println (p1.nbEmplacements);
	}
}
