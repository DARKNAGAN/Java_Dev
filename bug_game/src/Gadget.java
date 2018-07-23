public abstract class Gadget {
	
	/* Attribut */
	private int pos_x;
	private int pos_y;
	
	/* Constructeur */
	protected Gadget(int i, int j) {
		pos_x = i;
		pos_y = j;
	}
	
	public abstract void utilisation(Bug b);
	
	public abstract String afficher();
	public int getX() {return pos_x;}
	public int getY() {return pos_y;}
}
