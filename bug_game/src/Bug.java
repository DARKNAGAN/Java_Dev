import java.util.Random;



public class Bug {
	private int pos_x;
	private int pos_y;
	private String orientation;
	
	public Bug(int i, int j) {
		pos_x = i; pos_y = j; orientation = "right";
	}
	
	public void deplacer() {
		if (orientation == "right") {
			pos_y++;
		} 
		else if (orientation == "left") {
			pos_y--;
		}
		else if (orientation == "top") {
			pos_x--;
		} 
		else if (orientation == "bot") {
			pos_x++;
		}
	}
	
	public String afficher() {
		return orientation;
	}
	
	public boolean rotation(int taillePlateau) {
		Random r = new Random();
		int alea = r.nextInt(4);
		boolean correctRotation = true;
		
		switch(alea){
		case 0:
			if(pos_y + 1 > taillePlateau){
				correctRotation = false;
				break;
			}
			orientation = "right";
			break;
		case 1:
			if(pos_y - 1 < 0){
				correctRotation = false;
				break;
			}
			orientation = "left";
			break;
		case 2:
			if(pos_x - 1 < 0){
				correctRotation = false;
				break;
			}
			orientation = "top";
			break;
		case 3: default:
			if(pos_x + 1 > taillePlateau){
				correctRotation = false;
				break;
			}
			orientation = "bot";
			break;
		}
		
		return correctRotation;
	}
	public int getX() {return pos_x;}
	public int getY() {return pos_y;}

	
}
