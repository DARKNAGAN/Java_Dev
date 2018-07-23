package vue;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Connexion extends JFrame
{
	public Connexion()
	{	
		

		/*PARAM FENETRE */
		this.setIconImage(new ImageIcon("src/images//favicon.png").getImage());//logo fenetre
		this.setTitle("Les Ecuries de la Boissière");//titre fenetre
		this.setBounds(400, 150, 1000, 800);//format fenetre 
		this.getContentPane().setBackground(new Color(117,157,135));//Couleur fenetre RGB	
		this.setLayout(null); // pas de grille
		this.setResizable(false); // la fenètre ne pourra pas être redimensionnée
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		/* AFFICHAGE FENETRE*/
		ImageIcon logo = new ImageIcon(new ImageIcon("src/images/logo.png").getImage().getScaledInstance(550,151, Image.SCALE_AREA_AVERAGING));//logo page L/l
		JLabel lbLogo = new JLabel(logo); 	
		lbLogo.setBounds(200, 15, 550,151);//position logo page  X Y L H
		this.add(lbLogo);
		JLabel lbTitre = new JLabel("<html><b><center>Bienvenue<br> Connectez-vous</center><b></html>");//titre page
		lbTitre.setBounds(400, 250, 200, 60);// position titre page
		lbTitre.setFont(new Font(lbTitre.getText(), Font.ROMAN_BASELINE, 25));// taille titre page
		lbTitre.setForeground( Color.white);
		this.add(lbTitre);
		
		this.add(new VueConnexion());//insertion VueConnexion
		
		this.setVisible(true);
	}
	
	public void rendreVisible(boolean val)
	{
		this.setVisible(val);
	}
}
