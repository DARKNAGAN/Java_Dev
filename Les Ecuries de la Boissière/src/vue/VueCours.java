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

import controleur.Cours;
import modele.ModeleCours;

public class VueCours extends JPanel implements ActionListener
{
	private JTable tableCours;
	
	public VueCours ()
	{	/*AFFICHAGE ECRAN*/
		this.setBounds(50, 100, 900, 600);
		this.setLayout(null);
		this.setBackground(new Color(247,245,226));
		/*TITRE*/
		JLabel titre = new JLabel(" Liste des cours ");
		titre.setFont(new Font(titre.getText(), Font.ROMAN_BASELINE + Font.BOLD, 25));
		titre.setBounds(345, 5, 300, 50);
		add(titre);
		/*GRILLE BDD*/
		String column [] = {"Date du cours", "Débute à", "Fini à", "ID d'élève", "ID Formateur","ID de Cheval" };
		this.tableCours = new JTable(this.extraireCours(), column);
		JScrollPane uneScroll  = new JScrollPane(this.tableCours);
		uneScroll.setBounds(10, 50, 880, 540);
		tableCours.setEnabled(false);
		this.add(uneScroll);
		
		this.setVisible(false);
	}
	@Override
	public void actionPerformed(ActionEvent e) {	
	}
	//extraire les Cours BDD
	public Object [][] extraireCours ()
	{
		ArrayList <Cours> lesCours = ModeleCours.selectAll();
		Object [][] donnees = new Object [lesCours.size()][6];
		int i =0;
		for (Cours unCours : lesCours)
		{
			donnees[i][0] = unCours.getDateCours();
			donnees[i][1] = unCours.getHeureDebut();
			donnees[i][2] = unCours.getHeureFin();
 			donnees[i][3] = unCours.getIdEleve();
			donnees[i][4] = unCours.getIdFormateur();
			donnees[i][5] = unCours.getIdCheval();
			
			i++;
		}
		return donnees;
	}
}
