
public class CabinetAssurance {

	final int NB_MAX = 10 ; 
	
	Voiture [] voitures ; 
	int nbVoitures ; 
	
	CabinetAssurance () {
		voitures = new Voiture [NB_MAX];
	}
	
	void ajouterVoiture (Voiture v1) {
		voitures[nbVoitures] = v1 ; 
		nbVoitures++ ; 
	}
	public static void main(String[] args) {
		CabinetAssurance a = new CabinetAssurance();
		
		Voiture durand = new Voiture ();
		durand.annee = 1999 ; 
		
		a.ajouterVoiture(durand);
	}

}
