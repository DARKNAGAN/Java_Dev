package vue;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class VueAccueil extends JPanel
{
	public VueAccueil()
	{
		this.setBounds(150, 20, 300, 300);
		this.setLayout(new GridLayout(4, 1));
		
		this.setBackground(Color.GRAY);
		JLabel titre = new JLabel("Logiciel realisé le 6-01-2017");
		JLabel logo = new JLabel(new ImageIcon("src/images/enregistrer.png"));
		
		this.add(new JLabel());
		this.add(titre);
		this.add(logo);
		this.add(new JLabel());
		this.setVisible(true);
	}
}
