package vue;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import controleur.Profil;

public class VueAccueil extends JPanel
{
	public VueAccueil(Profil unProfil)
	{
		/*AFFICHAGE TAB*/
		this.setBounds(50, 130, 900, 500);
		this.setBackground(new Color(230,230,230));
		this.setLayout(null);
		/* TITRE */
		JLabel lbProfil = new JLabel("Vos informations de profil");
		lbProfil.setBounds(300, 30, 400, 40);
		lbProfil.setFont(new Font(lbProfil.getText(), Font.ROMAN_BASELINE + Font.BOLD, 25));
		this.add(lbProfil);
		/* INFO PROFIL */
		JTextArea txtInfo = new JTextArea();
		txtInfo.setBounds(50, 50, 750, 400);
		txtInfo.setEditable(false);
		txtInfo.setBackground(new Color(230,230,230));
		txtInfo.setFont(new Font(txtInfo.getText(),Font.ROMAN_BASELINE, 20));
		// txtTitre.setAlignmentX(JTextArea.CENTER_ALIGNMENT);
		
		txtInfo.setText( "\n\n Login : " + unProfil.getLogin()
						+ "\n\n Nom : " + unProfil.getNom()
						+ "\n\n Prénom : " + unProfil.getPrenom()
						+ "\n\n Adresse Email : " + unProfil.getEmail()
						+ "\n\n Votre Age : " + unProfil.getAge()
						+ "\n\n Votre Sexe : " + unProfil.getSexe()
						+ "\n\n Galop optenue : " + unProfil.getGalop());
		this.add(txtInfo);
		
		this.setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Stub de la méthode généré automatiquement

	}
}



