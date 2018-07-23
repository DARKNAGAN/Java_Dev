public class Assurance {

	public static void main(String[] args) {
		// Declarer une reference a une voiture 
		Voiture scenic ; 
		
		
		// Utiliser l'operateur new
		// - allouer de la place memoire dans le tas pour tous les attributs de cet objet
		// - initialiser les attributs à des valeurs par défauut
		// - retourner l'adresse de la zone allouee
		scenic = new Voiture ();
	
		// Affecter des valeurs aux attributs de cet objet
		scenic.annee = 1998 ;

		// Afficher les valeurs des attributs de cet objet
		System.out.println(" Annee scenic : " + scenic.annee);
		
		// Declarer une reference vers une 2eme voiture
		Voiture audi ; 
		
		// Creer un objet, modifier les attributs et les afficher
		audi = new Voiture ();
		audi.annee = 2008 ; 		
		System.out.println(" Annee audi : " + audi.annee);		
	}
}
