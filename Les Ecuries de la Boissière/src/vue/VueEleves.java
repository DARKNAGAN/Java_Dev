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

import controleur.Eleve;
import modele.ModeleEleve;

public class VueEleves extends JPanel implements ActionListener
{
	private JTable tableEleves;
	
	public VueEleves ()
	{/*AFFICHAGE ECRAN*/
		this.setBounds(50, 100, 900, 600);
		this.setLayout(null);
		this.setBackground(new Color(247,245,226));
		/*TITRE*/
		JLabel titre = new JLabel(" Liste des élèves ");
		titre.setFont(new Font(titre.getText(), Font.ROMAN_BASELINE + Font.BOLD, 25));
		titre.setBounds(345, 5, 300, 50);
		add(titre);
		/*GRILLE BDD*/
		String column [] = {"Nom", "Prénom", "Email", "Sexe", "Âge", "Galop optenu", "Adresse", "Pseudo", "Mot de passe"};
		
		this.tableEleves = new JTable(this.extraireEleves(), column);
		
		JScrollPane uneScroll  = new JScrollPane(this.tableEleves);
		uneScroll.setBounds(10, 50, 880, 540);
		tableEleves.setEnabled(false);
		this.add(uneScroll);
		
		this.setVisible(false);
	}
	@Override
	public void actionPerformed(ActionEvent e) {	
	}
	//extraire les Eleves BDD
	public Object [][] extraireEleves ()
	{
		ArrayList <Eleve> lesEleves = ModeleEleve.selectAll();
		Object [][] donnees = new Object [lesEleves.size()][9];
		int i =0;
		for (Eleve unEleve : lesEleves)
		{
			donnees[i][0] = unEleve.getNom();
			donnees[i][1] = unEleve.getPrenom();
			donnees[i][2] = unEleve.getAdressEmail();
			donnees[i][3] = unEleve.getSexe();
			donnees[i][4] = unEleve.getAge();
			donnees[i][5] = unEleve.getGalop();
			donnees[i][6] = unEleve.getAdresse();
			donnees[i][7] = unEleve.getPseudo();
			donnees[i][8] = unEleve.getMdp();
			i++;
		}
		return donnees;
	}
}
