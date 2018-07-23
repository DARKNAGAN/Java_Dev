package vue;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import controleur.Gestion;

public class VueMenu extends JPanel implements ActionListener
{
	private JButton btAjouter = new JButton("Ajouter");
	private JButton btLister = new JButton("Lister");
	private JButton btSupprimer = new JButton("Supprimer");
	private JButton btRechercher = new JButton("Rechercher");
	private JButton btQuitter= new JButton("Quitter");
	
	public VueMenu ()
	{
		this.setBounds(20, 20, 120, 300);
		this.setLayout(new GridLayout(7, 1));
		this.setBackground(Color.YELLOW);
		
		this.add(new JLabel());
		this.add(this.btAjouter);
		this.add(this.btLister);
		this.add(this.btSupprimer);
		this.add(this.btRechercher);
		this.add(this.btQuitter);
		this.add(new JLabel());
		
		//rendre les boutons cliquables 
		this.btAjouter.addActionListener(this);
		this.btLister.addActionListener(this);
		this.btSupprimer.addActionListener(this);
		this.btRechercher.addActionListener(this);
		
		this.setVisible(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		if (e.getSource()==this.btQuitter)
		{
		
		}
		else if (e.getSource()==this.btAjouter)
		{
			Gestion.rendreVisibleVueInsert(true);
			Gestion.rendreVisibleVueAccueil(false);
			Gestion.rendreVisibleVueDelete(false);
			
		}else if (e.getSource()==this.btSupprimer)
		{
			Gestion.rendreVisibleVueInsert(false);
			Gestion.rendreVisibleVueAccueil(false);
			Gestion.rendreVisibleVueDelete(true);
		}
	}
}
