package vue;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import controleur.Profil;

public class VueProfil extends JPanel {
	public VueProfil(Profil unProfil)
	{
		this.setBounds(50, 130, 900, 500);
		this.setBackground(new Color(230,230,230));
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
		
		txtTitre.setText("\n ID : " + unProfil.getIdformateur()
						 +"\n Nom : " + unProfil.getNom()
						+ "\n Prénom : " + unProfil.getPrenom()
						+ "\n Mail : " + unProfil.getEmail()
						+ "\n Sexe : " + unProfil.getSexe()
						+ "\n Age : " + unProfil.getAge()
						+ "\n Galop : " + unProfil.getGalop()
						+ "\n privilege : " + unProfil.getPrivilege()
						+ "\n login : " + unProfil.getLogin()
						+ "\n Mot de passe : " + unProfil.getMdp());
		this.add(txtTitre);
		
		this.setVisible(true);
	}
}