
public class Joueur {
	final int SCORE_MAX ; 
	static int nbJoueur ; 
	int numero ;
	
	Joueur () {
		SCORE_MAX = 10 ; 
		nbJoueur ++ ;
		numero = nbJoueur ;
	}
	
	public static void main(String[] args) {

		Joueur j1 = new Joueur ();
		System.out.println (nbJoueur);
		System.out.println ("no j1 : " + j1.numero);

		Joueur j2 = new Joueur ();
		System.out.println (nbJoueur);
		System.out.println ("no j2 : " + j2.numero);

	}

}
