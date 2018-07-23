// Compléter la classe Personne en ajoutant un attribut numéroSecu
// Compléter le main de la classe VoitureProprietaire 
// en créant une 2ème voiture. 
// Le propriétaire de cette voiture sera le même pour les 2 voitures.
// Faire un schéma de la mémoire boite et fleches. 

public class VoitureProprietaireComplet {
	int annee ; 
	int puissance ; 
	double valeur ; 
	PersonneSecu proprietaire ;
	
	public static void main(String[] args) {
		// Déclaration d'une référence vers 
		// une instance de la classe VoitureProprietaire
		VoitureProprietaireComplet v ; 
		
		// Créer une instance de la classe VoitureProprietaire
		// et mémoriser son adresse dans la variable v
		v = new VoitureProprietaireComplet();
		
		// Déclarer et créer une instance de la classe Personne
		PersonneSecu p = new PersonneSecu ();
		
		// Modifier l'année de naissance
		p.anneeNaissance = 1965 ; 
		
		// Mémoriser cette personne comme proprietaire de la voiture
		// pointée par v
		v.proprietaire = p ; 	
		
		// Créer une 2ème voiture
		VoitureProprietaireComplet v2 = new VoitureProprietaireComplet();
		v2.proprietaire = p ; 

		// Vérifier que les 2 propriétaires sont les mêmes
		System.out.println (v.proprietaire.anneeNaissance);
		System.out.println (v2.proprietaire.anneeNaissance);
	}
}

class PersonneSecu {
	int anneeNaissance ; 
	int numeroSecu ; 
}
















