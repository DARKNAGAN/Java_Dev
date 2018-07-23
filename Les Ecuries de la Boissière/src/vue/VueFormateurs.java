package vue;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import controleur.Formateur;
import modele.ModeleFormateur;

public class VueFormateurs extends JPanel implements ActionListener
{
	private JTable tableFormateurs;
	
	public VueFormateurs ()
	{	/*AFFICHAGE ECRAN*/
		this.setBounds(50, 100, 900, 600);
		this.setLayout(null);
		this.setBackground(new Color(247,245,226));
		/*TITRE*/
		 JLabel titre = new JLabel(" Liste des formateurs ");
		titre.setFont(new Font(titre.getText(), Font.ROMAN_BASELINE + Font.BOLD, 25));
		titre.setBounds(315, 5, 300, 50);
		add(titre);
		/*GRILLE BDD*/
		String column [] = {"Nom", "Prénom", "Email", "Sexe", "Âge", "Galop optenu", "Login", "Mot de passe"};
		this.tableFormateurs = new JTable(this.extraireFormateurs(), column);
		JScrollPane uneScroll  = new JScrollPane(this.tableFormateurs);
		uneScroll.setBounds(10, 50, 880, 540);
		tableFormateurs.setEnabled(false);
		this.add(uneScroll);
		
		this.setVisible(false);
	}
	@Override
	public void actionPerformed(ActionEvent e) {	
	}
	//extraire les Formateurs BDD
	public Object [][] extraireFormateurs ()
	{
		ArrayList <Formateur> lesFormateurs = ModeleFormateur.selectAll();
		Object [][] donnees = new Object [lesFormateurs.size()][8];
		int i =0;
		for (Formateur unFormateur : lesFormateurs)
		{
			donnees[i][0] = unFormateur.getNom();
			donnees[i][1] = unFormateur.getPrenom();
			donnees[i][2] = unFormateur.getAdressEmail();
			donnees[i][3] = unFormateur.getSexe();
			donnees[i][4] = unFormateur.getAge();
			donnees[i][5] = unFormateur.getGalop();
			donnees[i][6] = unFormateur.getLogin();
			donnees[i][7] = unFormateur.getMdp();
			i++;
		}
		return donnees;
	}
}
