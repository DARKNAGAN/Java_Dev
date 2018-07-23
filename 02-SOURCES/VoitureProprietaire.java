
public class VoitureProprietaire {
	int annee ; 
	int puissance ; 
	double valeur ; 
	Personne proprietaire ;

	public static void main(String args[]) {
		
		// Déclaration d'une référence vers 
		// une instance de la classe VoitureProprietaire
		VoitureProprietaire v ; 
		
		// Créer une instance de la classe VoitureProprietaire
		// et mémoriser son adresse dans la variable v
		v = new VoitureProprietaire();

		
		
		
		
		
		// Déclarer et créer une instance de la classe Personne
		Personne p = new Personne ();
		
		// Modifier l'année de naissance
		p.anneeNaissance = 1965 ; 
		
		// Mémoriser cette personne comme proprietaire de la voiture
		v.proprietaire = p ; 
		System.out.println (v.proprietaire.anneeNaissance);	
	}
}
