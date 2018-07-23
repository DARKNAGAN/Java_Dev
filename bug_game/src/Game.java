import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Image;

import java.util.concurrent.TimeUnit;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class Game extends JPanel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
    public static int taille = 7;

	public static void main(String[] args) {

		Labyrinthe lab = new Labyrinthe(taille - 1);
        JFrame fenetre = new JFrame();
        fenetre.setTitle("BUG GAME");
        fenetre.setSize(500,500);
        fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fenetre.setLocationRelativeTo(null);
        fenetre.setResizable(false);
        fenetre.setLayout(new BorderLayout());
        JPanel content = new JPanel();
        fenetre.setContentPane(content);
        content.setLayout(new GridLayout(taille, taille));//on définit la taille de la grille de 10 sur 10
        
        JPanel[][] plat = afficherLabyrinthe(lab, content);
        fenetre.setVisible(true);
    	
    	while(lab.getGadgets()[0].getX() != lab.getBugs()[0].getX() ||
    			lab.getGadgets()[0].getY() != lab.getBugs()[0].getY()) {
    		// Pour une execution pas à pas
    		try {
        		TimeUnit.MILLISECONDS.sleep(500);
        	} catch (InterruptedException e) {
        		// TODO Auto-generated catch block
        		e.printStackTrace();
        	}
        	deplacement(lab, plat, content);
        	
    	}
    	lab.getGadgets()[0].utilisation(lab.getBugs()[0]);
    	plat[lab.getGadgets()[0].getX()][lab.getGadgets()[0].getY()].removeAll();
    	plat[lab.getGadgets()[0].getX()][lab.getGadgets()[0].getY()].add(getImg(lab.getBugs()[0].afficher()));
    	plat[lab.getGadgets()[0].getX()][lab.getGadgets()[0].getY()].revalidate();

    	
	}
	
	
	 //creation des cases et des collones du jpanel
    public static JPanel[][] afficherLabyrinthe(Labyrinthe lab, JPanel content){
    	JPanel[][] plateau = new JPanel[taille-1][taille-1];

        int taille = lab.getTaille();
        // Creation du plateau
        Bug[] bugs = lab.getBugs();
        Gadget[] gadgets = lab.getGadgets();
        content.setBackground(Color.white);
        
        for(int i=0; i<taille; i++){
            for(int j=0; j<taille; j++){
            	plateau[i][j]= new JPanel();
                
                //on definis la dimension du jpanel de 50,50
                plateau[i][j].setSize(new Dimension(500/taille, 500/taille));
                
                plateau[i][j].setBackground(Color.white);
                plateau[i][j].setBorder(BorderFactory.createLineBorder(Color.BLACK));
                
            	content.add(plateau[i][j]);
            }
            
        }
        
        for (int nbBug = 0; nbBug < lab.getNbBug(); nbBug++){
            plateau[bugs[nbBug].getX()][bugs[nbBug].getY()].add(getImg(bugs[nbBug].afficher()));
        }
        
        for (int nbGadget = 0; nbGadget < lab.getNbGadget(); nbGadget++){
            plateau[gadgets[nbGadget].getX()][gadgets[nbGadget].getY()].add(getImg(gadgets[nbGadget].afficher()));
        }
        
        return plateau;   
    }



public static void deplacement(Labyrinthe lab, JPanel[][] plateau, JPanel content){
    Bug[] bugs = lab.getBugs();

 // On joue un tour pour tout les bugs
    for(int nbBug = 0; nbBug < lab.getNbBug(); nbBug++){
    	int x = bugs[nbBug].getX(); int y = bugs[nbBug].getY();
    	        
        plateau[x][y].removeAll();
        plateau[x][y].setSize(new Dimension(500/taille, 500/taille));        
        plateau[x][y].setBackground(Color.white);
           
    	// Tant que la rotation n'est pas correct
    	while(!bugs[nbBug].rotation(taille-2));

    	// Deplacement du bug
    	bugs[nbBug].deplacer();
    	x = bugs[nbBug].getX();y =bugs[nbBug].getY(); 
        
    	plateau[x][y].add(getImg(bugs[nbBug].afficher()));
    	plateau[x][y].revalidate();
    }     
}

public static JLabel getImg(String nom) {
	if (nom == "right")
		return new JLabel(new ImageIcon(new ImageIcon("bug_right.jpeg").getImage().getScaledInstance(500/taille - 10, 500/taille - 10, Image.SCALE_DEFAULT)));
	else if (nom == "left")
		return new JLabel(new ImageIcon(new ImageIcon("bug_left.jpeg").getImage().getScaledInstance(500/taille - 10, 500/taille - 10, Image.SCALE_DEFAULT)));
	else if (nom == "top")
		return new JLabel(new ImageIcon(new ImageIcon("bug_top.jpeg").getImage().getScaledInstance(500/taille - 10, 500/taille - 10, Image.SCALE_DEFAULT)));
	else if (nom == "bot")
		return new JLabel(new ImageIcon(new ImageIcon("bug_bot.jpeg").getImage().getScaledInstance(500/taille - 10, 500/taille - 10, Image.SCALE_DEFAULT)));
	else
		return new JLabel(new ImageIcon(new ImageIcon("fraise.jpeg").getImage().getScaledInstance(500/taille - 10, 500/taille - 10, Image.SCALE_DEFAULT)));

}

}