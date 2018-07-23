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

import controleur.Cheval;
import modele.ModeleCheval;

public class VueChevaux extends JPanel implements ActionListener
{
	private JTable tableChevaux;

	public VueChevaux ()
	{	/*AFICHAGE ECRAN*/
		this.setBounds(50, 100, 900, 600);
		this.setLayout(null);
		this.setBackground(new Color(247,245,226));
		/*TITRE*/
		JLabel titre = new JLabel(" Liste des chevaux ");
		titre.setFont(new Font(titre.getText(), Font.ROMAN_BASELINE + Font.BOLD, 25));
		titre.setBounds(335, 5, 300, 50);
		this.add(titre);
		/*GRILLE BDD*/
		String column [] = {"Nom", "Sexe", "Âge", "Propriétaire", "Race", "Robe", "Type"};
		this.tableChevaux = new JTable(this.extraireChevaux(), column);
		JScrollPane uneScroll  = new JScrollPane(this.tableChevaux);
		uneScroll.setBounds(10, 50, 880, 540);
		tableChevaux.setEnabled(false);
		this.add(uneScroll);
		
		this.setVisible(false);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
	}
	//extraire les Chevaux BDD
	public Object [][] extraireChevaux ()
	{
		ArrayList <Cheval> lesChevaux = ModeleCheval.selectAll();
		Object [][] donnees = new Object [lesChevaux.size()][7];
		int i =0;
		for (Cheval unCheval : lesChevaux)
		{
			donnees[i][0] = unCheval.getNom();
			donnees[i][1] = unCheval.getSexe();
			donnees[i][2] = unCheval.getAge();
			donnees[i][3] = unCheval.getProprietaire();
			donnees[i][4] = unCheval.getRace();
			donnees[i][5] = unCheval.getRobe();
			donnees[i][6] = unCheval.getType();
			i++;
		}
		return donnees;
	}
}
