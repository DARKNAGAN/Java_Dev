import javax.swing.*;
public class Calculette {
	public static void main(String[] args) {
		//Cr�ation de la fen�tre de l'application
		JFrame mainFrame = new JFrame("Exemple de FlowLayout");

		//Cr�ation d'un panel
		JPanel panelBoutons = new JPanel();
		
		//Changement du layout du panel


		
		//Ajout des boutons





		
		//Ajout du panel � la fen�tre
		mainFrame.add(panelBoutons);
		
		//'Compactage' de la fen�tre
		mainFrame.pack();
		
		//On quitte l'application quand la fen�tre est ferm�e
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//Affichage de la fen�tre
		mainFrame.setVisible(true);}}
