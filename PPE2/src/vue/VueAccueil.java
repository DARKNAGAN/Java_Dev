package vue;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import controleur.Profil;

public class VueAccueil extends JPanel
{
	public VueAccueil(Profil unProfil)
	{
		this.setBounds(70, 50, 300, 250);
		this.setBackground(Color.pink);
		this.setLayout(null);
		
		JLabel lbProfil = new JLabel("Votre Profil");
		lbProfil.setBounds(90, 10, 150, 40);
		lbProfil.setFont(new Font(lbProfil.getText(), Font.PLAIN + Font.BOLD, 18));
		this.add(lbProfil);
		
		JTextArea txtTitre = new JTextArea();
		txtTitre.setBounds(20, 50, 280, 200);
		//txtTitre.setBounds(x, y, width, height);
		txtTitre.setEditable(false);
		txtTitre.setBackground(Color.pink);
		txtTitre.setFont(new Font(txtTitre.getText(), Font.PLAIN, 15));
		// txtTitre.setAlignmentX(JTextArea.CENTER_ALIGNMENT);
		
		txtTitre.setText( "\n Nom : " + unProfil.getNom()
						+ "\n PrÃ©nom : " + unProfil.getPrenom()
						+ "\n Adresse : " + unProfil.getAdresse()
						+ "\n Droits : " + unProfil.getDroits());
		this.add(txtTitre);
		
		this.setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Stub de la méthode généré automatiquement

	}
}
