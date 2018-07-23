
public class VoitureConstructeur {
	int annee ; 
	int puissance ; 
	double valeur ;
	
	/*
	 * Si on ne d�finit aucun constructeur, 
	 * le compilateur en d�finit un par d�faut 
	 * qui ne prend aucun param�tre 
	 * (et qui ne fait rien).
	 * Si on d�finit un constructeur avec des param�tres, 
	 * le compilateur ne d�finit plus de constructeur
	 *  par d�faut sans param�tres 
	 *  => c'est � vous de le d�finir si vous voulez l'utiliser
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
