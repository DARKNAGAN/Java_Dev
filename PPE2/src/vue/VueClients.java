package vue;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import controleur.Client;
import modele.ModeleClient;

public class VueClients extends JPanel implements ActionListener
{
	private JLabel titre = new JLabel("Liste des clients ");
	private JTable tableClients;
	
	public VueClients ()
	{
		this.setBounds(50, 30, 350, 250);
		this.setLayout(null);
		this.setBackground(Color.CYAN);
		this.titre.setBounds(100, 10, 100, 20);
		this.add(this.titre);
		
		String titres [] = {"id Client", "Nom", "Prénom", "Email","Adresse"};
		
		this.tableClients = new JTable(this.extraireClients(), titres);
		
		JScrollPane uneScroll  = new JScrollPane(this.tableClients);
		uneScroll.setBounds(10, 10, 340, 240);
		this.add(uneScroll);
		
		this.setVisible(false);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
	}
	
	//extraire les clients 
	
	public Object [][] extraireClients ()
	{
		ArrayList <Client> lesClients = ModeleClient.selectAll();
		Object [][] donnees = new Object [lesClients.size()][5];
		int i =0;
		for (Client unClient : lesClients)
		{
			donnees[i][0] = unClient.getIdclient();
			donnees[i][1] = unClient.getNom();
			donnees[i][2] = unClient.getPrenom();
			donnees[i][3] = unClient.getEmail();
			donnees[i][4] = unClient.getAdresse();
			i++;
		}
		return donnees;
	}
	
}
