// Compl�ter la classe Personne en ajoutant un attribut num�roSecu
// Compl�ter le main de la classe VoitureProprietaire 
// en cr�ant une 2�me voiture. 
// Le propri�taire de cette voiture sera le m�me pour les 2 voitures.
// Faire un sch�ma de la m�moire boite et fleches. 

public class VoitureProprietaireComplet {
	int annee ; 
	int puissance ; 
	double valeur ; 
	PersonneSecu proprietaire ;
	
	public static void main(String[] args) {
		// D�claration d'une r�f�rence vers 
		// une instance de la classe VoitureProprietaire
		VoitureProprietaireComplet v ; 
		
		// Cr�er une instance de la classe VoitureProprietaire
		// et m�moriser son adresse dans la variable v
		v = new VoitureProprietaireComplet();
		
		// D�clarer et cr�er une instance de la classe Personne
		PersonneSecu p = new PersonneSecu ();
		
		// Modifier l'ann�e de naissance
		p.anneeNaissance = 1965 ; 
		
		// M�moriser cette personne comme proprietaire de la voiture
		// point�e par v
		v.proprietaire = p ; 	
		
		// Cr�er une 2�me voiture
		VoitureProprietaireComplet v2 = new VoitureProprietaireComplet();
		v2.proprietaire = p ; 

		// V�rifier que les 2 propri�taires sont les m�mes
		System.out.println (v.proprietaire.anneeNaissance);
		System.out.println (v2.proprietaire.anneeNaissance);
	}
}

class PersonneSecu {
	int anneeNaissance ; 
	int numeroSecu ; 
}
















