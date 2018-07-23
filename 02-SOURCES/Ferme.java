
public class Ferme {
	public static void main(String[] args) {
		Panier cabas = new Panier ();
		System.out.println (cabas.nbEmplacements);

		PanierAC pJC = new PanierAC (2, 100, 12.5);
		PanierAC pBob = new PanierAC (3, 50, 3.5);
		pJC.prix = 37 ; 
	}
}
