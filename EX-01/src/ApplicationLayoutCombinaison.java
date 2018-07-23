import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.*;

public class ApplicationLayoutCombinaison {

	public static void main(String[] args) {
		// Créer la fenetre de l'application
		JFrame mainFrame = new JFrame("Combinaison de plusieurs layout");

		// Créer un panel global
		JPanel panelGlobal = new JPanel();
		
		// Changer le layout du panel global
		panelGlobal.setLayout(new BorderLayout());
		
		// Ajouter des boutons
		panelGlobal.add(new JButton("East"), BorderLayout.NORTH);
		panelGlobal.add(new JButton("West"), BorderLayout.SOUTH);
		
		// Créer le panel du milieu
		JLabel panelLabel = new JLabel();
		panelLabel.add(new JLabel("Bouton 1"));
		panelGlobal.add(panelLabel, BorderLayout.NORTH);
		
		JPanel panelBoutons = new JPanel();
		panelBoutons.setLayout(new GridLayout(2, 2));
		panelBoutons.add(new JButton("Bouton 1"));
		panelBoutons.add(new JButton("Bouton 2"));
		panelBoutons.add(new JButton("Bouton 3"));
		panelBoutons.add(new JButton("Bouton 4"));
		panelBoutons.add(new JButton("Bouton 1"));
		panelBoutons.add(new JButton("Bouton 2"));
		panelBoutons.add(new JButton("Bouton 3"));
		panelBoutons.add(new JButton("Bouton 4"));
		panelBoutons.add(new JButton("Bouton 1"));
		panelBoutons.add(new JButton("Bouton 2"));
		panelBoutons.add(new JButton("Bouton 3"));
		panelBoutons.add(new JButton("Bouton 4"));
		panelGlobal.add(panelBoutons, BorderLayout.SOUTH);
		
		
		//Ajout du panel a la fenetre
		mainFrame.add(panelGlobal);

		//'Compactage' de la fenetre
		mainFrame.pack();
		
		//On quitte l'application quand la fenetre est fermee
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//Affichage de la fen?tre
		mainFrame.setVisible(true);
	}
}
