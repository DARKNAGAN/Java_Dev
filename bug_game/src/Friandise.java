public class Friandise extends Gadget {
	private String nom;

	public Friandise(int i, int j) {
		super(i, j);
		nom = "Friandise";
	}

	@Override
	public void utilisation(Bug g) {
		
	}
	
	public String afficher() {
		return nom;
	}

}
