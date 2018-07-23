package vue;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import controleur.Gestion;
import controleur.Profil;

public class Generale extends JFrame implements ActionListener
{
	private JMenuBar uneBarre = new JMenuBar();
	private JMenu mnFichier = new JMenu("Fichier");
	private JMenu mnGestion = new JMenu("Gestion");
	private JMenu mnAide = new JMenu("Aide");
	
	//private JMenuItem itmProfil = new JMenuItem("Profil");
	private JMenuItem itmModifier = new JMenuItem("Modifier");
	private JMenuItem itmQuitter = new JMenuItem("Quitter");
	
	private JMenuItem itemLister = new JMenuItem("Lister Clients");
	
	
	private VueClients uneVueClient = new VueClients();
	private VueAccueil uneVueAccueil ;
	
	public Generale(Profil unProfil)
	{
		ImageIcon logo = new ImageIcon(new ImageIcon("src/images/choosemyday_logo.png").getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
		
		this.setIconImage(logo.getImage());
		this.setTitle("Accueil");
		this.setBounds(200, 200, 430, 450);
		this.getContentPane().setBackground(new Color(254, 231, 240));
		
		this.setLayout(null);
		this.setResizable(false);
		
		this.uneVueAccueil = new VueAccueil(unProfil);
		this.add(uneVueAccueil);
		
		this.add(uneVueClient);
		
		
		this.uneBarre.add(this.mnFichier);
		this.uneBarre.add(this.mnGestion);
		this.uneBarre.add(this.mnAide);
		
		this.mnFichier.add(this.itmQuitter);
		this.mnGestion.add(this.itmModifier);
		
		this.mnGestion.add(this.itemLister);
		
		this.itemLister.addActionListener(this);
		
		this.itmQuitter.addActionListener(this);
		this.itmModifier.addActionListener(this);
		//this.itmProfil.addActionListener(this);
		
		this.setJMenuBar(this.uneBarre);
		
		JLabel lbTitre = new JLabel("Accueil");
		lbTitre.setBounds(170, 10, 110, 20);
		lbTitre.setFont(new Font(lbTitre.getText(), Font.PLAIN, 20));
		this.add(lbTitre);
		
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource() == this.itmQuitter)
		{
			Gestion.rendreVisible(true);
			
			this.setVisible(false);
		}
		else if (e.getSource()==this.itemLister)
		{
			//rendre visible panel Clients 
			uneVueAccueil.setVisible(false);
			uneVueClient.setVisible(true);
			
		}
	}
	
	
}
