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
		ImageIcon logo = new ImageIcon(new ImageIcon("src/images/choosemyday_logo.png").getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
		
		this.setIconImage(logo.getImage());
		this.setTitle("ChooseMyDay");
		this.setBounds(200, 200, 430, 450);
		this.getContentPane().setBackground(new Color(254, 231, 240));
		
		this.setLayout(null); // pas de grille
		this.setResizable(false); // la fenêtre ne pourra pas être redimensionnée
		
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		JLabel lbLogo = new JLabel(logo);
		lbLogo.setBounds(150, 0, 150, 150);
		this.add(lbLogo);
		
		JLabel lbTitre = new JLabel("Bienvenue");
		lbTitre.setBounds(170, 150, 110, 20);
		lbTitre.setFont(new Font(lbTitre.getText(), Font.PLAIN, 20));
		this.add(lbTitre);
		
		this.add(new VueConnexion());
		
		this.setVisible(true);
	}
	
	public void rendreVisible(boolean val)
	{
		this.setVisible(val);
	}
}
