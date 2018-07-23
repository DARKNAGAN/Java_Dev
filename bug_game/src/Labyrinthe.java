
import java.util.Random;


public class Labyrinthe {
	/* Attribut */
	private int taille;
	private Bug[] bugs; 
	private int nbBug = 0;
	private Gadget[] gadgets;
	private int nbGadget = 0;

	        
	// Constructeur
	public Labyrinthe(int t) {
		bugs = new Bug[t*t];
		gadgets = new Gadget[2];
		
		taille = t;

		
		Random r = new Random();		
		// Ajout du Bug
		int iAlea = r.nextInt(t);
		int jAlea = r.nextInt(t);
		bugs[0] = new Bug(iAlea,jAlea);
		nbBug++;
		
		// Ajout du Bug
		iAlea = r.nextInt(t);
		jAlea = r.nextInt(t);
		gadgets[0] = new Friandise(iAlea,jAlea);
		nbGadget++;
		
	}
	
	public boolean addBug() {
		if (bugs.length == taille*taille) {
			return false;
		}
		
		Random r = new Random();
		int iAlea = r.nextInt(taille);
		int jAlea = r.nextInt(taille);
		bugs[nbBug - 1] = new Bug(iAlea,jAlea);
		nbBug++;
		return true;
	}
	

	public int getTaille(){
		return taille;
	}
	public Bug[] getBugs(){
		return bugs;
	}
	public int getNbBug(){
		return nbBug;
	}
	public Gadget[] getGadgets(){
		return gadgets;
	}
	public int getNbGadget(){
		return nbGadget;
	}

}
