
public class VoitureConstructeur {
	int annee ; 
	int puissance ; 
	double valeur ;
	
	/*
	 * Si on ne définit aucun constructeur, 
	 * le compilateur en définit un par défaut 
	 * qui ne prend aucun paramètre 
	 * (et qui ne fait rien).
	 * Si on définit un constructeur avec des paramètres, 
	 * le compilateur ne définit plus de constructeur
	 *  par défaut sans paramètres 
	 *  => c'est à vous de le définir si vous voulez l'utiliser
	 */
	public static void main (String args[]) {
		VoitureConstructeur v ; 
		v = new VoitureConstructeur (2007, 7);
		VoitureConstructeur v2 = new VoitureConstructeur (); // ERREUR CAR LE CONSTRUCTEUR PAR DEFAUT N'A PAS ETE CREE
	}	
	
	VoitureConstructeur () {
		
	}
	
	VoitureConstructeur (int an, double valeur) {
	annee = an ; 
	this.valeur = valeur ; // CAR L'ATTRIBUT A LE MEME NOM QU'UN PARAMETRE
} 

}
