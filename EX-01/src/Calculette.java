import javax.swing.*;
public class Calculette {
	public static void main(String[] args) {
		//Création de la fenêtre de l'application
		JFrame mainFrame = new JFrame("Exemple de FlowLayout");

		//Création d'un panel
		JPanel panelBoutons = new JPanel();
		
		//Changement du layout du panel


		
		//Ajout des boutons





		
		//Ajout du panel à la fenêtre
		mainFrame.add(panelBoutons);
		
		//'Compactage' de la fenêtre
		mainFrame.pack();
		
		//On quitte l'application quand la fenêtre est fermée
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//Affichage de la fenêtre
		mainFrame.setVisible(true);}}
