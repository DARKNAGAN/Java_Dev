
public class VoitureProprietaire {
	int annee ; 
	int puissance ; 
	double valeur ; 
	Personne proprietaire ;

	public static void main(String args[]) {
		
		// D�claration d'une r�f�rence vers 
		// une instance de la classe VoitureProprietaire
		VoitureProprietaire v ; 
		
		// Cr�er une instance de la classe VoitureProprietaire
		// et m�moriser son adresse dans la variable v
		v = new VoitureProprietaire();

		
		
		
		
		
		// D�clarer et cr�er une instance de la classe Personne
		Personne p = new Personne ();
		
		// Modifier l'ann�e de naissance
		p.anneeNaissance = 1965 ; 
		
		// M�moriser cette personne comme proprietaire de la voiture
		v.proprietaire = p ; 
		System.out.println (v.proprietaire.anneeNaissance);	
	}
}
